package tests;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.Base_Class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor_methods{
	
	public static WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor jse;
	
	public void javaScriptExecutor_methods(){
		WebDriverManager.chromedriver().setup();
		
	}

	
	@Test(priority=-1)
	public void testcase1()
	{		
		driver.manage().window().maximize();
		driver.get("https://developer.mozilla.org");
		  //jse =(JavascriptExecutor)driver;
//		  String pageload;
//		  do {
//			   pageload = (String)jse.executeScript("return.document.readyState");
//			  //pageload.equals("complete");
//		  }
//		  while(pageload.equals("complete"));
//		  {
//			  System.out.println("Page loaded");
//		  }
		  
		  
		  try{
		         // Javascript Executor for ready state
		         JavascriptExecutor jse = (JavascriptExecutor)driver;
		  if (jse.executeScript("return document.readyState").toString().equals("complete")){
	            System.out.println("Page in ready state"); }
	         } catch(Exception exe) {
	            System.out.println("Page not in ready state");
	         }
		  
		  //another way is to use pageloadtime out
		 // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	}
	
	@Test
	public void testcase2()
	{
		driver.quit();
	}
	

}
