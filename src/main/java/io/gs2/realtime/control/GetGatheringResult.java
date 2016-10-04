package io.gs2.realtime.control;

import io.gs2.realtime.model.Gathering;

/**
 * ギャザリング取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class GetGatheringResult {

	/** ギャザリング */
	Gathering item;
	
	/**
	 * 取得したギャザリングを取得。
	 * 
	 * @return ギャザリング
	 */
	public Gathering getItem() {
		return item;
	}
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 */
	public void setItem(Gathering item) {
		this.item = item;
	}
}
