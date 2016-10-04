package io.gs2.realtime.control;

import io.gs2.realtime.model.GatheringPool;

/**
 * ギャザリングプールの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class CreateGatheringPoolResult {
	
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
	public CreateGatheringPoolResult withItem(GatheringPool item) {
		setItem(item);
		return this;
	}
}
