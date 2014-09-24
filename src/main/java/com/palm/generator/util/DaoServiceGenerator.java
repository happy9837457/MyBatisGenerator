package com.palm.generator.util;

import java.io.File;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("daoServiceGenerator")
public class DaoServiceGenerator extends BaseGenerator {
	@Resource
	private TableConfig tableConfig;
	@Resource
	private MethodGenerator methodGenerator;

//	public void createDaoServices() {
//		Map<String, String> maps = oracleTableConfig.getTables();
//		Collection<String> values = maps.values();
//		for (String value : values) {
//			createDao(value + "Dao");
//			createDaoImpl(value + "Dao", value + "DaoImpl");
//			createService(value + "Service");
//			createServiceImpl(value + "Service", value + "ServiceImpl");
//		}
//	}

	public void createDao(String comments, String beanName, String daoName) {
		StringBuffer sb = new StringBuffer();
		sb.append("package " + tableConfig.getDaoPackage() + ";");
		if (tableConfig.getNeedMethod()) {
			sb.append("\r\n").append("\r\n");
			sb.append("import " + tableConfig.getBeanPackage() + "." + beanName
					+ ";");
		}
		sb.append("\r\n").append("\r\n");
		sb.append(getClassComments(comments, tableConfig.getAuthor()));
		sb.append("\r\n");
		sb.append("public interface " + daoName + " {").append("\r\n");
		if(tableConfig.getNeedMethod()){
			sb.append(methodGenerator.generatorIInsert(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorIDelete());
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorIQueryById(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorIUpdate(beanName));
			sb.append("\r\n");
		} else {
			sb.append("\r\n");
		}
		sb.append("}");
		FileUtil.write(
				getSrcPath(tableConfig.getGeneratorPath(),
						tableConfig.getDaoPackage(), daoName),
				sb.toString());
	}
	
	public void createService(String comments, String beanName, String serviceName){
		StringBuffer sb = new StringBuffer();
		sb.append("package " + tableConfig.getServicePackage() + ";");
		if (tableConfig.getNeedMethod()) {
			sb.append("\r\n").append("\r\n");
			sb.append("import " + tableConfig.getBeanPackage() + "." + beanName
					+ ";");
		}
		sb.append("\r\n").append("\r\n");
		sb.append(getClassComments(comments, tableConfig.getAuthor()));
		sb.append("\r\n");
		sb.append("public interface " + serviceName + " {").append("\r\n");
		if(tableConfig.getNeedMethod()){
			sb.append(methodGenerator.generatorIInsert(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorIDelete());
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorIQueryById(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorIUpdate(beanName));
			sb.append("\r\n");
		} else {
			sb.append("\r\n");
		}
		sb.append("}");
		FileUtil.write(
				getSrcPath(tableConfig.getGeneratorPath(),
						tableConfig.getServicePackage(), serviceName),
				sb.toString());
	}

	public void createDaoImpl(String comments, String beanName, String daoName, String daoImplName) {
		StringBuffer sb = new StringBuffer();
		sb.append("package " + tableConfig.getDaoPackage() + ".impl" + ";");
		sb.append("\r\n").append("\r\n");
		sb.append("import " + tableConfig.getDaoPackage() + "." + daoName + ";");
		if (tableConfig.getNeedMethod()) {
			sb.append("\r\n");
			sb.append("import " + tableConfig.getBeanPackage() + "." + beanName + ";");
		}
		sb.append("\r\n");
		sb.append("import org.springframework.stereotype.Repository;");
		sb.append("\r\n");
		sb.append("import javax.annotation.Resource;");
		sb.append("\r\n");
		sb.append("import org.mybatis.spring.SqlSessionTemplate;");
		sb.append("\r\n").append("\r\n");
		sb.append(getClassComments(comments, tableConfig.getAuthor()));
		sb.append("\r\n");
		sb.append("@Repository(\"" + StringUtil.toLowerCaseFirstOne(daoName) +  "\")");
		sb.append("\r\n");
		sb.append("public class " + daoImplName).append(" ").append("implements").append(" ").append(daoName).append(" {").append("\r\n");
		sb.append("\t").append("@Resource");
		sb.append("\t").append("\r\n");
		sb.append("\t").append("private SqlSessionTemplate sqlSessionTemplate;");
		if (tableConfig.getNeedMethod()) {
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorDaoInsert(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorDaoDelete(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorDaoQueryById(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorDaoUpdate(beanName));
			sb.append("\r\n");
		} else {
			sb.append("\r\n");
		}
		sb.append("}");
		FileUtil.write(
				getSrcPath(tableConfig.getGeneratorPath(),
						tableConfig.getDaoPackage() + File.separator + "impl", daoImplName),
				sb.toString());
	}
	
	public void createServiceImpl(String comments, String beanName, String serviceName, String serviceImplName) {
		StringBuffer sb = new StringBuffer();
		sb.append("package " + tableConfig.getServicePackage() + ".impl" + ";");
		sb.append("\r\n").append("\r\n");
		sb.append("import " + tableConfig.getServicePackage() + "." + serviceName + ";");
		if (tableConfig.getNeedMethod()) {
			sb.append("\r\n");
			sb.append("import " + tableConfig.getBeanPackage() + "." + beanName
					+ ";");
		}
		sb.append("\r\n");
		sb.append("import " + tableConfig.getDaoPackage() + "." + beanName + "Dao" + ";");
		sb.append("\r\n");
		sb.append("import org.springframework.stereotype.Service;");
		sb.append("\r\n");
		sb.append("import javax.annotation.Resource;");
		sb.append("\r\n").append("\r\n");
		sb.append(getClassComments(comments, tableConfig.getAuthor()));
		sb.append("\r\n");
		sb.append("@Service(\"" + StringUtil.toLowerCaseFirstOne(serviceName) +  "\")");
		sb.append("\r\n");
		sb.append("public class " + serviceImplName).append(" ").append("implements").append(" ").append(serviceName).append(" {").append("\r\n");
		sb.append("\t").append("@Resource");
		sb.append("\t").append("\r\n");
		sb.append("\t").append("private " + beanName +"Dao").append(" ").append(StringUtil.toLowerCaseFirstOne(beanName) + "Dao;");
		if (tableConfig.getNeedMethod()) {
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorServiceInsert(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorServiceDelete(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorServiceQueryById(beanName));
			sb.append("\r\n").append("\r\n");
			sb.append(methodGenerator.generatorServiceUpdate(beanName));
			sb.append("\r\n");
		} else {
			sb.append("\r\n");
		}
		sb.append("}");
		FileUtil.write(
				getSrcPath(tableConfig.getGeneratorPath(),
						tableConfig.getServicePackage() + File.separator + "impl", serviceImplName),
				sb.toString());
	}
}
