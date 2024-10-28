package httpMethods;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class C02_GetRequest_Latest {
	
	/*given() - pre-requisite
	 * headers/cookie/path/query/requestpayload(resources)/authentication.
	 * 
	 * when()  - send request
	 * get/post/put/path/delete
	 * 
	 * then() - validate response
	 * status code/ response/ response payload/ msg
	 */

	@Test
	public void singleUserRequest() {
		//https://reqres.in/api/users/2
		
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.body("data.first_name", equalTo("janet"))
		.log().all();  //return complete response from  the server 
	}
}
