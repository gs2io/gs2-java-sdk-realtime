package io.gs2.realtime.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.realtime.model.GatheringPool;

/**
 * ギャザリングプール取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetGatheringPoolResult {

	/** ギャザリングプール */
	GatheringPool item;
	
	/**
	 * 取得したギャザリングプールを取得。
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
}
