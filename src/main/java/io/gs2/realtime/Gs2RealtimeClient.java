package io.gs2.realtime;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.realtime.control.CreateGatheringPoolRequest;
import io.gs2.realtime.control.CreateGatheringPoolResult;
import io.gs2.realtime.control.CreateGatheringRequest;
import io.gs2.realtime.control.CreateGatheringResult;
import io.gs2.realtime.control.DeleteGatheringPoolRequest;
import io.gs2.realtime.control.DeleteGatheringRequest;
import io.gs2.realtime.control.DescribeGatheringPoolRequest;
import io.gs2.realtime.control.DescribeGatheringPoolResult;
import io.gs2.realtime.control.DescribeGatheringRequest;
import io.gs2.realtime.control.DescribeGatheringResult;
import io.gs2.realtime.control.GetGatheringPoolRequest;
import io.gs2.realtime.control.GetGatheringPoolResult;
import io.gs2.realtime.control.GetGatheringRequest;
import io.gs2.realtime.control.GetGatheringResult;
import io.gs2.realtime.control.UpdateGatheringPoolRequest;
import io.gs2.realtime.control.UpdateGatheringPoolResult;

/**
 * GS2 Realtime API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2RealtimeClient extends AbstractGs2Client<Gs2RealtimeClient> {

	public static String ENDPOINT = "realtime";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2RealtimeClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * ギャザリングプールを作成。<br>
	 * <br>
	 * GS2-Realtime を利用するには、まずギャザリングプールを作成する必要があります。<br>
	 * ギャザリングプールには複数のギャザリングを紐付けることができます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateGatheringPoolResult createGatheringPool(CreateGatheringPoolRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool", 
				credential, 
				ENDPOINT,
				CreateGatheringPoolRequest.Constant.MODULE, 
				CreateGatheringPoolRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateGatheringPoolResult.class);
	}
	
	/**
	 * ギャザリングプール一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ギャザリングプール一覧
	 */
	public DescribeGatheringPoolResult describeGatheringPool(DescribeGatheringPoolRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeGatheringPoolRequest.Constant.MODULE, 
				DescribeGatheringPoolRequest.Constant.FUNCTION);
		return doRequest(get, DescribeGatheringPoolResult.class);
	}

	/**
	 * ギャザリングプールを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ギャザリングプール
	 */
	public GetGatheringPoolResult getGatheringPool(GetGatheringPoolRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + request.getGatheringPoolName(), 
				credential, 
				ENDPOINT,
				GetGatheringPoolRequest.Constant.MODULE, 
				GetGatheringPoolRequest.Constant.FUNCTION);
		return doRequest(get, GetGatheringPoolResult.class);
	}

	/**
	 * ギャザリングプールを作成。
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public UpdateGatheringPoolResult updateGatheringPool(UpdateGatheringPoolRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + request.getGatheringPoolName(), 
				credential, 
				ENDPOINT,
				UpdateGatheringPoolRequest.Constant.MODULE, 
				UpdateGatheringPoolRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateGatheringPoolResult.class);
	}
	
	/**
	 * ギャザリングプールを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteGatheringPool(DeleteGatheringPoolRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + request.getGatheringPoolName(), 
				credential, 
				ENDPOINT,
				DeleteGatheringPoolRequest.Constant.MODULE, 
				DeleteGatheringPoolRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}
	
	/**
	 * ギャザリングを作成。<br>
	 * <br>
	 * ギャザリングを作成すると、ゲームサーバが起動します。<br>
	 * ゲームサーバはWebSocketで接続することができ、同じゲームサーバに接続しているユーザ間でメッセージをやり取りすることができます。<br>
	 * ゲームサーバとの通信プロトコルの説明については別途ドキュメントを確認してください。<br>
	 * <br>
	 * userIds にユーザIDを指定することで、ギャザリングに参加できるユーザのIDを制限することができます。<br>
	 * ギャザリング作成時に参加するユーザが確定している場合は指定してください。<br>
	 * 省略すると、暗号鍵を知っていれば誰でも参加することができます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateGatheringResult createGathering(CreateGatheringRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("userIds", request.getUserIds() == null ? null : String.join(",", request.getUserIds()));
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + request.getGatheringPoolName() + "/gathering", 
				credential, 
				ENDPOINT,
				CreateGatheringRequest.Constant.MODULE, 
				CreateGatheringRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateGatheringResult.class);
	}

	/**
	 * ギャザリング一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ギャザリング一覧
	 */
	public DescribeGatheringResult describeGathering(DescribeGatheringRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + request.getGatheringPoolName() + "/gathering";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeGatheringRequest.Constant.MODULE, 
				DescribeGatheringRequest.Constant.FUNCTION);
		return doRequest(get, DescribeGatheringResult.class);
	}

	/**
	 * ギャザリングを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ギャザリング
	 */
	public GetGatheringResult getGathering(GetGatheringRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + request.getGatheringPoolName() + "/gathering/" + request.getGatheringName();
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				GetGatheringRequest.Constant.MODULE, 
				GetGatheringRequest.Constant.FUNCTION);
		return doRequest(get, GetGatheringResult.class);
	}

	/**
	 * ギャザリングを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteGathering(DeleteGatheringRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + request.getGatheringPoolName() + "/gathering/" + request.getGatheringName(), 
				credential, 
				ENDPOINT,
				DeleteGatheringRequest.Constant.MODULE, 
				DeleteGatheringRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

}
