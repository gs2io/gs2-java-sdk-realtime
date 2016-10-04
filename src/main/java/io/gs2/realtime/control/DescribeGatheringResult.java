package io.gs2.realtime.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.realtime.model.Gathering;

/**
 * ギャザリング一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeGatheringResult {

	/** ギャザリング一覧 */
	List<Gathering> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したギャザリング数を取得。
	 * 
	 * @return 取得したギャザリング数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したギャザリング一覧を取得。
	 * 
	 * @return ギャザリング一覧
	 */
	public List<Gathering> getItems() {
		return items;
	}
	
	/**
	 * ギャザリング一覧を設定。
	 * 
	 * @param items ギャザリング一覧
	 */
	public void setItems(List<Gathering> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeGatheringRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
