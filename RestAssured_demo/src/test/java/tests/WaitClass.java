package tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitClass {
	static WebDriver driver;
	JavascriptExecutor jse;

	public WaitClass()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		 jse = (JavascriptExecutor)driver;
	}
	
	@Test(priority=-1)
	public void timeouts()
	{		
		//using Timeouts to load all elements		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/");	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		
	}
	@Test(priority=0)
	public void timeouts1()
	{				
		//Implicit wait-Global wait	
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));		
	}
	
	//@Test(priority=1)
	public void timeouts2()
	{			
		//JavaScript EXECUTOR		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/");
		try {			
			Thread.sleep(20);
			System.out.println(jse.executeScript("return.document.readyState").toString());
			if(jse.executeScript("return.document.readyState").toString().equals("complete"))
			{
				System.out.println("Document loaded");
			}
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println("Document NOT loaded");
		}
		
		/*
		 * boolean bn =
		 * jse.executeScript("return.document.readyState").toString().equals("complete")
		 * ; System.out.println(bn);
		 */
	}
		
	@Test
	public void jse_wait()
	{
	      try{
    	      //implicit wait
    	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	      //URL launch
    	      driver.get("https://www.tutorialspoint.com/index.htm"); 
    	      Thread.sleep(30);
 	         // Javascript Executor for ready state
 	         jse = (JavascriptExecutor)driver;
 	         if (jse.executeScript("return document.readyState").toString().equals("complete")){
 	            System.out.println("Page in ready state"); }
 	         } catch(Exception exe) {
 	            System.out.println("Page not in ready state");
 	         }
 	        // driver.close();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
