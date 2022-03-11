package com.juaracoding.junit3;

import static org.junit.Assert.*;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;


import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSortMethod {

	static final Logger log = getLogger(lookup().lookupClass());
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		
		@Override
		protected void succeeded (Description description) {
			log.debug("Pesan sukses : {}", description.getMethodName());
		}
		
		@Override
		protected void failed (Throwable e, Description description) {
			log.debug("Pesan failed : {}", description.getMethodName());
		}
	};
	
	@Test
	public void testB() {
		
		log.debug("Testing 2");
		System.out.println("Test 2");
		
	}
	
	@Test
	public void testC() {
		
		log.debug("Testing 3");
		System.out.println("Test 3");
		
	}
	
	@Test
	public void testA() {
		
		log.debug("Testing 1");
		System.out.println("Test 1");
		
	}

}

