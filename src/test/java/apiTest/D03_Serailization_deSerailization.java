package apiTest;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import httpMethods.C04_PojoData;

public class D03_Serailization_deSerailization {
	
	@Test(priority = 1)
	public void Serailization() throws JsonProcessingException {
	
		  C04_PojoData data = new C04_PojoData();  //class name 
		   data.setName("Shubham");
		   data.setJob("QA");
		   
		   ObjectMapper obj = new ObjectMapper();
		   String jsonData = obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
           System.out.println("json formate data"+ jsonData );
           System.out.println("----------------------------------------------------------------");
	}
	
	@Test(priority = 2)
	public void deSerailization() throws JsonMappingException, JsonProcessingException {
		
		String jsonData ="{\n"
				+ "  \"name\" : \"Shubham\",\n"
				+ "  \"job\" : \"QA\"\n"
				+ "}";
		
		//Object mapper class converter
		ObjectMapper obj = new ObjectMapper();
		C04_PojoData pojo = obj.readValue(jsonData, C04_PojoData.class);
		System.out.println("Data in pojo formate Name"+pojo.getName());
		System.out.println("Data in pojo formate job"+pojo.getJob());
	}
}
