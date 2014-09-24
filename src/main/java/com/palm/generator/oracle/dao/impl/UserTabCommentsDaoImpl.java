package com.palm.generator.oracle.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.generator.oracle.bean.UserTabComments;
import com.palm.generator.oracle.dao.UserTabCommentsDao;
/**
 * 
 * @author weixiang.qin
 *
 */
@Repository("userTabCommentsDao")
public class UserTabCommentsDaoImpl implements UserTabCommentsDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public UserTabComments queryUserTabComments(String tableName) {
		return sqlSessionTemplate.selectOne(
				"UserTabComments.queryUserTabComments", tableName);
	}

}
