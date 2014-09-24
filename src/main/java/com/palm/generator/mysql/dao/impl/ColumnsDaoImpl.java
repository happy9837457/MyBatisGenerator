package com.palm.generator.mysql.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.generator.mysql.bean.Columns;
import com.palm.generator.mysql.dao.ColumnsDao;

@Repository("columnsDao")
public class ColumnsDaoImpl implements ColumnsDao{
	@Resource
	private SqlSessionTemplate sqlSessionTemplate2;

	@Override
	public List<Columns> queryAllColumns(String tableSchema, String tableName) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("tableSchema", tableSchema);
		params.put("tableName", tableName);
		return sqlSessionTemplate2.selectList("Columns.queryAllColumns", params);
	}

}
