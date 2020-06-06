package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.FileLoad;

import com.jayway.restassured.response.Response;

public class PostRequestTC {

	public static void main(String[] args) throws IOException 
	{
	Properties p =  FileLoad.propertiesLoad("C:\\Users\\Dell\\git\\RestAssured\\MYWP\\ApiAutomation\\URIs.properties");
	String body= FileLoad.JsonData("C:\\Users\\Dell\\git\\RestAssured\\MYWP\\ApiAutomation\\src\\test"
			+ "\\java\\org\\testing\\Resources_Payload\\BodyData.json");
    HTTPMethods http= new HTTPMethods(p);
	Response res= http.PostRequest(body, "Friends");
	System.out.println("Status code is"+ res.statusCode());
	}

}
