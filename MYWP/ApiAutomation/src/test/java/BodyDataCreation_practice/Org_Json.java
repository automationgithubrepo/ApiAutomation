package BodyDataCreation_practice;

import org.json.JSONObject;

public class Org_Json 
{
	public static JSONObject js;
	public static JSONObject CompJs;
	public static JSONObject Address;
  public static void SimpleorgJson()
  {
	    js= new JSONObject();
		js.put("id", "1004");
		js.put("FisrtName", "Sumit");
		js.put("MiddleName", "Kumar");
		js.put("LastName", "Mishra");
		js.put("Post", "TestEngineer");
		js.put("Age", "26");  
  }
  public static void ComplexJson()
  {
	  
	  Address= new JSONObject(); 
	  Address.put("At", "KPDP");
	  Address.put("Post", "KPDP");
	  Address.put("Dist", "KJR");
	  Address.put("NAT", "IND");
	  
	  CompJs= new JSONObject();
	  CompJs.put("id", "1005");
	  CompJs.put("FisrtName", "Gurumit");
	  CompJs.put("MiddleName", "Kumar");
	  CompJs.put("LastName", "Mishra");
	  CompJs.put("Post", "TestEngineer");
	  CompJs.put("Age", "26");  
	  CompJs.put("Address", Address);  
  
  }

  
}
