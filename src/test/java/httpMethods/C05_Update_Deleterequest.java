package httpMethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class C05_Update_Deleterequest {
	@Test
	public void putRequest() {
		 C04_PojoData data = new C04_PojoData();  //class name 
		   data.setName("Shubham");
		   data.setJob("QA");
		   
		   given()
		   .contentType("application/json")
		   .body(data)
		   .when()
		   .put("https://reqres.in/api/users/2")
		   .then()
		   .statusCode(200)
		   .log().all();
	}
	
	@Test
	public void PatchRequest() {
		
		 C04_PojoData data = new C04_PojoData();  //class name 
		   data.setName("praveen");
		   data.setJob("QA");
		   
		   given()
		   .contentType("application/json")
		   .body(data)
		   .when()
		   .patch("https://reqres.in/api/users/2")
		   .then()
		   .statusCode(200)
		   .log().all();
	}
	
	@Test
	public void DeleteRequest() {
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log()
		.all();
	}
	
	
	
	
	
	
	
	
	
	
	
}
