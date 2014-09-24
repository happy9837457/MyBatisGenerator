package com.palm.generator.util;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringHelper
 * 
 * @author weixiang.qin
 * 
 */
public class SpringHelper {
	private static Logger logger = Logger.getLogger(SpringHelper.class);
	private static ApplicationContext cx = null;

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String beanId) {
		if (cx == null) {
			init();
		}
		return (T) cx.getBean(beanId);
	}

	public synchronized static void init() {
		if (cx == null) {
			cx = new ClassPathXmlApplicationContext(
					"classpath:spring/applicationContext.xml");
			logger.info("Spring init success.");
		}
	}

	public synchronized static void init(String path) {
		if (cx == null) {
			cx = new ClassPathXmlApplicationContext(path);
			logger.info("Spring init success.");
		}
	}

}
