package com.palm.generator.util;

import org.springframework.stereotype.Component;


/**
 * 
 * @author weixiang.qin
 * 
 */
@Component("methodGenerator")
public class MethodGenerator extends BaseGenerator {
	/**
	 * insert接口方法
	 * 
	 * @param beanName
	 * @return
	 */
	public String generatorIInsert(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append(getMethodComments("插入",
				StringUtil.toLowerCaseFirstOne(beanName)));
		sb.append("\r\n");
		sb.append("\t").append("public void insert" + beanName + "(" + beanName + " "
				+ StringUtil.toLowerCaseFirstOne(beanName) + ");");
		return sb.toString();
	}

	/**
	 * deleteById接口方法
	 * 
	 * @return
	 */
	public String generatorIDelete() {
		StringBuffer sb = new StringBuffer();
		sb.append(getMethodComments("通过主键删除", "Id"));
		sb.append("\r\n");
		sb.append("\t").append("public void deleteById(String Id);");
		return sb.toString();
	}

	/**
	 * queryById接口方法
	 * 
	 * @param beanName
	 * @return
	 */
	public String generatorIQueryById(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append(getMethodComments("通过主键查询", "Id"));
		sb.append("\r\n");
		sb.append("\t").append("public " + beanName + " queryById(String Id);");
		return sb.toString();
	}

	/**
	 * updateById接口方法
	 * 
	 * @return
	 */
	public String generatorIUpdate(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append(getMethodComments("通过主键更新", StringUtil.toLowerCaseFirstOne(beanName)));
		sb.append("\r\n");
		sb.append("\t").append("public int updateById(" + beanName + " "
				+ StringUtil.toLowerCaseFirstOne(beanName) + ");");
		return sb.toString();
	}
	
	/**
	 * insertDao方法
	 * 
	 * @param beanName
	 * @return
	 */
	public String generatorDaoInsert(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public void insert" + beanName + "(" + beanName + " "
				+ StringUtil.toLowerCaseFirstOne(beanName) + ") {").append("\r\n");
		sb.append("\t\t").append("sqlSessionTemplate.insert(\"" + beanName + ".insert" + beanName + "\", " + StringUtil.toLowerCaseFirstOne(beanName) + ");").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}
	
	/**
	 * deleteByIdDao方法
	 * 
	 * @return
	 */
	public String generatorDaoDelete(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public void deleteById(String Id) {").append("\r\n");
		sb.append("\t\t").append("sqlSessionTemplate.delete(\"" + beanName + ".deleteById\", Id);").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}
	
	/**
	 * queryById接口方法
	 * 
	 * @param beanName
	 * @return
	 */
	public String generatorDaoQueryById(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public " + beanName + " queryById(String Id) {").append("\r\n");
		sb.append("\t\t").append("return sqlSessionTemplate.selectOne(\"" + beanName + ".queryById\", Id);").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}

	/**
	 * updateById接口方法
	 * 
	 * @return
	 */
	public String generatorDaoUpdate(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public int updateById(" + beanName + " "
				+ StringUtil.toLowerCaseFirstOne(beanName) + ") {").append("\r\n");
		sb.append("\t\t").append("return sqlSessionTemplate.update(\"" + beanName + ".updateById\", " + StringUtil.toLowerCaseFirstOne(beanName) + ");").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}
	
	/**
	 * insertDao方法
	 * 
	 * @param beanName
	 * @return
	 */
	public String generatorServiceInsert(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public void insert" + beanName + "(" + beanName + " "
				+ StringUtil.toLowerCaseFirstOne(beanName) + ") {").append("\r\n");
		sb.append("\t\t").append(StringUtil.toLowerCaseFirstOne(beanName) + "Dao.insert" + beanName + "(" + StringUtil.toLowerCaseFirstOne(beanName) + ");").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}
	
	/**
	 * deleteByIdDao方法
	 * 
	 * @return
	 */
	public String generatorServiceDelete(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public void deleteById(String Id) {").append("\r\n");
		sb.append("\t\t").append(StringUtil.toLowerCaseFirstOne(beanName) + "Dao.deleteById(Id);").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}
	
	/**
	 * queryById接口方法
	 * 
	 * @param beanName
	 * @return
	 */
	public String generatorServiceQueryById(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public " + beanName + " queryById(String Id) {").append("\r\n");
		sb.append("\t\t").append("return ").append(StringUtil.toLowerCaseFirstOne(beanName) + "Dao.queryById(Id);").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}

	/**
	 * updateById接口方法
	 * 
	 * @return
	 */
	public String generatorServiceUpdate(String beanName) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("@Override").append("\r\n");
		sb.append("\t").append("public int updateById(" + beanName + " "
				+ StringUtil.toLowerCaseFirstOne(beanName) + ") {").append("\r\n");
		sb.append("\t\t").append("return ").append(StringUtil.toLowerCaseFirstOne(beanName) + "Dao.updateById(" + StringUtil.toLowerCaseFirstOne(beanName) + ");").append("\r\n");
		sb.append("\t").append("}");
		return sb.toString();
	}
}
