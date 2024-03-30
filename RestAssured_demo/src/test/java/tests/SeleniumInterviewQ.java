package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumInterviewQ {
	static WebDriver driver = new ChromeDriver();

	
	  //static WebDriverWait wait1 = new WebDriverWait(driver, 10);

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\InterviewQ\\chromedriver_win32");           


		  driver.get("https://demoqa.com/browser-windows"); 
			driver.manage().window().maximize();
			
			//Implicitwait is a global wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //driver.wait(10000);
			Thread.sleep(10000);
		  //old method deprecated
		  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  
			//JavaScriptExecutor
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("window.scrollBy(0,250)", "");
		  
		//Wait is Interface and WebDriverWait is a class which implements it	
		 WebElement windowButtonPARENT =  driver.findElement(By.id("windowButton"));
		 WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(5));
		 // wa.until(windowButtonPARENT.isDisplayed());
		
		 //	WebDriverWait wa = new WebDriverWait(driver, 10);
		 
		  WebElement btn = driver.findElement(By.id("windowButton"));
		  
		  //Using explicit wait-it is for particular elemem

		  wa.until(ExpectedConditions.visibilityOf(btn));
		  btn.click();
		
		  
		  String parentwin = driver.getWindowHandle();
		  System.out.println(parentwin);
		  
//		 Set<String> list = driver.getWindowHandles();
//		 Iterator li = list.iterator();
//		 while(li.hasNext())
//		 {
//			 String childwin = (String) li.next();
//			 if(!parentwin.equalsIgnoreCase(childwin))
//			 {
//				 driver.switchTo().window(childwin);
//				 System.out.println(childwin);
//				 WebElement text = driver.findElement(By.id("sampleHeading"));
//	                System.out.println("Heading of child window is " + text.getText());
//			 }
//		 }
		 
		 
			/*
			 * for(String item:list) { list.add(item); }
			 */
		 
		 
		 
		  //creating object reference for TakesScreenshot Interface
		  //For both JSEXE and TKSC we need to Typecast driver as they don't directly 
		  //implements WebDriver interface
		  
		  TakesScreenshot ts;
		  //coverting webdriver obj to TakesScreenshot obj(Typecasting)
		  ts = (TakesScreenshot) driver;
		  
		  //storing sc at temp loc
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  //moving sc to desired location
		  File dest = new File("C:\\Users\\Admin\\Desktop\\temp.png");
		  //copying src to dest
		  FileUtils.copyFile(src, dest);
		  driver.close();
		  
//		  //Read/Write data into excel
//		  //Worksheet is an Interface, both HSSF and XSSF classes implements this
//		  
//		 // WorkSheet ws;
//		  FileInputStream fs = new FileInputStream("E:\\Selenium_Practice\\INPUTSHEET.xls");
//		  XSSFWorkbook xssf = new XSSFWorkbook(fs);
//		  XSSFSheet xsheet = xssf.getSheetAt(0);
//		  XSSFRow row = xsheet.getRow(0);
		  
		  
		  
		 

	}

}
