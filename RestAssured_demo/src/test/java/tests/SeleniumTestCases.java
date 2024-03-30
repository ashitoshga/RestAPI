package tests;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTestCases {
	
	//RemoteWebDriver driver;
	//public static WebDriver driver;
	/*
	 * @BeforeSuite public void launchBrowser() { //WebDriver driver = new
	 * ChromeDriver(); WebDriverManager.chromedriver().setup(); WebDriver driver =
	 * new ChromeDriver(); driver.manage().window().maximize();
	 * 
	 * //Create instance of ChromeOptions Class ChromeOptions handlingSSL = new
	 * ChromeOptions(); driver=new ChromeDriver(handlingSSL);
	 * handlingSSL.setAcceptInsecureCerts(true); //Using the accept insecure cert
	 * method with true as parameter to accept the untrusted certificate
	 * //handlingSSL.setAcceptInsecureCerts(true); //public WebDriver driver=new
	 * ChromeDriver(handlingSSL); }
	 */
	

			
	//ChromeDriver dri = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();		
//		driver.manage().window().maximize();
		
		//Create instance of ChromeOptions Class
		ChromeOptions handlingSSL = new ChromeOptions();
		WebDriver driver=new ChromeDriver(handlingSSL);
		handlingSSL.setAcceptInsecureCerts(true);
		
		try {
			driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/button");
			//driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio");
			//driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//input[@value=\"Add to favorites\"]")).click();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(10000);
		/*
		 * WebElement ele2=
		 * driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]"));
		 * Thread.sleep(3000); ele2.sendKeys("Ashitosh"); Thread.sleep(3000);
		 * ele2.sendKeys(Keys.ENTER); System.out.println("Script ended");
		 */
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.ScrollBy(0,250)", "");
		
//		WebElement ele = driver.findElement(By.id("tentacles"));
//		WebElement ele1 = driver.findElement(By.xpath("//input[@type=\"number\" and @name=\"tentacles\"]"));
//		WebElement ele2 = driver.findElement(By.className("number"));
//		WebElement ele3 = driver.findElement(By.tagName("input"));
//		
//		Thread.sleep(5000);
//		
//		System.out.println(ele.isDisplayed());
//		Thread.sleep(5000);
//		System.out.println(ele.isEnabled());
//		
//		System.out.println(ele1.isDisplayed());
//		Thread.sleep(5000);
//		System.out.println(ele1.isEnabled());
//		
//		System.out.println(ele2.isDisplayed());
//		Thread.sleep(5000);
//		System.out.println(ele2.isEnabled());
//		
//		System.out.println(ele3.isDisplayed());
//		Thread.sleep(5000);
//		System.out.println(ele3.isEnabled());
//		
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tentacles")));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//WebElement ele = driver.findElement(By.xpath("//input[@type=\"number\" and @id=\"tentacles\"]"));
		//WebElement ele = driver.findElement(By.xpath("//input[@id=\"dewey\"]"));
		//ele.clear();
		//ele.sendKeys("Ashitosh");
		//ele.clear();
		Thread.sleep(5000);
		//ele.click();
		//ele.sendKeys("100");		
//		ele.sendKeys("123");
//		Thread.sleep(5000);
		//ele.sendKeys(Keys.ENTER);
//		System.out.println("Script ended");
		//Thread.sleep(20000);
//		//driver.quit();
		driver.close();

	}

}
