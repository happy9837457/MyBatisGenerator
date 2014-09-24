package com.palm.generator.mysql.service;

import java.util.List;

import com.palm.generator.mysql.bean.Columns;

public interface ColumnsService {
	/**
	 * 
	 * @param tableSchema
	 * @param tableName
	 * @return
	 */
	public List<Columns> queryAllColumns(String tableSchema, String tableName);
}
