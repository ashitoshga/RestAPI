package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver = null;
	
	@BeforeSuite
	public static void launchBrowser()
	{
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}

}
