package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement 
{
  
	public static String JsonValueToVariable(String JsonData, String VariableName,String insertedValue )
	{
		
		String ReturnData=JsonData.replaceAll(Pattern.quote("{{"+VariableName+"}}"), insertedValue);
		return ReturnData;
		
		
	}
	
	
}
