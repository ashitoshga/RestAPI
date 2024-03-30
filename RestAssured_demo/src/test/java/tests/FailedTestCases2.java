package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void testcase1()
	{
		System.out.println("testcase1 from FailedTestCases2");
		Assert.assertFalse(true);
		
	}
}
