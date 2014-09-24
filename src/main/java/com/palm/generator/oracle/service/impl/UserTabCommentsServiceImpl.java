package com.palm.generator.oracle.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.generator.oracle.bean.UserTabComments;
import com.palm.generator.oracle.dao.UserTabCommentsDao;
import com.palm.generator.oracle.service.UserTabCommentsService;

/**
 * UserTabCommentsService接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Service("userTabCommentsService")
public class UserTabCommentsServiceImpl implements UserTabCommentsService {
	@Resource
	private UserTabCommentsDao userTabCommentsDao;

	@Override
	public UserTabComments queryUserTabComments(String tableName) {
		return userTabCommentsDao.queryUserTabComments(tableName);
	}

}
