package httpMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

public class C03_PostRequest {

	@Test
	public void PostWithHashMap() {
		
		//RequestPayLoad
		HashMap<String,Object> data = new HashMap<String,Object>();
		data.put("name", "Shubham");
		data.put("job", "QA");
		
		given()
		.contentType("application/json") //type of the data format
		.body(data)
		.when().post("https://reqres.in/api/users") //end point
		.then()
		.statusCode(201)
		.body("name", equalTo("Shubham"))  //validating the name in the response  
		.log().body();
		
	}
	
	@Test
	public void post_pojo() {
		
		//payload
	   C04_PojoData data = new C04_PojoData();  //class name 
	   data.setName("Shubham");
	   data.setJob("QA");
	   
	   given()
		.contentType("application/json") //type of the data format
		.body(data)
		.when().post("https://reqres.in/api/users") //end point
		.then()
		.statusCode(201)
		.body("name", equalTo("Shubham"))  //validating the name in the response  
		.log().body();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
