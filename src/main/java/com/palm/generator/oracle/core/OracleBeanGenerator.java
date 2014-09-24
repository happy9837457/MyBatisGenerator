package com.palm.generator.oracle.core;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.palm.generator.oracle.bean.UserColComments;
import com.palm.generator.oracle.bean.UserTabColumns;
import com.palm.generator.oracle.service.UserColCommentsService;
import com.palm.generator.oracle.service.UserTabColumnsService;
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
@Component("oracleBeanGenerator")
public class OracleBeanGenerator extends BaseGenerator{
	@Resource
	private TableConfig tableConfig;
	@Resource
	private UserTabColumnsService userTabColumnsService;
	@Resource
	private UserColCommentsService userColCommentsService;
	@Resource
	private JavaTypeResolver javaTypeResolver;
	@Resource
	private NameResolver nameResolver;
	@Resource
	private GetterAndSetterResolver getterAndSetterResolver;

	public void createBean(String comments, String tableName, String beanName) {
		List<UserTabColumns> userTabColumns = userTabColumnsService
				.queryUserTabColumns(tableName);
		Set<String> typeSets = new HashSet<String>();
		for (UserTabColumns userTabColumn : userTabColumns) {
			typeSets.add(javaTypeResolver.getOracleJavaType(
					userTabColumn.getDataType(),
					userTabColumn.getDataScale(),
					userTabColumn.getDataPrecision()));
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
		sb.append("\r\n");
		sb.append(getClassComments(comments, tableConfig.getAuthor()));
		sb.append("\r\n");
		sb.append("public class " + beanName + " {").append("\r\n");
		for (UserTabColumns userTabColumn : userTabColumns) {
			UserColComments userColComments = userColCommentsService
					.queryUserColComments(tableName,
							userTabColumn.getColumnName());
			String type = javaTypeResolver.getOracleJavaType(
					userTabColumn.getDataType(),
					userTabColumn.getDataScale(),
					userTabColumn.getDataPrecision());
			String name = nameResolver.getName(userTabColumn.getColumnName());
			sb.append("\t").append("private ")
					.append(type)
					.append(" ")
					.append(name)
					.append(";")
					.append("// ").append(getComments(userColComments.getComments()))
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
