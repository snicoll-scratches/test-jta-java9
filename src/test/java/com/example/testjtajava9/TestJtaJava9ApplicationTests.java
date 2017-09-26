package com.example.testjtajava9;

import org.junit.Test;

public class TestJtaJava9ApplicationTests {

	@Test
	public void contextLoads() {
		TestJtaJava9Application app = TestJtaJava9Application.create();
		System.out.println(app.getTransactionManager());
	}

}
