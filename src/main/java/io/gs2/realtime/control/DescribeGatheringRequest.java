package io.gs2.realtime.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.realtime.Gs2Realtime;

/**
 * ギャザリング一覧の取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeGatheringRequest extends Gs2BasicRequest<DescribeGatheringRequest> {

	public static class Constant extends Gs2Realtime.Constant {
		public static final String FUNCTION = "DescribeGathering";
	}

	/** ギャザリングプール名 */
	String gatheringPoolName;
	/** 取得開始位置トークン */
	String pageToken;
	/** 取得件数 */
	Integer limit;

	/**
	 * ギャザリングプール名を取得。
	 * 
	 * @return ギャザリングプール名
	 */
	public String getGatheringPoolName() {
		return gatheringPoolName;
	}
	
	/**
	 * ギャザリングプール名を設定。
	 * 
	 * @param gatheringPoolName ギャザリングプール名
	 */
	public void setGatheringPoolName(String gatheringPoolName) {
		this.gatheringPoolName = gatheringPoolName;
	}
	
	/**
	 * ギャザリングプール名を設定。
	 * 
	 * @param gatheringPoolName ギャザリングプール名
	 * @return this
	 */
	public DescribeGatheringRequest withGatheringPoolName(String gatheringPoolName) {
		setGatheringPoolName(gatheringPoolName);
		return this;
	}
	
	/**
	 * 取得開始位置トークンを取得。
	 * 
	 * @return 取得開始位置トークン
	 */
	public String getPageToken() {
		return pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 */
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 * @return this
	 */
	public DescribeGatheringRequest withPageToken(String pageToken) {
		setPageToken(pageToken);
		return this;
	}

	/**
	 * 取得件数を取得。
	 * 
	 * @return 取得件数
	 */
	public Integer getLimit() {
		return limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 * @return this
	 */
	public DescribeGatheringRequest withLimit(Integer limit) {
		setLimit(limit);
		return this;
	}
}
