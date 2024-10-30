package api_Assignment;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Assignment_2 {
	@Test
	public void DeleteUser() {

		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204).
		log().all();
	}
}
