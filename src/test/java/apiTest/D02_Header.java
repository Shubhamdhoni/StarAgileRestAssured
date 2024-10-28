package apiTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class D02_Header {
	
	
	@Test
	public void GetAllHeader() {
		given()
		.when()
		.get("https://google.com")
		.then()
		.log()
		.headers();
	}
	
	@Test
	public void GetSingleHeader() {
		Response rs = given()
		.when()
		.get("https://google.com");
		
		System.out.println("get single response :"+rs.getHeader("Content-Type"));
	}
}
