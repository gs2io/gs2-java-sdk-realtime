package io.gs2.realtime.control;

import java.util.List;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.realtime.Gs2Realtime;

/**
 * ギャザリングの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateGatheringRequest extends Gs2BasicRequest<CreateGatheringRequest> {

	public static class Constant extends Gs2Realtime.Constant {
		public static final String FUNCTION = "CreateGathering";
	}

	/** ギャザリングプール名 */
	String gatheringPoolName;
	/** ギャザリング名 */
	String name;
	/** 参加を許可するユーザIDリスト */
	List<String> userIds;

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
	public CreateGatheringRequest withGatheringPoolName(String gatheringPoolName) {
		setGatheringPoolName(gatheringPoolName);
		return this;
	}
	/**
	 * ギャザリング名を取得。
	 * 
	 * @return ギャザリング名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ギャザリング名を設定。
	 * 
	 * @param name ギャザリング名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ギャザリング名を設定。
	 * 
	 * @param name ギャザリング名
	 * @return this
	 */
	public CreateGatheringRequest withName(String name) {
		setName(name);
		return this;
	}
	
	/**
	 * 参加を許可するユーザIDリストを取得。
	 * 
	 * @return 参加を許可するユーザIDリスト
	 */
	public List<String> getUserIds() {
		return userIds;
	}
	
	/**
	 * 参加を許可するユーザIDリストを設定。
	 * 
	 * @param userIds 参加を許可するユーザIDリスト
	 */
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
	
	/**
	 * 参加を許可するユーザIDリストを設定。
	 * 
	 * @param userIds 参加を許可するユーザIDリスト
	 * @return this
	 */
	public CreateGatheringRequest withUserIds(List<String> userIds) {
		setUserIds(userIds);
		return this;
	}
}
