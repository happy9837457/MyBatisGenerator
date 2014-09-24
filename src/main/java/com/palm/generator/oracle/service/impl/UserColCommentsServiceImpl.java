package com.palm.generator.oracle.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.generator.oracle.bean.UserColComments;
import com.palm.generator.oracle.dao.UserColCommentsDao;
import com.palm.generator.oracle.service.UserColCommentsService;

/**
 * UserColCommentsService接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Service("userColCommentsService")
public class UserColCommentsServiceImpl implements UserColCommentsService {
	@Resource
	private UserColCommentsDao userColCommentsDao;

	@Override
	public UserColComments queryUserColComments(String tableName,
			String columnName) {
		return userColCommentsDao.queryUserColComments(tableName, columnName);
	}

}
