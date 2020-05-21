package ApiAutomationProject.ApiAutomation;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest 
{

	public static void main(String[] args) 
	{
	Response Res=	
	 given()
	 .contentType(ContentType.JSON)
	 .when()
	 .get ("http://localhost:3000/friends");
	JSONArray jr= new JSONArray(Res.asString());
	String id= jr.getJSONObject(23).getString("id");
	//System.out.println("Status code is " + Res.statusCode());
	System.out.println("...............Data is ...............");
	//System.out.println(Res.asString());
	System.out.println(id);
	}

}
