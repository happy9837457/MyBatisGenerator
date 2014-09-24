package com.palm.generator.util;

import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * 
 * @author weixiang.qin
 * 
 */
@Component("tableConfig")
public class TableConfig {
	private String tableSchema;
	private Map<String, String> tables;
	private Boolean needMethod;
	private String author;
	private String generatorPath;
	private String beanPackage;
	private String daoPackage;
	private String servicePackage;

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public Map<String, String> getTables() {
		return tables;
	}

	public void setTables(Map<String, String> tables) {
		this.tables = tables;
	}

	public Boolean getNeedMethod() {
		return needMethod;
	}

	public void setNeedMethod(Boolean needMethod) {
		this.needMethod = needMethod;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGeneratorPath() {
		return generatorPath;
	}

	public void setGeneratorPath(String generatorPath) {
		this.generatorPath = generatorPath;
	}

	public String getBeanPackage() {
		return beanPackage;
	}

	public void setBeanPackage(String beanPackage) {
		this.beanPackage = beanPackage;
	}

	public String getDaoPackage() {
		return daoPackage;
	}

	public void setDaoPackage(String daoPackage) {
		this.daoPackage = daoPackage;
	}

	public String getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(String servicePackage) {
		this.servicePackage = servicePackage;
	}

}
