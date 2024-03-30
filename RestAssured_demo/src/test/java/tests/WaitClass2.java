package tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitClass2 {
	 static WebDriver driver;
	 static JavascriptExecutor jse;
	 
	 public void WaitClass2 () {
		 System.setProperty("webdriver.chrome.driver",
    	         "C:\\Users\\Admin\\Desktop\\InterviewQ\\chromedriver_win32\\chromedriver.exe");
    	      driver= new ChromeDriver();
	 }

	
	@Test
	public void jse_wait()
	{
	      try{
    	      //implicit wait
    	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	      //URL launch
    	      driver.get("https://www.tutorialspoint.com/index.htm"); 
    	      
 	         // Javascript Executor for ready state
 	         jse = (JavascriptExecutor)driver;
 	         if (jse.executeScript("return document.readyState").toString().equals("complete")){
 	            System.out.println("Page in ready state"); }
 	         } catch(Exception exe) {
 	            System.out.println("Page not in ready state");
 	         }
 	         driver.close();
	}

}
