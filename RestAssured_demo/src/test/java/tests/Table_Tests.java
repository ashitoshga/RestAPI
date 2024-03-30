package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Tests {
		WebDriver driver;
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find all rows in the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println("Num of rows are"+" "+rows.size());
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']//td"));
		System.out.println("Num of columns are"+" "+col.size());
		
		//rows values
		for(WebElement ele:rows)
		{
			String str = ele.getText();
			System.out.println("col values are"+" "+str);
		}
		
		//col values
		for(WebElement el2:col)
		{
			String str = el2.getText();
			System.out.println("col values are"+" "+str);
		}
		
		//Now get the data(row values) from any column
		//there are 2 columns, get all the row values for column 3 - place
		//op-Delhi, Pune, Bang, Mum
		
		//finding table first
		WebElement table = driver.findElement(By.id("table1"));
		//finding all headers-col names under table element
		List<WebElement> headers = table.findElements(By.xpath("//table[@id='table1']//th"));
		//now get all values of these headers
		List<String> headervalues = new ArrayList();
		
		for(WebElement ele: headers)
		{
			String headervalue = ele.getText();
			//store header values into a list 
			headervalues.add(headervalue);			
		}
		
		//get row value for a particular column from headervalues
		String col_name = "Place";
		//cal index of col
		int col_indx = headervalues.indexOf(col_name);
		List<WebElement> col_data = table.findElements(By.xpath("//td["+(col_indx+1)+ "]"));
		for(WebElement ele:col_data)
		{
			System.out.println("row values for"+" "+col_name+" "+"is"+ " "+ele.getText());
		}
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
