package com.palm.generator.oracle.dao;

import com.palm.generator.oracle.bean.UserColComments;

/**
 * UserColCommentsDao接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserColCommentsDao {
	/**
	 * 
	 * @param tableName
	 * @param columnName
	 * @return
	 */
	public UserColComments queryUserColComments(String tableName,
			String columnName);
}
