package com.juaracoding.junit3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.junit3.BangunDatar.BangunDatar;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;



@RunWith(JUnitParamsRunner.class)
public class TestBangunDatar {
	
	BangunDatar bangunDatar;

	@Before
	public void setUp() throws Exception {
		bangunDatar = new BangunDatar();
	}

	@Test
	@FileParameters("src/test/resources/persegi.csv")
	public void testLuasPersegi(double sisi, double expect) {
		assertEquals(expect, bangunDatar.LuasPersegi(sisi), 0.0);
		
	}

}
