package com.palm.generator.util;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * 
 * @author weixiang.qin
 * 
 */
@Component("javaTypeResolver")
public class JavaTypeResolver {

	public String getOracleJavaType(String colType, BigDecimal dataScale,
			BigDecimal dataPrecision) {
		if ("VARCHAR2".equalsIgnoreCase(colType) || "VARCHAR".equalsIgnoreCase(colType)
				|| "CLOB".equalsIgnoreCase(colType) || "NCLOB".equalsIgnoreCase(colType)) {
			return "String";
		} else if ("LONG".equalsIgnoreCase(colType)) {
			return "Long";
		} else if ("CHAR".equalsIgnoreCase(colType)) {
			return "Character";
		} else if ("DATE".equalsIgnoreCase(colType) || "TIME".equalsIgnoreCase(colType)
				|| "TIMESTAMP".equalsIgnoreCase(colType)) {
			return "Date";
		} else if ("TINYINT".equalsIgnoreCase(colType)) {
			return "Byte";
		} else if ("VARBINARY".equalsIgnoreCase(colType)) {
			return "byte[]";
		} else if ("NUMBER".equalsIgnoreCase(colType)) {
			if (dataPrecision == null) {
				return "BigDecimal";
			} else if (dataScale != null && dataScale.intValue() > 0) {
				return "Double";
			} else if (dataPrecision.intValue() > 18) {
				return "BigDecimal";
			} else if (dataPrecision.intValue() > 9) {
				return "Long";
			} else if (dataPrecision.intValue() > 4) {
				return "Integer";
			} else {
				return "Short";
			}
		}
		return null;
	}
	
	public String getMysqlJavaType(String colType, Long dataScale,
			Long dataPrecision){
		if ("VARCHAR".equalsIgnoreCase(colType)
				|| "TEXT".equalsIgnoreCase(colType) || "BLOB".equalsIgnoreCase(colType)) {
			return "String";
		} else if ("INT".equalsIgnoreCase(colType)) {
			return "Long";
		} else if("TINYINT".equalsIgnoreCase(colType) || "BOOLEAN".equalsIgnoreCase(colType)){
			return "Short";
		} else if( "SMALLINT".equalsIgnoreCase(colType) || "MEDIUMINT".equalsIgnoreCase(colType)){
			return "Integer";
		}else if("BIGINT".equalsIgnoreCase(colType)){
			return "BigInteger";
		}else if("BIT".equalsIgnoreCase(colType)){
			return "Boolean";
		} else if("FLOAT".equalsIgnoreCase(colType)){
			return "Float";
		} else if("DOUBLE".equalsIgnoreCase(colType)){
			return "Double";
		} else if ("CHAR".equalsIgnoreCase(colType)) {
			return "Character";
		} else if ("DATE".equalsIgnoreCase(colType) || "TIME".equalsIgnoreCase(colType)
				|| "TIMESTAMP".equalsIgnoreCase(colType) || "DATETIME".equalsIgnoreCase(colType) || "YEAR".equalsIgnoreCase(colType)) {
			return "Date";
		} else if ("TINYINT".equalsIgnoreCase(colType)) {
			return "Byte";
		} else if ("VARBINARY".equalsIgnoreCase(colType)) {
			return "byte[]";
		} else if("DECIMAL".equalsIgnoreCase(colType)){
			return "BigDecimal";
		}
//		else if ("NUMBER".equalsIgnoreCase(colType)) {
//			if (dataPrecision == null) {
//				return "BigDecimal";
//			} else if (dataScale != null && dataScale.intValue() > 0) {
//				return "Double";
//			} else if (dataPrecision.intValue() > 18) {
//				return "BigDecimal";
//			} else if (dataPrecision.intValue() > 9) {
//				return "Long";
//			} else if (dataPrecision.intValue() > 4) {
//				return "Integer";
//			} else {
//				return "Short";
//			}
//		}
		return null;
	}
}
