package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basepkg.InitaiteBrowser;
import org.wipro.auto.saucedemo.datagenerator.TestDataGenerator;
import org.wipro.auto.saucedemo.pages.LoginPage_PF;
import org.wipro.auto.saucedemo.utilitiespkg.ReadPropertiesFiles;

public class LoginScenario_DDF extends InitaiteBrowser
{

	@Test(dataProvider="ddf_data",dataProviderClass=TestDataGenerator.class)
	public void tc01_validate_loginfunc_valid_credntials(String username, String password) throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);  
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	
	}
	
	
	
}
