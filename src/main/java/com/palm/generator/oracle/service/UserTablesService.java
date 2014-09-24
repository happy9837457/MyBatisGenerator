package com.palm.generator.oracle.service;

import java.util.List;

/**
 * UserTablesService接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserTablesService {
	/**
	 * 
	 * @return
	 */
	public List<String> queryAllUserTableNames();
}
