package com.palm.generator.oracle.service;

import java.util.List;

import com.palm.generator.oracle.bean.UserTabColumns;

/**
 * UserTabColumnsService接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserTabColumnsService {
	/**
	 * 
	 * @param tableName
	 * @return
	 */
	public List<UserTabColumns> queryUserTabColumns(String tableName);
}
