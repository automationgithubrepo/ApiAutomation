package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import org.testing.ResponseValidation.ResponseDataValidationUsingJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.FileLoad;
import org.testing.Utilities.JsonVariableReplacement;
import com.jayway.restassured.response.Response;

public class PostRequestTC 
{

	public static void main(String[] args) throws IOException 
	{
	Properties p =  FileLoad.propertiesLoad("C:\\Users\\Dell\\git\\RestAssured\\MYWP\\ApiAutomation\\URIs.properties");
	String body= FileLoad.JsonData("C:\\Users\\Dell\\git\\RestAssured\\MYWP\\ApiAutomation\\src\\test"
			+ "\\java\\org\\testing\\Resources_Payload\\BodyData.json");
	Random r = new Random();
	Integer ramdomIDValue = r.nextInt();
	String bodyDataAfterGivingValue=JsonVariableReplacement.JsonValueToVariable(body, "id", ramdomIDValue.toString());
    HTTPMethods http= new HTTPMethods(p);
	Response res= http.PostRequest(bodyDataAfterGivingValue, "Friends");
	ResponseStatusCodeValidate.ResponseStatusValidate(201, res);
	ResponseDataValidationUsingJsonPath.responseData("Amit", res, "firstName");
	System.out.println("JsonData is "+ res.asString());
	
	}

}
