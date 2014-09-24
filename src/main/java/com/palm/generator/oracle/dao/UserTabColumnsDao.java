package com.palm.generator.oracle.dao;

import java.util.List;

import com.palm.generator.oracle.bean.UserTabColumns;

/**
 * UserTabColumnsDao接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserTabColumnsDao {
	/**
	 * 
	 * @param tableName
	 * @return
	 */
	public List<UserTabColumns> queryUserTabColumns(String tableName);
}
