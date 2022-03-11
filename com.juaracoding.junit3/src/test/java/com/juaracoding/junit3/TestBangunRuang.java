package com.juaracoding.junit3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.junit3.BangunRuang.BangunRuang;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestBangunRuang {
	BangunRuang bangunRuang;

	@Before
	public void setUp() throws Exception {
		bangunRuang = new BangunRuang();
	}

	@Test
	@FileParameters("src/test/resources/VolumeBalok.csv")
	public void testVolumeBalok(double panjang, double lebar, double tinggi, double expect) {
		assertEquals(expect, bangunRuang.VolumeBalok(panjang, lebar, tinggi), 0.0);
	}

	@Test
	@FileParameters("src/test/resources/LuasBalok.csv")
	public void testLuasBalok(double panjang, double lebar, double tinggi, double expect) {
		assertEquals(expect, bangunRuang.LuasBalok(panjang, lebar, tinggi), 0.0);
	}

	@Test
	@FileParameters("src/test/resources/VolumeTabungg.csv")
	public void testVolumeTabung(double ruas,double tinggi, double expect) {
		assertEquals(expect, bangunRuang.VolumeTabung(ruas, tinggi), 0.0);
	}

	@Test
	@FileParameters("src/test/resources/luastabung.csv")
	public void testLuasTabung(double luasAlas, double luasSelimut, double expect) {
		assertEquals(expect, bangunRuang.LuasTabung(luasAlas, luasSelimut), 0.0);

	}
	@Test
	@FileParameters("src/test/resources/VolumeKerucut.csv")
	public void testVolumeKerucut(double ruas, double tinggi, double expect) {
		assertEquals(expect, bangunRuang.LuasTabung(ruas, tinggi), 0.0);

	}
	
}	
