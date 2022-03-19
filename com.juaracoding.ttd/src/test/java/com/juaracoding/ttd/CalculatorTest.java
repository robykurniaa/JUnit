package com.juaracoding.ttd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calculator;

	@Before
	public void setUp() throws Exception {
		
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		int expect = 10;
		int actual = calculator.add(5, 5);
		assertEquals(expect, actual);
	}

}
