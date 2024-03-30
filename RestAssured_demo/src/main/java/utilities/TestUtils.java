package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import common.Base_Class;

public class TestUtils extends Base_Class{
	
	//constuctor
	public void TestUtils()
	{
		//WebDriver driver;
		//no need to initialize driver here as we are extending Base_Class where it is already initilized
		
	}
	
	public static void  takescreenshot() throws IOException
	{
		Date current_date = new Date();
		System.out.println(current_date);
		String screenshot_name = current_date.toString().replace(" ", "-").replace(":", "-");
		File screenshot_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_file, new File(".//screenshot" + screenshot_name + ".png"));
	}



}
