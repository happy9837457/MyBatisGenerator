package com.palm.generator.mysql.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.generator.mysql.bean.Columns;
import com.palm.generator.mysql.dao.ColumnsDao;
import com.palm.generator.mysql.service.ColumnsService;

@Service("columnsService")
public class ColumnsServiceImpl implements ColumnsService {
	@Resource
	private ColumnsDao columnsDao;

	@Override
	public List<Columns> queryAllColumns(String tableSchema, String tableName) {
		return columnsDao.queryAllColumns(tableSchema, tableName);
	}

}
