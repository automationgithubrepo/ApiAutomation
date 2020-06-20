package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

import junit.framework.Assert;

public class ResponseDataValidationUsingJsonPath {

	public static void responseData(String exptData, Response res,String jsonPath)
	{
		String actualData= res.jsonPath().getString(jsonPath);
		Assert.assertEquals(actualData,exptData);
		
	}
	
	
	
}
