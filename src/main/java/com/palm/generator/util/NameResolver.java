package com.palm.generator.util;

import org.springframework.stereotype.Component;

/**
 * 
 * @author weixiang.qin
 * 
 */
@Component("nameResolver")
public class NameResolver {
	
	public String getName(String columnName) {
		StringBuffer sb = new StringBuffer();
		boolean flag = false;
		for (int i = 0; i < columnName.length(); i++) {
			char cur = columnName.charAt(i);
			if (cur == '_') {
				flag = true;
			} else {
				if (flag) {
					sb.append(Character.toUpperCase(cur));
					flag = false;
				} else {
					sb.append(Character.toLowerCase(cur));
				}
			}
		}
		return sb.toString();
	}

}
