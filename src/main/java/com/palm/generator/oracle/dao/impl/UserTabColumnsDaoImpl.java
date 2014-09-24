package com.palm.generator.oracle.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.generator.oracle.bean.UserTabColumns;
import com.palm.generator.oracle.dao.UserTabColumnsDao;
/**
 * 
 * @author weixiang.qin
 *
 */
@Repository("userTabColumnsDao")
public class UserTabColumnsDaoImpl implements UserTabColumnsDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<UserTabColumns> queryUserTabColumns(String tableName) {
		return sqlSessionTemplate.selectList(
				"UserTabColumns.queryUserTabColumns", tableName);
	}

}
