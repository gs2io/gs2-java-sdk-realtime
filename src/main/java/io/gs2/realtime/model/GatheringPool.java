package io.gs2.realtime.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ギャザリングプール
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class GatheringPool implements Serializable {

	/** ギャザリングプールID */
	String gatheringPoolId;
	/** オーナーID */
	String ownerId;
	/** ギャザリングプール名 */
	String name;
	/** 説明文 */
	String description;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * ギャザリングプールIDを取得
	 * 
	 * @return ギャザリングプールID
	 */
	public String getGatheringPoolId() {
		return gatheringPoolId;
	}
	
	/**
	 * ギャザリングプールIDを設定
	 * 
	 * @param gatheringPoolId ギャザリングプールID
	 */
	public void setGatheringPoolId(String gatheringPoolId) {
		this.gatheringPoolId = gatheringPoolId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * ギャザリングプール名を取得
	 * 
	 * @return ギャザリングプール名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ギャザリングプール名を設定
	 * 
	 * @param name ギャザリングプール名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 説明文を取得
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}
