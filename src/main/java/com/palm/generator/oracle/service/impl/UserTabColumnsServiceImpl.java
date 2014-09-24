package com.palm.generator.oracle.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.generator.oracle.bean.UserTabColumns;
import com.palm.generator.oracle.dao.UserTabColumnsDao;
import com.palm.generator.oracle.service.UserTabColumnsService;

/**
 * UserTabColumnsService接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Service("userTabColumnsService")
public class UserTabColumnsServiceImpl implements UserTabColumnsService {
	@Resource
	private UserTabColumnsDao userTabColumnsDao;

	@Override
	public List<UserTabColumns> queryUserTabColumns(String tableName) {
		return userTabColumnsDao.queryUserTabColumns(tableName);
	}

}
