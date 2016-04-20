package com.csm.straining.common.i.user;

import java.util.List;
import java.util.Set;

import com.csm.straining.common.exception.AppException;
import com.csm.straining.common.exception.CoreException;
import com.csm.straining.common.i.contact.entity.GroupEntity;
import com.csm.straining.common.i.user.entity.UserEntity;
import com.csm.straining.common.i.user.params.UserParams;


/**
 * @author chensongming
 */
public interface UserService {

	
	/** --------------------User------------------ **/
	
	/**
	 * 插入用户
	 * 
	 * @param params
	 * @return
	 * @throws AppException 
	 * @throws CoreException 
	 */
	UserEntity createUserAccount(String phone, String password) throws CoreException, AppException;
	
	
	/**
	 * 根据用户ID获取用户
	 * 
	 * @param userID
	 * @return
	 * @throws CoreException 
	 */
	UserEntity getUserByID(long userID) throws CoreException;
	
	/**
	 * 注册电话登录
	 * 
	 * @param phone
	 * @param password
	 * @return
	 * @throws CoreException
	 * @throws AppException
	 */
	long loginByPhonePwd(String phone, String password) throws CoreException, AppException;
	
	/**
	 * 更新用户资料
	 * 
	 * @param user
	 */
	void updateUserDetail(UserParams params) throws CoreException;
	
	
	/** --------------------Contact------------------ **/
	void follow(long userID, long followUserID) throws AppException, CoreException;
	
	void unfollow(long userID, long followUserID) throws AppException, CoreException;
	
	List<Long> getFollowByUser(long userID) throws CoreException;
	
	List<UserEntity> getFollowEntityByUser(long userID) throws CoreException;
	
	boolean isFollow(long userID, long followID) throws CoreException;
	
	GroupEntity createGroup(long userID, Set<Long> memberIDs) throws AppException, CoreException;
	
	GroupEntity getRichGroupByID(long groupID) throws CoreException, AppException;
	
	List<GroupEntity> getSimpleGroupsByUserID(long userID) throws CoreException;
	
	void quitGroup(long userID, long groupID) throws CoreException;
	
	
}
