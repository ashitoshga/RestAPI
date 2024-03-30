package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

public class LoggerTest {
	
	//not working
	private static final Logger logger = (Logger) LogManager.getLogger(tests.LoggerTest.class);

	@Test
	public void test1()
	{
		logger.info("Logger started");
		logger.debug("Debug msg");
		System.out.println("Logger test");
	}
	
}
