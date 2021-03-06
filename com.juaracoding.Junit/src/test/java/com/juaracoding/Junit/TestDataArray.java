package com.juaracoding.Junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.juaracoding.Junit.array.DataArray;
public class TestDataArray {
	
	@Test
	public void testCariMax() {
		DataArray array = new DataArray();
		int angka1[] = {10,11,12,13};
		int actual = DataArray.cariMax(angka1);
		
		assertEquals(13, actual);
	}
	
	@Test
	public void testCariMaxNegatif() {
		DataArray array = new DataArray();
		int angka1[] = {-10,-11,-12,-13};
		int actual = DataArray.cariMax(angka1);
		
		assertEquals(-10, actual);
	}

}
