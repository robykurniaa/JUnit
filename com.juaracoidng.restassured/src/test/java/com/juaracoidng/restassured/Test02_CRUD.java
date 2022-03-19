package com.juaracoidng.restassured;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test02_CRUD {
	
	JSONObject request;
	
	String endpoint_post = "https://reqres.in/api/users";
	String endpoint_update ="https://reqres.in/api/users/2";
	String endpoint_delete ="https://reqres.in/api/users/2";
	
	@BeforeMethod
		public void setUp() {
		request = new JSONObject();
	}
	
	@Test
	public void test01_post(){
		
		
		request.put("name", "Angga");
		request.put("job", "SQA Tester BCA");
		
		System.out.println(request.toJSONString());
		
		given()
		.header("content-tipe", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post(endpoint_post)
		.then()
		.statusCode(201)
		.log().all();
	}
	
	@Test
	public void test02_update(){
		
		request.put("name", "Angga");
		request.put("job", "SQA Tester BCA");
		
		System.out.println(request.toJSONString());
		
		given()
		.header("content-tipe", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put(endpoint_update)
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	public void test03_delete(){
		
		when()
		.delete(endpoint_delete)
		.then()
		.statusCode(204)
		.log().all();
		}

}
