package com.palm.generator.util;

import org.springframework.stereotype.Component;


@Component("getterAndSetterResolver")
public class GetterAndSetterResolver {
	public String createMethod(String type, String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t");
		sb.append("public " + type +" get" + StringUtil.toUpperCaseFirstOne(name)).append("()").append(" ").append("{");
		sb.append("\r\n");
		sb.append("\t").append("\t");
		sb.append("return " + name + ";");
		sb.append("\r\n");
		sb.append("\t");
		sb.append("}");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("\t");
		sb.append("public void set" + StringUtil.toUpperCaseFirstOne(name)).append("(").append(type).append(" ").append(name).append(")").append(" ").append("{");
		sb.append("\r\n");
		sb.append("\t").append("\t");
		sb.append("this." + name + " = " + name + ";");
		sb.append("\r\n");
		sb.append("\t");
		sb.append("}");
		return sb.toString();
	}
}
