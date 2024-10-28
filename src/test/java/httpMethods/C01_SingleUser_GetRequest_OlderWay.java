package httpMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class C01_SingleUser_GetRequest_OlderWay {
	
	@Test
	public void singeleUserGet() {
	    Response res =  RestAssured.get("https://google.com");
	    System.out.println(res.getStatusCode());
	    System.out.println(res.getStatusLine());
	    System.out.println(res.getTime());
	    
	    int actCode = res.getStatusCode();
	    Assert.assertEquals(actCode, 200, "AssertFale: status code is not maching" );
	    
	}

}
