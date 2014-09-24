package com.palm.generator.mysql.service;

import java.util.List;

import com.palm.generator.mysql.bean.Tables;

public interface TablesService {
	/**
	 * 
	 * @param tableSchema
	 * @return
	 */
	public List<Tables> queryAllTables(String tableSchema);
}
