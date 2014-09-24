package com.palm.generator.oracle.dao;

import java.util.List;

/**
 * UserTablesDao接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserTablesDao {
	/**
	 * 
	 * @return
	 */
	public List<String> queryAllUserTableNames();
}
