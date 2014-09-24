package com.palm.generator.mysql.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.generator.mysql.bean.Tables;
import com.palm.generator.mysql.dao.TablesDao;

@Repository("tablesDao")
public class TablesDaoImpl implements TablesDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate2;

	@Override
	public List<Tables> queryAllTables(String tableSchema) {
		return sqlSessionTemplate2.selectList("Tables.queryAllTables",
				tableSchema);
	}

}
