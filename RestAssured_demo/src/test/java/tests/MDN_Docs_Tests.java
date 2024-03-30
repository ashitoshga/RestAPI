package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MDN_Docs_Tests {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\InterviewQ\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/button");
		//Thread.sleep(6000);		
		//clickme button		
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"sample-code-frame\" and @title=\"Button with a value sample\"]"));
//		driver.switchTo().frame(iframe);
//		Thread.sleep(3000);		
//		WebElement clickmebtn = driver.findElement(By.xpath("//input[@type=\"button\" and @value=\"Click Me\"]"));
//		System.out.println(clickmebtn.isDisplayed());
//		Thread.sleep(3000);
//		clickmebtn.click();
		//Thread.sleep(3000);
		
		//<input type="number">
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/number");
		Thread.sleep(6000);		
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"sample-code-frame\" and @title=\"Button with a value sample\"]"));
//		driver.switchTo().frame("output-iframe");
		//Thread.sleep(3000);
		WebElement label = driver.findElement(By.xpath("//div[@id=\"html-output\"]/label"));
		//WebElement inputbox =  driver.findElement(By.xpath("//input[@type=\"number\" and @name=\"tentacles\"]"));
		
		System.out.println(label.isDisplayed());
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
	
}