package com.juaracoding.Junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.Junit.bangunruang.VolumeBangunRuang;

public class TestBangunRuang {
	VolumeBangunRuang volume;
	int s;

	@Before
	public void setUp() throws Exception {
		volume = new VolumeBangunRuang();	
		
	}

	@Test
	public void testLuasKubus() {
		int actual = volume.LuasKubus(s=5);
		int expect = 30;
		assertEquals(expect, actual);
	}

	@Test
	public void testKelilingKubus() {
		int actual = volume.KelilingKubus(s=-5);
		int expect = -60;
		assertEquals(expect, actual);
	}

	@Test
	public void testVolumeKubus() {
		double actual = volume.VolumeKubus(s=5);
		double expect = 125;
		assertEquals(expect, actual, 0.0);
	}

}
