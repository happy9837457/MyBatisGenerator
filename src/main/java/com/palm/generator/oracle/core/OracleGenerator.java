package com.palm.generator.oracle.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.palm.generator.oracle.bean.UserTabComments;
import com.palm.generator.oracle.service.UserTabCommentsService;
import com.palm.generator.oracle.service.UserTablesService;
import com.palm.generator.util.BaseGenerator;
import com.palm.generator.util.DaoServiceGenerator;
import com.palm.generator.util.TableConfig;

/**
 * 
 * @author weixiang.qin
 * 
 */
@Component("oracleGenerator")
public class OracleGenerator extends BaseGenerator{
	@Resource
	private UserTablesService userTablesService;
	@Resource
	private UserTabCommentsService userTabCommentsService;
	@Resource
	private TableConfig tableConfig;
	@Resource
	private OracleBeanGenerator oracleBeanGenerator;
	@Resource
	private DaoServiceGenerator daoServiceGenerator;
	private List<String> tableNames;
	private Map<String, String> maps;
	
	public void generate() throws Exception {
		tableNames = userTablesService.queryAllUserTableNames();
		maps = tableConfig.getTables();
		validateTableNames();
		Set<String> keys = maps.keySet();
		for (String key : keys) {
			String value = maps.get(key);
			System.out.println("start generate " + value);
			UserTabComments userTabComments = userTabCommentsService
					.queryUserTabComments(key);
			String comments = getComments(userTabComments.getComments());
			oracleBeanGenerator.createBean(comments + "实体类", key, value);
			daoServiceGenerator.createDao(comments + "Dao接口", value, value + "Dao");
			daoServiceGenerator.createDaoImpl(comments + "Dao接口实现", value, value + "Dao", value + "DaoImpl");
			daoServiceGenerator.createService(comments + "Service接口", value, value + "Service");
			daoServiceGenerator.createServiceImpl(comments + "Service接口实现", value, value + "Service", value + "ServiceImpl");
		}
	}
	
	private void validateTableNames() throws Exception {
		Set<String> keys = maps.keySet();
		for (String key : keys) {
			if (tableNames.contains(key)) {
				continue;
			} else {
				throw new Exception("table name does not exists." + key);
			}
		}
	}
	
}
