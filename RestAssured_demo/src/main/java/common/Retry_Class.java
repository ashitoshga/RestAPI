package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//copy the implementation of IRetryAnalyzer from Testng doc
public class Retry_Class implements IRetryAnalyzer{

	  private int retryCount = 0;
	  private static final int maxRetryCount = 3;
	  
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
		      retryCount++;
		      return true;
		    }
		    return false;
		  	}

}
