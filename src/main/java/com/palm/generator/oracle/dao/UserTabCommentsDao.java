package com.palm.generator.oracle.dao;

import com.palm.generator.oracle.bean.UserTabComments;

/**
 * UserTabCommentsDao接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserTabCommentsDao {
	/**
	 * 
	 * @param tableName
	 * @return
	 */
	public UserTabComments queryUserTabComments(String tableName);
}
