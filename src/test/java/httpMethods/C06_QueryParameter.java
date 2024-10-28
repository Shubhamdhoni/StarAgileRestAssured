package httpMethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class C06_QueryParameter {
  @Test
  public void queryPathParameter() {
	  given()
	  .pathParam("path", "users")
	  .queryParam("page", 2)
	  
	  .when()
	  .get("https://reqres.in/api/{path}")
	  .then()
	  .statusCode(200)
	  .log().all();
	  
  }
}
