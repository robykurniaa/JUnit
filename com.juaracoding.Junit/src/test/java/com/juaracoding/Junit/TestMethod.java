package com.juaracoding.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethod {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("ini before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("ini after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("ini before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("ini after class");
	}

	@Test
	public void test() {
		System.out.println("ini test 1");
	}
	
	@Test
	public void testDua() {
		System.out.println("ini test 2");
	}

}
