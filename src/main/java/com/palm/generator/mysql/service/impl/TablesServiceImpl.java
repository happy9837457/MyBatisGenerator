package com.palm.generator.mysql.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.generator.mysql.bean.Tables;
import com.palm.generator.mysql.dao.TablesDao;
import com.palm.generator.mysql.service.TablesService;

@Service("tablesService")
public class TablesServiceImpl implements TablesService {
	@Resource
	private TablesDao tablesDao;

	@Override
	public List<Tables> queryAllTables(String tableSchema) {
		return tablesDao.queryAllTables(tableSchema);
	}

}
