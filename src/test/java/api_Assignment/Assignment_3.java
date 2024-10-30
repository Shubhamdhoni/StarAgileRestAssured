package api_Assignment;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Assignment_3 {
	@Test
	public void RetriveUserList() {
		
		given()
		.when()
		.get("https://reqres.in/api/users?page=1")
		.then()
		.log().body();
	}
}
