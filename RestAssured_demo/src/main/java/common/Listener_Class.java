package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.TestUtils;

//extending  TestUtils class as it has method to take screenshots
public class Listener_Class extends TestUtils implements ITestListener{
	//creating a new class that implements all methods from ITestListener
	//we can use these methods to listen to test cases/classes and will log the report
	//e.g. create a method for all failed test cases take a screenshot
	//after implementing these methods, modify TestNG xml and include Listener tag
	
	//go to Menu bar>>Source>>Override/Implement method option
	//choose methods that you want to implement

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("Test case started from Listener_Class");
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("Test case Succeded from Listener_Class");
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("Test case failed from Listener_Class");
		
		//taking screenshot for failed step
		try {
			takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		System.out.println("Test case Skipped from Listener_Class");
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		System.out.println("Test case Timeout from Listener_Class");
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
	
	

}
