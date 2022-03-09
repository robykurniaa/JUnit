package com.juaracoding.unit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.juaracoding.Junit.TestDataArray;
import com.juaracoding.Junit.TestPajak;

@RunWith(Suite.class)
@SuiteClasses({
	TestPajak.class,
	TestDataArray.class
})
public class PajakArrayTestJava {

}
