package org.xyz.automation.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleAllWebsiteControls 
{
	WebDriver driver;
	
	@Test
	public void launchbrowser() throws Exception
	{
		driver = new ChromeDriver();  //launch a chrome browser
		driver.manage().window().maximize();
		
		driver.get("https://www.thetestingworld.com/testings/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");  //default data
		//Thread.sleep(5000);
		//driver.findElement(By.name("fld_username")).clear();
		//driver.findElement(By.name("fld_username")).sendKeys("user2");
		
	//	driver.findElement(By.xpath("//a[text()='Read Detail']")).click();
		
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		Select gender = new Select(driver.findElement(By.name("sex")));
		//gender.selectByIndex(1);
		//gender.selectByValue("2");
		
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("datepicker")).sendKeys("04/16/2010");
		driver.findElement(By.xpath("//a[text()='16']")).click();
		
		Select con = new Select(driver.findElement(By.name("country")));
		
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		
		
		st.selectByVisibleText("Arizona");
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
	
		System.out.println(driver.findElement(By.cssSelector("[value='Sign up']")).isEnabled());
		
		System.out.println(driver.findElement(By.cssSelector("[value='Sign up']")).isDisplayed());
		
		System.out.println(driver.findElement(By.cssSelector("[value='Sign up']")).getDomAttribute("value"));
		
	}
	
}
