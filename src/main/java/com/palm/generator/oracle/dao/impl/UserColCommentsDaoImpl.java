package com.palm.generator.oracle.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.generator.oracle.bean.UserColComments;
import com.palm.generator.oracle.dao.UserColCommentsDao;
/**
 * 
 * @author weixiang.qin
 *
 */
@Repository("userColCommentsDao")
public class UserColCommentsDaoImpl implements UserColCommentsDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public UserColComments queryUserColComments(String tableName,
			String columnName) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("tableName", tableName);
		params.put("columnName", columnName);
		return sqlSessionTemplate.selectOne("UserColComments.queryUserColComments", params);
	}

}
