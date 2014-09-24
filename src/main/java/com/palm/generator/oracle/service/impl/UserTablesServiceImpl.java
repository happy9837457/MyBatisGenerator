package com.palm.generator.oracle.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.generator.oracle.dao.UserTablesDao;
import com.palm.generator.oracle.service.UserTablesService;

/**
 * UserTablesService接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Service("userTablesService")
public class UserTablesServiceImpl implements UserTablesService {
	@Resource
	private UserTablesDao userTablesDao;

	@Override
	public List<String> queryAllUserTableNames() {
		return userTablesDao.queryAllUserTableNames();
	}

}
