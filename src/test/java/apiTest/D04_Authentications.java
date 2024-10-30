package apiTest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class D04_Authentications {
	
  @Test
  public void BasicAuthentication() {
	  
	  given()
	  .auth().basic("postman", "password")
	  .when()
	  .get("https://postman-echo.com/basic-auth")
	  .then()
	  .statusCode(200)
	  .body("authenticated", equalTo(true))
	  .log().all();
	  
  }
}
