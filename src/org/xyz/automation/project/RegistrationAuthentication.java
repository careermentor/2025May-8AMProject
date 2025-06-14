package org.xyz.automation.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationAuthentication 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.facebook.com/");   //pass the url
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	

	@Test
	public void tc01_valid_login_functionality()
	{
		driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
		
		
	//	WebElement username = driver.findElement(By.id("email"));
	//	username.sendKeys("user1");
		
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		WebElement el1 = driver.findElement(By.cssSelector("[type='submit']"));
		WebElement el2 = driver.findElement(By.cssSelector("[type='submit']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(el1, el2);
		act.dragAndDropBy(el1, 30, 40);
		
		
	
	}
	
	
	@Test
	public void tc02_valid_signup_functionality()
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
	}
	
}
