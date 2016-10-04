package io.gs2.realtime.control;

import io.gs2.realtime.model.GatheringPool;

/**
 * ギャザリングプールの更新結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class UpdateGatheringPoolResult {
	
	GatheringPool item;
	
	/**
	 * ギャザリングプールを取得。
	 * 
	 * @return ギャザリングプール
	 */
	public GatheringPool getItem() {
		return item;
	}
	
	/**
	 * ギャザリングプールを設定。
	 * 
	 * @param item ギャザリングプール
	 */
	public void setItem(GatheringPool item) {
		this.item = item;
	}
	
	/**
	 * ギャザリングプールを設定。
	 * 
	 * @param item ギャザリングプール
	 * @return this
	 */
	public UpdateGatheringPoolResult withItem(GatheringPool item) {
		setItem(item);
		return this;
	}
}
