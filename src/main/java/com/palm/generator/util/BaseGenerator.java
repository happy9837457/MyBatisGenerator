package com.palm.generator.util;

import java.io.File;

public class BaseGenerator {

	protected String getSrcPath(String basePath, String packageName, String name) {
		return basePath + File.separator + "src" + File.separator
				+ packageName.replace(".", File.separator) + File.separator
				+ name + ".java";
	}

	protected String getComments(String comments) {
		if (comments == null || "".equals(comments)
				|| "null".equalsIgnoreCase(comments)) {
			return "";
		}
		return comments.trim().replace("\r", "").replace("\n", "");
	}

	protected String getClassComments(String comments, String author){
		StringBuffer sb = new StringBuffer();
		sb.append("/**").append("\r\n").append(" * ").append(comments).append("\r\n").append(" * ").append("\r\n").append(" * ")
		.append("@author ").append(author).append("\r\n").append(" * ").append("\r\n").append(" */");
		return sb.toString();
	}
	
	protected String getMethodComments(String comments){
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("/**").append("\r\n");
		sb.append("\t").append(" * ").append(comments).append("\r\n");
		sb.append("\t").append(" * ").append("\r\n");
		sb.append("\t").append(" * ").append("@return").append("\r\n");
		sb.append("\t").append(" */");
		return sb.toString();
	}
	
	protected String getMethodComments(String comments, String params){
		StringBuffer sb = new StringBuffer();
		sb.append("\t").append("/**").append("\r\n");
		sb.append("\t").append(" * ").append(comments).append("\r\n");
		sb.append("\t").append(" * ").append("\r\n");
		sb.append("\t").append(" * ").append("@param ").append(params).append("\r\n");
		sb.append("\t").append(" * ").append("@return").append("\r\n");
		sb.append("\t").append(" */");
		return sb.toString();
	}
	
	
}
