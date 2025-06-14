package org.xyz.automation.project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleKBMouse_WinAlertFrames 
{
	WebDriver driver;
	
	@Test(enabled=false)
	public void handleFrames()
	{
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
	
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
	}
	
	
	@Test
	public void handleAlerts() throws Exception
	{
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signin-btn")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		CaptureScreenshot.testresults(driver, "handleAlerts");
	
	}
	
	@Test
	public void handlemouse() throws Exception
	{
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://www.mphasis.com/home.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
//		act.click(driver.findElement(By.xpath("//span[text()=' Hospitality Services ']"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' Hospitality Services ']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsid = driver.getWindowHandles();  //line1
		System.out.println(windowsid);
		
		Iterator<String> itr = windowsid.iterator();  //line2
		
		String win1 = itr.next();  //line3
		String win2 = itr.next();
		
		driver.switchTo().window(win2);  //line4
		
		Thread.sleep(5000);
		
		CaptureScreenshot.testresults(driver,"handlemouse");
	
	}
	
	@Test(enabled=false)
	public void handlekeyboard()
	{
		driver = new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.facebook.com/");   //pass the url
		
		
		Actions act = new Actions(driver);
		
		//act.sendKeys("user1").perform();
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
	//	act.sendKeys(Keys.TAB).perform();
	//	act.sendKeys("pass1234").perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
	}
}
