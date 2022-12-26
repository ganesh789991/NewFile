package com.application.Team11NewBatch.Amazon_WebApplication_Project;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
	        RestAssured.baseURI="https://reqres.in";
	        
	        given().param("page","2").param("data", "4").
	                
	                when().
	                get("/api/users").
	                then().assertThat().statusCode(200)
	                .and().contentType(ContentType.JSON)
	                .and().body("data[0].id", equalTo("1"))
	                .and().header("Connection","keep-alive");
	        
	                // status check
	                // content type check
	                // body check
	                // header check
	        
	    }
	}

}
