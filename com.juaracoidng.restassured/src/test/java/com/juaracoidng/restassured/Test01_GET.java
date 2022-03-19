package com.juaracoidng.restassured;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
	
	String endpoint = "https://reqres.in/api/users?page=1";
	
	@Test
	public void test_01() {
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int expect = 200;
		
		int actual = response.getStatusCode();
		
		assertEquals(expect, actual);
	}
	
	@Test
	public void test_02() {
		
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("data.email[1]", equalTo("janet.weaver@reqres.in"));
		
	}

}
