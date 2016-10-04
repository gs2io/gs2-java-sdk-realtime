package io.gs2.realtime.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.realtime.model.Gathering;

/**
 * ギャザリングの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateGatheringResult {
	
	Gathering item;
	
	/**
	 * ギャザリングを取得。
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
	
	/**
	 * ギャザリングを設定。
	 * 
	 * @param item ギャザリング
	 * @return this
	 */
	public CreateGatheringResult withItem(Gathering item) {
		setItem(item);
		return this;
	}
}
