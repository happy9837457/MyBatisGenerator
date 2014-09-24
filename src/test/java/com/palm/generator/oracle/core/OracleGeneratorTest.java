package com.palm.generator.oracle.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.generator.api.ShellRunner;

import com.palm.generator.util.SpringHelper;

public class OracleGeneratorTest {
	private OracleGenerator oracleGenerator;

	@Before
	public void setUp() throws Exception {
		oracleGenerator = SpringHelper.getBean("oracleGenerator");
	}

	@Test
	public void testGenerator() throws Exception {
		// MyBatis xml
		String[] args = new String[2];
		args[0] = "-configfile";
		args[1] = System.getProperty("user.dir") + "/src/main/resources/generatorConfig_Mysql.xml";
		ShellRunner.main(args);
		// Bean Dao Service
//		oracleGenerator.generate();
	}

	@After
	public void tearDown() throws Exception {
		
	}

}
