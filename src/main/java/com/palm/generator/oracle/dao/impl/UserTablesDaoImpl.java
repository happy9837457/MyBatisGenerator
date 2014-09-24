package com.palm.generator.oracle.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.generator.oracle.dao.UserTablesDao;
/**
 * 
 * @author weixiang.qin
 *
 */
@Repository("userTablesDao")
public class UserTablesDaoImpl implements UserTablesDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<String> queryAllUserTableNames() {
		return sqlSessionTemplate.selectList("UserTables.queryAllUserTableNames");
	}

}
