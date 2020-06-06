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
	public static Properties propertiesLoad(String PropPath) throws IOException
	{
	File f=new File(PropPath);
	FileInputStream fi=new FileInputStream(f);
	Properties pr=new Properties();
	pr.load(fi);
	return pr;
	}
	public static String JsonObjectData(String JSObjpath) throws FileNotFoundException
	{
	File f=new File(JSObjpath);
	FileInputStream fi=new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONObject obj=new JSONObject(js);
	String Data=obj.toString();
	return Data;
	}
	public static String JsonArrayData(String JSArraypath) throws FileNotFoundException
	{
	File f=new File(JSArraypath);
	FileInputStream fi=new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONArray obj2=new JSONArray(js);
	String Data=obj2.toString();
	return Data;
	}
}