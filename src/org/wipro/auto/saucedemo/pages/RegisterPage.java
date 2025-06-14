package org.wipro.auto.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.saucedemo.utilitiespkg.ReadPropertiesFiles;

public class RegisterPage 
{

	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_register() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesFiles.readelement("home_register_xpath"))).click();
	}
	
	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFiles.readelement("new_account_username_id"))).sendKeys(uname);
	}
	
	public void enter_email(String email) throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFiles.readelement("new_account_email_id"))).sendKeys(email);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFiles.readelement("new_account_password_id"))).sendKeys(pass);
	}
	
	public void enter_postal_code(String pcode) throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFiles.readelement("new_account_postalCode_id"))).sendKeys(pcode);
	}
	
	public void select_country(String country) throws Exception
	{
		Select con = new Select(driver.findElement(By.id(ReadPropertiesFiles.readelement("shipping_address_country"))));
		con.selectByVisibleText(country);
	}
	
	public void click_termsconditions() throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFiles.readelement("new_account_terms_id"))).click();
	}
	
	public void click_creataccountbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFiles.readelement("new_account_createAccount_name"))).click();
	}
}
