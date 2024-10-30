package api_Assignment;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Assignment_4 {
	@Test
	public void auth() {
		
		given()
		.auth().oauth2("12345")
		.when()
		.get("https://postman-echo.com")
		.then()
		.statusCode(200)
		.log().all();
	}
}
