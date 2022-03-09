package com.juaracoding.junit2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit2.pasien.Pasien;
import com.juaracoding.junit2.pasien.TagihanMenginap;

public class TestTagihan {
	Pasien pasien;
	TagihanMenginap tagihanMenginap;
	

	@Before
	public void setUp() throws Exception {
		pasien = new Pasien();
		tagihanMenginap = new TagihanMenginap();
	}

	@Test
	public void test() {
		pasien.setId(00001);
		pasien.setNama("dadang");
		pasien.setKelas("Kelas VIP");
		pasien.setMenginap(3);
		
		double expect = 250000 * pasien.getMenginap();
		double actual = tagihanMenginap.totalTagihan(pasien);
		
		assertEquals(expect, actual, 0.0);
		
	}
	
	@Test
	public void test2() {
		pasien.setId(00001);
		pasien.setNama("dadang");
		pasien.setKelas("Kelas 1");
		pasien.setMenginap(4);
		
		double expect = 200000 * pasien.getMenginap();
		double actual = tagihanMenginap.totalTagihan(pasien);
		
		assertEquals(expect, actual, 0.0);
		
	}

}
