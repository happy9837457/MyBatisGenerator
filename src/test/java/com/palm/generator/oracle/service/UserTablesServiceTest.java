package com.palm.generator.oracle.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.palm.generator.util.NameResolver;
import com.palm.generator.util.TableConfig;
import com.palm.generator.util.SpringHelper;
import com.palm.generator.util.StringUtil;

public class UserTablesServiceTest {
	private TableConfig tableConfig;
	private UserTablesService userTablesService;
	private NameResolver nameResolver;

	@Before
	public void setUp() throws Exception {
		tableConfig = SpringHelper.getBean("tableConfig");
		userTablesService = SpringHelper.getBean("userTablesService");
		nameResolver = SpringHelper.getBean("nameResolver");
	}

//	@Test
	public void testQueryAllUserTableNames() {
		List<String> userTables = userTablesService.queryAllUserTableNames();
		System.out.println(userTables.size());
	}

//	@Test
	public void testQueryTableNames() {
		List<String> userTables = userTablesService.queryAllUserTableNames();
		for (String userTable : userTables) {
			System.out.println("<entry key=\""
					+ userTable
					+ "\" value=\""
					+ StringUtil.toUpperCaseFirstOne(nameResolver
							.getName(userTable)) + "\" />");
		}
	}
	
	@Test
	public void testGenMyBatis(){
		List<String> userTables = userTablesService.queryAllUserTableNames();
		Map<String, String> map = tableConfig.getTables();
		Set<String> keySets = map.keySet();
		for (String userTable : userTables) {
			if(keySets.contains(userTable)){
				String value = map.get(userTable);
				System.out.println("<typeAlias alias=\"" + value + "\" type=\""+ tableConfig.getBeanPackage() +"." + value + "\" />");
			}
		}
		for (String userTable : userTables) {
			if(keySets.contains(userTable)){
				String value = map.get(userTable);
				System.out.println("<mapper resource=\"mybatis/oracle/" + value + ".xml\" />");
			}
		}
	}

	@After
	public void tearDown() throws Exception {
	}

}
