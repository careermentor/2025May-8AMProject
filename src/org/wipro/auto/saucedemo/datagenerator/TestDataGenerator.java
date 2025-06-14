package org.wipro.auto.saucedemo.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddf_data")
	public Object[][] testdata()
	{
		//String data1 = "standard_user";
		
		//Object[] data2 = {"standard_user","secret_sauce"};  //1-D array
		
		Object[][] data3 = {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}};  //2-D array
		return data3;
	}
	
	
	@DataProvider(name="ddf_data1")
	public Object[][] testdata1()
	{
		//String data1 = "standard_user";
		
		//Object[] data2 = {"standard_user","secret_sauce"};  //1-D array
		
		Object[][] data3 = {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}};  //2-D array
		return data3;
	}
	
	
}
