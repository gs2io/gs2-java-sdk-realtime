/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.realtime.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 購読
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Gathering implements Serializable {

	/** ホストGRN */
	private String hostId;

	/** ギャザリング名 */
	private String name;

	/** ホストIPアドレス */
	private String ipAddress;

	/** 参加可能なユーザIDリスト */
	private List<String> userIds;

	/** 通知GRN */
	private String gatheringPoolId;

	/** 暗号鍵 */
	private String secret;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** 購読GRN */
	private String gatheringId;

	/** オーナーID */
	private String ownerId;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;

	/** ホストポート */
	private Integer port;


	/**
	 * ホストGRNを取得
	 *
	 * @return ホストGRN
	 */
	public String getHostId() {
		return hostId;
	}

	/**
	 * ホストGRNを設定
	 *
	 * @param hostId ホストGRN
	 */
	public void setHostId(String hostId) {
		this.hostId = hostId;
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
	 * ホストIPアドレスを取得
	 *
	 * @return ホストIPアドレス
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * ホストIPアドレスを設定
	 *
	 * @param ipAddress ホストIPアドレス
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * 参加可能なユーザIDリストを取得
	 *
	 * @return 参加可能なユーザIDリスト
	 */
	public List<String> getUserIds() {
		return userIds;
	}

	/**
	 * 参加可能なユーザIDリストを設定
	 *
	 * @param userIds 参加可能なユーザIDリスト
	 */
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

	/**
	 * 通知GRNを取得
	 *
	 * @return 通知GRN
	 */
	public String getGatheringPoolId() {
		return gatheringPoolId;
	}

	/**
	 * 通知GRNを設定
	 *
	 * @param gatheringPoolId 通知GRN
	 */
	public void setGatheringPoolId(String gatheringPoolId) {
		this.gatheringPoolId = gatheringPoolId;
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
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	/**
	 * 購読GRNを取得
	 *
	 * @return 購読GRN
	 */
	public String getGatheringId() {
		return gatheringId;
	}

	/**
	 * 購読GRNを設定
	 *
	 * @param gatheringId 購読GRN
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
	 * 最終更新日時(エポック秒)を取得
	 *
	 * @return 最終更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * ホストポートを取得
	 *
	 * @return ホストポート
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * ホストポートを設定
	 *
	 * @param port ホストポート
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

}