package com.palm.generator.mysql.core;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.palm.generator.mysql.bean.Columns;
import com.palm.generator.mysql.service.ColumnsService;
import com.palm.generator.util.BaseGenerator;
import com.palm.generator.util.FileUtil;
import com.palm.generator.util.GetterAndSetterResolver;
import com.palm.generator.util.JavaTypeResolver;
import com.palm.generator.util.NameResolver;
import com.palm.generator.util.TableConfig;

/**
 * 
 * @author weixiang.qin
 * 
 */
@Component("mysqlBeanGenerator")
public class MysqlBeanGenerator extends BaseGenerator{
	@Resource
	private TableConfig tableConfig;
	@Resource
	private ColumnsService columnsService;
	@Resource
	private JavaTypeResolver javaTypeResolver;
	@Resource
	private NameResolver nameResolver;
	@Resource
	private GetterAndSetterResolver getterAndSetterResolver;

	public void createBean(String comments, String tableName, String beanName) {
		List<Columns> columns = columnsService.queryAllColumns(tableConfig.getTableSchema(), tableName);
		Set<String> typeSets = new HashSet<String>();
		for (Columns column : columns) {
			typeSets.add(javaTypeResolver.getMysqlJavaType(
					column.getDataType(),
					column.getNumericScale(),
					column.getNumericPrecision()));
		}
		StringBuffer sb = new StringBuffer();
		StringBuffer gsSb = new StringBuffer();
		sb.append("package " + tableConfig.getBeanPackage() + ";");
		sb.append("\r\n").append("\r\n");
		if (typeSets.contains("Date")) {
			sb.append("import ").append("java.util.Date;").append("\r\n");
		}
		if (typeSets.contains("BigDecimal")) {
			sb.append("import ").append("java.math.BigDecimal;").append("\r\n");
		}
		if(typeSets.contains("BigInteger")){
			sb.append("import ").append("java.math.BigInteger;").append("\r\n");
		}
		sb.append("\r\n");
		sb.append(getClassComments(comments, tableConfig.getAuthor()));
		sb.append("\r\n");
		sb.append("public class " + beanName + " {").append("\r\n");
		for (Columns column : columns) {
			String type = javaTypeResolver.getMysqlJavaType(
					column.getDataType(),
					column.getNumericScale(),
					column.getNumericPrecision());
			String name = nameResolver.getName(column.getColumnName());
			sb.append("\t").append("private ")
					.append(type)
					.append(" ")
					.append(name)
					.append(";")
					.append("// ").append(getComments(column.getColumnComment()))
					.append("\r\n");
			gsSb.append(getterAndSetterResolver.createMethod(type, name)).append("\r\n").append("\r\n");
		}
		sb.append("\r\n");
		sb.append(gsSb);
		sb.append("}");
		FileUtil.write(
				getSrcPath(tableConfig.getGeneratorPath(),
						tableConfig.getBeanPackage(), beanName),
				sb.toString());
	}
	
}
