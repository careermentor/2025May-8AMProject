package org.xyz.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FetchDataActualValues 
{
	WebDriver driver;
	
	@Test
	public void launchbrowser()
	{
		driver = new ChromeDriver();  //launch a chrome browser
		driver.manage().window().maximize();
		
		String expURL = "https://www.facebook.com/";
		
		driver.get(expURL);   //pass the url
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertEquals(actURL, expURL);
		
		String expTitle = "Facebook – log in or sign up";
		
		String actTitle = driver.getTitle();
		
		System.out.println(actTitle);
		
		Assert.assertEquals(actTitle, expTitle);
		
		String expusernametext = "Email address or phone number";
		String actusernametext = driver.findElement(By.id("email")).getDomAttribute("placeholder");
		
		Assert.assertEquals(actusernametext, expusernametext);
		
		
		
		Assert.assertEquals(driver.findElement(By.name("login")).getText(), "Log in");
		
		//System.out.println(driver.findElement(By.name("login")).getLocation());
		
		//System.out.println(driver.getPageSource());
		
	}
	
	
}
