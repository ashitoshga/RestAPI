package tests;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.appender.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.Base_Class;
import utilities.TestUtils;

//To run failed testcase-3 ways
//1. run testng-failed.xml which will only have failed methods
//2. Parameterize Test annotation with IRetryAnalyzer interface reference and bind all @Test
//3. create a new class same as Listener class and implements its I

public class FailedTestCases extends Base_Class{
	//WebDriver driver;
	String url ="";
	SoftAssert softassert;
	
	//Logger
	private static final Logger logger = (Logger) LogManager.getLogger(FailedTestCases.class);
	
	//2 method to retry using @Test
	//not feasible as for 500 failed tests we need manually modify @Test
	@Test(retryAnalyzer  = common.Retry_Class.class)
	public void testcase1() throws InterruptedException
	{
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		launchBrowser();
		logger.info("Login Success");
		driver.get("https://www.google.com");
		//driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/button");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@value=\"Add to favorites\"]")).click();
		System.out.println("testcase1 from FailedTestCases1");
	}
	
	@Test
	public void testcase2()
	{
		url = driver.getTitle();
		System.out.println("testcase2 from FailedTestCases1");
		Assert.assertEquals(url, "Google");
		//Assert.assertEquals(url, "MDN Web Docs");
	}
	
	//3rd method to retry tests using Retry_Listner class
	@Test(retryAnalyzer  = common.Retry_Class.class)
	public void testcase3()
	{
		url = driver.getTitle();
		System.out.println("testcase3 from FailedTestCases1");
		
		//using softassert as regular assert is throwing exception:
		//java.lang.AssertionError: expected [123] but found [Google]
		
		softassert = new SoftAssert();
		softassert.assertEquals(url, "123");
		softassert.assertAll();
		
//		try{
//			Assert.assertEquals(url, "123");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
	}
	@Test
	public void testcase4()
	{
		driver.close();
	}
}
