package com.juaracoding.Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.juaracoding.Junit.pajak.Pajak;

public class TestPajak {
	
	Pajak pajak;
	double pendapatan;

	@Before
	public void setUp() throws Exception {
		pajak = new Pajak();
		
	}

	@Ignore 
	// ignore untuk menskip test maka test pertama akan diskip langsung ke test 2
	@Test
	public void testHitungPajak() {
		pendapatan = 8000;
		double actual = pajak.HitungPajak(pendapatan);
		double expect = 10;
		
		assertEquals(expect, actual, 0.0);
	}
	
	@Test(timeout = 1000)
	//time out digunakan jika test melebihi batas ditentukan maka akan error
	public void testHitungPajak2() {
		pendapatan = 7500;
		double actual = pajak.HitungPajak(pendapatan);
		double expect = 0;
		
		assertEquals(expect, actual, 0.0);
	}

}
