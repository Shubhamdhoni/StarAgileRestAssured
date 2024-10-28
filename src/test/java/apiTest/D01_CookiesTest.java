package apiTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class D01_CookiesTest {
	
	@Test
	public void getAllCookies() {
	
		given()
		.when()
		.get("https://google.com")
		.then()
		.log().cookies();
	}
	
	@Test
	public void getSingleCookies() {
		
		Response rs = given()
		.when()
		.get("https://google.com");
		
		System.out.println("get single response from the cookie "+rs.cookie("AEC"));
	
	}
}
