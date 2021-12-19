package pages;

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.remote.Response;

import io.restassured.RestAssured;

public class Api {

	Response response;

	public Response acessarApi(String uri) {

		response = (Response) RestAssured.get(uri);

		return response;
    }
   public void statusCode (int status) {
	   
	   int statusCode = response.getStatus();
	 
	   assertEquals(status, statusCode);	
}
    public void body(String texto) {
  
    	String bodyResponse = response.toString();
    	assertEquals(bodyResponse, StringContains.containsString(texto));
    
    
    
    }
    


}