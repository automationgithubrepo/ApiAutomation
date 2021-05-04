package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
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
  
	Properties p =  FileLoad.propertiesLoad("C:\\Users\\amitm\\git\\ApiAutomation_q\\MYWP\\ApiAutomation\\URIs.properties");
	String body= FileLoad.JsonData("C:\\Users\\amitm\\git\\ApiAutomation_q\\MYWP\\ApiAutomation\\src\\test\\java\\org\\testing\\Resources_Payload\\BodyData.json");
	Random r = new Random();
	Integer ramdomIDValue = r.nextInt();
	String a= "bc";
	String bodyDataAfterGivingValue=JsonVariableReplacement.JsonValueToVariable(body, "id", ramdomIDValue.toString());
	String bodyDataAfterGivingValue1=JsonVariableReplacement.JsonValueToVariable(bodyDataAfterGivingValue, "age", ramdomIDValue.toString());
	String bodyDataAfterGivingValue2=JsonVariableReplacement.JsonValueToVariable(bodyDataAfterGivingValue1, "num", a);
    HTTPMethods http= new HTTPMethods(p);
    // Updated String should be there...
	Response res= http.PostRequest(bodyDataAfterGivingValue2, "Comments");
	ResponseStatusCodeValidate.ResponseStatusValidate(201, res);
	ResponseDataValidationUsingJsonPath.responseData("Amit", res, "firstName");
	System.out.println("JsonData is "+ res.asString());
	
	
	}

}
