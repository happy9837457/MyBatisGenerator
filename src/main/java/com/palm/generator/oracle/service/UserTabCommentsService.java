package com.palm.generator.oracle.service;

import com.palm.generator.oracle.bean.UserTabComments;

/**
 * UserTabCommentsService接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserTabCommentsService {
	/**
	 * 
	 * @param tableName
	 * @return
	 */
	public UserTabComments queryUserTabComments(String tableName);
}
