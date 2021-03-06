package com.juaracoding.Junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
//import com.juaracoding.Junit.calculator.Calculator;

public class TestCalculator3 {
	
	Calculator calculator;
	int a,b;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		a = 10;
		b = 20;
	}

	@Test
	public void testAdd() {
		int actual = calculator.add(a, b);
		int expect = 30;
		assertEquals(expect, actual);
	}

	@Test
	public void testSubstrack() {
		int actual = calculator.substrack(a, b);
		int expect = 10;
		assertEquals(expect, actual);
		
	}
	@Test
	public void testMulti() {
		double actual = calculator.multi(a, b);
		double expect = 200;
		assertEquals(expect, actual,0.0);
		
	}

}
