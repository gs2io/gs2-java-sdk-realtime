package io.gs2.realtime.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.realtime.Gs2Realtime;

/**
 * ギャザリングの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteGatheringRequest extends Gs2BasicRequest<DeleteGatheringRequest> {

	public static class Constant extends Gs2Realtime.Constant {
		public static final String FUNCTION = "DeleteGathering";
	}

	/** ギャザリングプール名 */
	String gatheringPoolName;
	/** ギャザリング名 */
	String gatheringName;

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
	public DeleteGatheringRequest withGatheringPoolName(String gatheringPoolName) {
		setGatheringPoolName(gatheringPoolName);
		return this;
	}
	
	/**
	 * ギャザリング名を取得。
	 * 
	 * @return ギャザリング名
	 */
	public String getGatheringName() {
		return gatheringName;
	}
	
	/**
	 * ギャザリング名を設定。
	 * 
	 * @param gatheringName ギャザリング名
	 */
	public void setGatheringName(String gatheringName) {
		this.gatheringName = gatheringName;
	}
	
	/**
	 * ギャザリング名を設定。
	 * 
	 * @param gatheringName ギャザリング名
	 * @return this
	 */
	public DeleteGatheringRequest withGatheringName(String gatheringName) {
		setGatheringName(gatheringName);
		return this;
	}
}
