package com.palm.generator.mysql.dao;

import java.util.List;

import com.palm.generator.mysql.bean.Tables;

public interface TablesDao {
	/**
	 * 
	 * @param tableSchema
	 * @return
	 */
	public List<Tables> queryAllTables(String tableSchema);
}
