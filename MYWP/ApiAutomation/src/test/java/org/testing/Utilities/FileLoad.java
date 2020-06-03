package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class FileLoad 
{
	public static Properties propertiesLoad(String Path) throws IOException
	{
	File f=new File(Path);
	FileInputStream fi=new FileInputStream(f);
	Properties pr=new Properties();
	pr.load(fi);
	return pr;
	}
	public static String JsonObjectData(String path) throws FileNotFoundException
	{
	File f=new File(path);
	FileInputStream fi=new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONObject obj=new JSONObject(js);
	String Data=obj.toString();
	return Data;
	}
	public static String JsonArrayData(String path) throws FileNotFoundException
	{
	File f=new File(path);
	FileInputStream fi=new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONArray obj2=new JSONArray(js);
	String Data=obj2.toString();
	return Data;
	}
	
}