package com.juaracoding.junit4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit4.Karyawan.EmailKaryawan;

public class TestEmailKaryawan {
	EmailKaryawan emailKaryawan;
	@Before
	public void setUp() throws Exception {
		emailKaryawan = new EmailKaryawan();
	}

	@Test
	public void testValidEmailId() {
		boolean actual = emailKaryawan.isValidEmail("koswara@jc.com");
		assertTrue("Valid Email ID failed", actual);
	}
	
	@Test
	public void testInValidEmailId() {
		boolean actual = emailKaryawan.isValidEmail("koswara@jc");
		assertFalse("Valid Email ID failed", actual);
	}


}
