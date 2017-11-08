/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.realtime;

import java.util.ArrayList;
import java.util.List;

import io.gs2.util.EncodingUtil;
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
import io.gs2.realtime.control.*;

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
	 * ギャザリングを作成します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public CreateGatheringResult createGathering(CreateGatheringRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("userIds", request.getUserIds())
				.put("name", request.getName());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + (request.getGatheringPoolName() == null ? "null" : request.getGatheringPoolName()) + "/gathering",
				credential,
				ENDPOINT,
				CreateGatheringRequest.Constant.MODULE,
				CreateGatheringRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(post, CreateGatheringResult.class);

	}


	/**
	 * ギャザリングプールを新規作成します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
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
	 * ギャザリングを削除します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */

	public void deleteGathering(DeleteGatheringRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + (request.getGatheringPoolName() == null ? "null" : request.getGatheringPoolName()) + "/gathering/" + (request.getGatheringName() == null ? "null" : request.getGatheringName()) + "";



		HttpDelete delete = createHttpDelete(
				url,
				credential,
				ENDPOINT,
				DeleteGatheringRequest.Constant.MODULE,
				DeleteGatheringRequest.Constant.FUNCTION);


		doRequest(delete, null);

	}


	/**
	 * ギャザリングプールを削除します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */

	public void deleteGatheringPool(DeleteGatheringPoolRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + (request.getGatheringPoolName() == null ? "null" : request.getGatheringPoolName()) + "";



		HttpDelete delete = createHttpDelete(
				url,
				credential,
				ENDPOINT,
				DeleteGatheringPoolRequest.Constant.MODULE,
				DeleteGatheringPoolRequest.Constant.FUNCTION);


		doRequest(delete, null);

	}


	/**
	 * ギャザリングの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeGatheringResult describeGathering(DescribeGatheringRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + (request.getGatheringPoolName() == null ? "null" : request.getGatheringPoolName()) + "/gathering";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


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
	 * ギャザリングプールの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeGatheringPoolResult describeGatheringPool(DescribeGatheringPoolRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


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
	 * ギャザリングを取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetGatheringResult getGathering(GetGatheringRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + (request.getGatheringPoolName() == null ? "null" : request.getGatheringPoolName()) + "/gathering/" + (request.getGatheringName() == null ? "null" : request.getGatheringName()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetGatheringRequest.Constant.MODULE,
				GetGatheringRequest.Constant.FUNCTION);


		return doRequest(get, GetGatheringResult.class);

	}


	/**
	 * ギャザリングプールを取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetGatheringPoolResult getGatheringPool(GetGatheringPoolRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + (request.getGatheringPoolName() == null ? "null" : request.getGatheringPoolName()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetGatheringPoolRequest.Constant.MODULE,
				GetGatheringPoolRequest.Constant.FUNCTION);


		return doRequest(get, GetGatheringPoolResult.class);

	}


	/**
	 * ギャザリングプールを更新します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public UpdateGatheringPoolResult updateGatheringPool(UpdateGatheringPoolRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription());

		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/gatheringPool/" + (request.getGatheringPoolName() == null ? "null" : request.getGatheringPoolName()) + "",
				credential,
				ENDPOINT,
				UpdateGatheringPoolRequest.Constant.MODULE,
				UpdateGatheringPoolRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(put, UpdateGatheringPoolResult.class);

	}


}