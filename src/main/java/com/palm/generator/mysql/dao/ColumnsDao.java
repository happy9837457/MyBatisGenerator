package com.palm.generator.mysql.dao;

import java.util.List;

import com.palm.generator.mysql.bean.Columns;

public interface ColumnsDao {
	/**
	 * 
	 * @param tableSchema
	 * @param tableName
	 * @return
	 */
	public List<Columns> queryAllColumns(String tableSchema, String tableName);
}
