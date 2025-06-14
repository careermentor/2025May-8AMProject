package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basepkg.InitaiteBrowser;
import org.wipro.auto.saucedemo.pages.LoginPage_PF;
import org.wipro.auto.saucedemo.utilitiespkg.ReadPropertiesFiles;

public class LoginScenario extends InitaiteBrowser
{

	@Test
	public void tc01_validate_loginfunc_valid_credntials() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);  
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		///because "this.driver" is null
	}
	
	@Test
	public void tc01_validate_loginfunc_valid_credntials_prop() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);  
		
		login.enter_username(ReadPropertiesFiles.readconfig("username"));
		login.enter_password(ReadPropertiesFiles.readconfig("password"));
		login.click_loginbttn();
		
		///because "this.driver" is null
	}
	
}
