package com.palm.generator.oracle.service;

import com.palm.generator.oracle.bean.UserColComments;

/**
 * UserColCommentsService接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserColCommentsService {
	/**
	 * 
	 * @param tableName
	 * @param columnName
	 * @return
	 */
	public UserColComments queryUserColComments(String tableName,
			String columnName);
}
