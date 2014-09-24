package com.palm.generator.mysql.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.palm.generator.mysql.bean.Tables;
import com.palm.generator.mysql.service.TablesService;
import com.palm.generator.util.BaseGenerator;
import com.palm.generator.util.DaoServiceGenerator;
import com.palm.generator.util.TableConfig;

/**
 * 
 * @author weixiang.qin
 * 
 */
@Component("mysqlGenerator")
public class MysqlGenerator extends BaseGenerator{
	@Resource
	private TablesService tablesService;
	@Resource
	private TableConfig tableConfig;
	@Resource
	private MysqlBeanGenerator mysqlBeanGenerator;
	@Resource
	private DaoServiceGenerator daoServiceGenerator;
	private Map<String, String> maps;
	private List<Tables> tables;
	
	public void generate() throws Exception {
		tables = tablesService.queryAllTables(tableConfig.getTableSchema());
		maps = tableConfig.getTables();
		validateTableNames();
		Set<String> keys = maps.keySet();
		for (String key : keys) {
			String value = maps.get(key);
			System.out.println("start generate " + value);
			String comments = getComments(getMysqlComments(key));
			mysqlBeanGenerator.createBean(comments + "实体类", key, value);
			daoServiceGenerator.createDao(comments + "Dao接口", value, value + "Dao");
			daoServiceGenerator.createDaoImpl(comments + "Dao接口实现", value, value + "Dao", value + "DaoImpl");
			daoServiceGenerator.createService(comments + "Service接口", value, value + "Service");
			daoServiceGenerator.createServiceImpl(comments + "Service接口实现", value, value + "Service", value + "ServiceImpl");
		}
	}
	
	private void validateTableNames() throws Exception {
		List<String> tableNames = getTableNames();
		Set<String> keys = maps.keySet();
		for (String key : keys) {
			if (tableNames.contains(key)) {
				continue;
			} else {
				throw new Exception("table name does not exists." + key);
			}
		}
	}
	
	private List<String> getTableNames(){
		List<String> tableNames = new ArrayList<String>();
		for(Tables table : tables){
			tableNames.add(table.getTableName());
		}
		return tableNames;
	}
	
	private String getMysqlComments(String tableName){
		for(Tables table : tables){
			if(table.getTableName().equals(tableName)){
				return table.getTableComment();
			}
		}
		return null;
	}
}
