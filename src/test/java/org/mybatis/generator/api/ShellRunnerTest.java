package org.mybatis.generator.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShellRunnerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMain() {
		String[] args = new String[2];
		args[0] = "-configfile";
		args[1] = "/Users/lottery/web/workspace/MyBatisGenerator/src/main/resources/generatorConfig.xml";
		ShellRunner.main(args);
	}

	@After
	public void tearDown() throws Exception {
	}

}
