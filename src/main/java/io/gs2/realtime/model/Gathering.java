package io.gs2.realtime.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ギャザリング
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Gathering implements Serializable {

	/** ギャザリングID */
	String gatheringId;
	/** オーナーID */
	String ownerId;
	/** ギャザリング名 */
	String name;
	/** ホストID */
	String hostId;
	/** IPアドレス */
	String ipAddress;
	/** 待ち受けポート */
	Integer port;
	/** 暗号鍵 */
	String secret;
	/** 参加ユーザIDリスト */
	List<String> userIds;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * ギャザリングIDを取得
	 * 
	 * @return ギャザリングID
	 */
	public String getGatheringId() {
		return gatheringId;
	}
	
	/**
	 * ギャザリングIDを設定
	 * 
	 * @param gatheringId ギャザリングID
	 */
	public void setGatheringId(String gatheringId) {
		this.gatheringId = gatheringId;
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
	 * ギャザリング名を取得
	 * 
	 * @return ギャザリング名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ギャザリング名を設定
	 * 
	 * @param name ギャザリング名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ホストIDを取得
	 * 
	 * @return ホストID
	 */
	public String getHostId() {
		return hostId;
	}
	
	/**
	 * ホストIDを設定
	 * 
	 * @param hostId ホストID
	 */
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	
	/**
	 * IPアドレスを取得
	 * 
	 * @return IPアドレス
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	
	/**
	 * IPアドレスを設定
	 * 
	 * @param ipAddress IPアドレス
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	/**
	 * 待ち受けポートを取得
	 * 
	 * @return 待ち受けポート
	 */
	public Integer getPort() {
		return port;
	}
	
	/**
	 * 待ち受けポートを設定
	 * 
	 * @param port 待ち受けポート
	 */
	public void setPort(Integer port) {
		this.port = port;
	}
	
	/**
	 * 暗号鍵を取得
	 * 
	 * @return 暗号鍵
	 */
	public String getSecret() {
		return secret;
	}
	
	/**
	 * 暗号鍵を設定
	 * 
	 * @param secret 暗号鍵
	 */
	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	/**
	 * 参加ユーザIDリストを取得
	 * 
	 * @return 参加ユーザIDリスト
	 */
	public List<String> getUserIds() {
		return userIds;
	}
	
	/**
	 * 参加ユーザIDリストを設定
	 * 
	 * @param userIds 参加ユーザIDリスト
	 */
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
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
