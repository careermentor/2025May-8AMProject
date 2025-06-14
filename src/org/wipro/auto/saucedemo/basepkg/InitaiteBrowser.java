package org.wipro.auto.saucedemo.basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.saucedemo.utilitiespkg.ReadPropertiesFiles;

public class InitaiteBrowser
{

	public WebDriver driver;
	

	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropertiesFiles.readconfig("Browsername").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropertiesFiles.readconfig("Browsername").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropertiesFiles.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
