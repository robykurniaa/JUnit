package com.juaracoding.Junit.Assert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.hasItems;


import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ContohAssert {
	
	@Test
	public void testAssert(){
		//Equals
		String expect = "JuaraCoding";
		String actual = "JuaraCoding";
		
		assertEquals("error", expect, actual);
	}
		
		@Test
		public void testAssert2() {
			//Array Equals
			char[] expect = {'J','u','a','r','a'};
			char[] actual = "Juara".toCharArray();
			
			assertArrayEquals(expect,actual);
		
			
		}
		
		@Test
		public void testAssert3() {
			//Array Equals Null
			char[] expect = null;
			char[] actual = null;
			
			assertArrayEquals(expect,actual);
		
			
		}
		
		@Test
		public void testAssert4() {
			//Null
		Object motor = null;
			assertNull("Objek motor harus null", motor);
		
			
		}
		
		@Test
		public void testAssert5() {
			//Not Same
			Object mobil = new Object();
			Object motor = new Object();
			
			assertNotSame(mobil, motor);			
		}
		
		@Test
		public void testAssert6() {
			//True or false (boolean)
			assertTrue(10>8);
			assertFalse(10>12);
		
		}
		
		@SuppressWarnings("deprecation")
		@Test
		public void testAssert7() {
			//that
			
			assertThat(
					Arrays.asList("Java", "Python", "Kotlin"),
					hasItems("Java", "python")
					);
	
		}
		
		
		
		
}
		
