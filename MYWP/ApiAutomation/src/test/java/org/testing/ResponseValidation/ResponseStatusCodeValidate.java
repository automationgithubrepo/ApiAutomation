package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate
{

	public static void ResponseStatusValidate(int exptStatusCode, Response res)
	{
		
		Assert.assertEquals(exptStatusCode,res.statusCode());
		
	}
	
	
	
	
	
}
