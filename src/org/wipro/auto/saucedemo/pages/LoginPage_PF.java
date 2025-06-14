package org.wipro.auto.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.saucedemo.utilitiespkg.ReadPropertiesFiles;

public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(css = "[value='Login']")
	WebElement loginbttn;
	

	public void enter_username(String uname) throws Exception
	{
		username.sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		password.sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		loginbttn.click();
	}
}
