package com.palm.generator.mysql.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.palm.generator.util.SpringHelper;

public class MysqlGeneratorTest {
	private MysqlGenerator mysqlGenerator;

	@Before
	public void setUp() throws Exception {
		mysqlGenerator = SpringHelper.getBean("mysqlGenerator");
	}

	@Test
	public void testGenerate() throws Exception {
		mysqlGenerator.generate();
	}

	@After
	public void tearDown() throws Exception {
	}

}
