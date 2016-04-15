package com.csm.straining.dataaccess.caps.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csm.straining.common.exception.CoreException;
import com.csm.straining.common.i.Status;
import com.csm.straining.dataaccess.Dao;
import com.csm.straining.dataaccess.DbConfig;
import com.csm.straining.dataaccess.entity.user.User;
import com.csm.straining.dataaccess.entity.user.UserExample;
import com.csm.straining.dataaccess.mapper.user.UserMapper;


/**
 * @author chensongming
 */
public class UserCaps {
	
	private static final Logger logger = LoggerFactory.getLogger(UserCaps.class);
	
	public static User insertUser(User domain) throws CoreException {
		
		Dao<UserMapper> dao = null;
		
		try {
			dao = DbConfig.openSessionMaster(UserMapper.class);
			dao.mapper().insertSelective(domain);
		} catch (Exception e) {
			logger.debug("[UserCaps] insertUser : ", e);
			throw new CoreException(CoreException.DATABASE, e);
		} finally {
			if (dao != null) {
				dao.close();
			}
		}
		
		return domain;
	}
	
	public static User getUserByID(long userID) throws CoreException {
		Dao<UserMapper> dao = null;
		
		try {
			dao = DbConfig.openSessionMaster(UserMapper.class);
			return dao.mapper().selectByPrimaryKey(userID);
		} catch (Exception e) {
			logger.debug("[UserCaps] getUserByID : ", e);
			throw new CoreException(CoreException.DATABASE, e);
		} finally {
			if (dao != null) {
				dao.close();
			}
		}
	}
	
	public static User getUserByPhone(String phone) throws CoreException {
		Dao<UserMapper> dao = null;
		
		try {
			dao = DbConfig.openSessionMaster(UserMapper.class);
			
			UserExample exp = new UserExample();
			UserExample.Criteria criteria = exp.createCriteria();
			
			criteria.andPhoneEqualTo(phone);
			criteria.andStatusEqualTo(Status.User.NORMAL);
			exp.setLimit(1);
			
			List<User> res = dao.mapper().selectByExample(exp);
			
			return (res != null && !res.isEmpty()) ? res.get(0) : null;
		} catch (Exception e) {
			logger.debug("[UserCaps] getUserByID : ", e);
			throw new CoreException(CoreException.DATABASE, e);
		} finally {
			if (dao != null) {
				dao.close();
			}
		}
	}

}