package io.gs2.realtime.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.realtime.Gs2Realtime;

/**
 * ギャザリングプールの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteGatheringPoolRequest extends Gs2BasicRequest<DeleteGatheringPoolRequest> {

	public static class Constant extends Gs2Realtime.Constant {
		public static final String FUNCTION = "DeleteGatheringPool";
	}
	
	/** ギャザリングプール名 */
	String gatheringPoolName;
	
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
	public DeleteGatheringPoolRequest withGatheringPoolName(String gatheringPoolName) {
		setGatheringPoolName(gatheringPoolName);
		return this;
	}
}
