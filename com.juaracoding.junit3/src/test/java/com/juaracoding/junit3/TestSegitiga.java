package com.juaracoding.junit3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.junit3.segitiga.Segitiga;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestSegitiga {
	
	Segitiga segitiga;

	@Before
	public void setUp() throws Exception {
		segitiga = new Segitiga();
		
	}

	@Test
	@FileParameters("src/test/resources/segitiga.csv")
	public void testLuasSegitiga(double alas, double tinggi, double expect) {
		assertEquals(expect, segitiga.LuasSegitiga(alas, tinggi), 0.0);
	}
	

}
