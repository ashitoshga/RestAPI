package tests;

import org.testng.annotations.Test;
import org.testng.Assert;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matcher.*;


public class Test_GET_method {
	
	@Test
	public void BDD_GET()
	{
		//Response response=get("https://reqres.in/api/users?page=2");
		//baseURI = given().get("https://reqres.in/api/users?page=2");
		
		baseURI = "https://reqres.in/api"; 
		//given().get("users?page=2")
				//.then().statusCode(200);
		
		given()
			.get("users?page=2")
		.then()
			.statusCode(200).log().all();
		
		//.statusCode(200.body("data[1].id", equalTo(8)).log().all();
			
	
		
	}

	
	


}
