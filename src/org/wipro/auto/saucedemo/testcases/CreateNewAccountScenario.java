package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basepkg.InitaiteBrowser;
import org.wipro.auto.saucedemo.pages.RegisterPage;

public class CreateNewAccountScenario extends InitaiteBrowser
{

	@Test
	public void tc01_validate_usercan_create_new_account() throws Exception
	{
		RegisterPage reg = new RegisterPage(driver);  
		
		reg.click_register();
		reg.enter_username("user1");
		reg.enter_email("user@gmail.com");
		reg.enter_password("pas1234");
		reg.enter_postal_code("6868");
		reg.select_country("United States");
		reg.click_termsconditions();
		reg.click_creataccountbttn();
	
	}
	
	
}
