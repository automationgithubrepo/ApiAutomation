package ApiAutomationProject.ApiAutomation;
import static com.jayway.restassured.RestAssured.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBodyData;

import BodyDataCreation.Org_Json;
import BodyDataCreation.Pojo;
public class PostRequest
{
	//@Test
	public static void RunSimpJson()
	{
		JSONObject js= new JSONObject();
		js.put("id", "1009");
		js.put("FisrtName", "Sumit");
		js.put("MiddleName", "Kumar");
		js.put("LastName", "Mishra");
		js.put("Post", "TestEngineer");
		js.put("Age", "26");  
		Response ResSimple=given().contentType(ContentType.JSON).body(js.toString()).when()
				.post ("http://localhost:3000/friends");
		System.out.println("Status code is " + ResSimple.statusCode());
		System.out.println("...............SimpleJson Data is ...............");
		System.out.println(ResSimple.asString());
	}
	//@Test(priority =1)
	public static void RunComplexJson()
	{
	JSONObject Address= new JSONObject(); 
	  Address.put("At", "KPDP");
	  Address.put("Post", "KPDP");
	  Address.put("Dist", "KJR");
	  Address.put("NAT", "IND");
	  
	  JSONObject PhoneRec= new JSONObject(); 
	  PhoneRec.put("LandLine", "0674125620");
	  PhoneRec.put("LandLine1", "0674125622");
	  
	  JSONObject LandRec= new JSONObject(); 
	  LandRec.put("Land1", "LMJ");
	  LandRec.put("Land2", "PMJ");
	  
	  JSONArray ja= new JSONArray();
	  ja.put(0, PhoneRec);
	  ja.put(1, LandRec);
	  
	  JSONObject  CompJs= new JSONObject();
	  CompJs.put("id", "1012");
	  CompJs.put("FisrtName", "Ram");
	  CompJs.put("MiddleName", "Kumar");
	  CompJs.put("LastName", "Mishra");
	  CompJs.put("Post", "TestEngineer");
	  CompJs.put("Age", "26"); 
	  CompJs.put("arrayvalue", ja);
	  CompJs.put("Address", Address);
	Response ResComplex=given().contentType(ContentType.JSON).body(CompJs.toString()).when()
			.post ("http://localhost:3000/friends");
		System.out.println("Status code is " + ResComplex.statusCode());
		System.out.println("...............CompJson Data is ...............");
		System.out.println(ResComplex.asString());
	}
	@Test(priority =2)
	public static void UsingPojo()
	{
		Pojo BodyData= new Pojo();
		BodyData.setId("LAL");
		BodyData.setName("Amit");
		BodyData.setPost("Engineer");
		BodyData.setAge("25");
		BodyData.setAddress("IND");
		Response PojoRes=given().contentType(ContentType.JSON).body(BodyData).when()
				.post ("http://localhost:3000/friends");
		
		System.out.println("Status code is " + PojoRes.statusCode());
		System.out.println("...............CompJson Data is ...............");
		System.out.println(PojoRes.asString());
		
	}
}
