package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestExamples {
	
	//GET method
	@Test
	public void test1_GET()
	{
		
		//Response response;
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		//response.getStatusCode();
		//response.getTime();
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
