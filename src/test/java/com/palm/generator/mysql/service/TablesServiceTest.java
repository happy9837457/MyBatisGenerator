package com.palm.generator.mysql.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.palm.generator.mysql.bean.Tables;
import com.palm.generator.util.NameResolver;
import com.palm.generator.util.SpringHelper;
import com.palm.generator.util.StringUtil;
import com.palm.generator.util.TableConfig;

public class TablesServiceTest {
	private TableConfig tableConfig;
	private TablesService tablesService;
	private NameResolver nameResolver;

	@Before
	public void setUp() throws Exception {
		tableConfig = SpringHelper.getBean("tableConfig");
		tablesService = SpringHelper.getBean("tablesService");
		nameResolver = SpringHelper.getBean("nameResolver");
	}

//	@Test
	public void testQueryAllTables() {
		List<Tables> tables = tablesService.queryAllTables(tableConfig.getTableSchema());
		System.out.println(tables.size());
	}
	
//	@Test
	public void testQueryTableNames() {
		List<Tables> tables = tablesService.queryAllTables(tableConfig.getTableSchema());
		for (Tables table : tables) {
			System.out.println("<entry key=\""
					+ table.getTableName()
					+ "\" value=\""
					+ StringUtil.toUpperCaseFirstOne(nameResolver
							.getName(table.getTableName())) + "\" />");
		}
	}
	
	@Test
	public void testGenMyBatis(){
		List<Tables> tables = tablesService.queryAllTables(tableConfig.getTableSchema());
		Map<String, String> map = tableConfig.getTables();
		Set<String> keySets = map.keySet();
		for (Tables table : tables) {
			if(keySets.contains(table.getTableName())){
				String value = map.get(table.getTableName());
				System.out.println("<typeAlias alias=\"" + value + "\" type=\""+ tableConfig.getBeanPackage() +"." + value + "\" />");
			}
		}
		for (Tables table : tables) {
			if(keySets.contains(table.getTableName())){
				String value = map.get(table.getTableName());
				System.out.println("<mapper resource=\"mybatis/mysql/" + value + ".xml\" />");
			}
		}
	}

	@After
	public void tearDown() throws Exception {
	}

}
