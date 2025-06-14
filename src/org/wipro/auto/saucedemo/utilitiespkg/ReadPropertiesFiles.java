package org.wipro.auto.saucedemo.utilitiespkg;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFiles 
{

	
	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
}
