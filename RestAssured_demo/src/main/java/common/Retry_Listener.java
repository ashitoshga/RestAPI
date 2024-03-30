package common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//import org.testng.internal.annotations.IAnnotationTransformer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Retry_Listener implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
		//calling Retry_Class which has retry method
		annotation.setRetryAnalyzer(Retry_Class.class);
		//now modify testng.xml and this under Listener tag
		//<listener class-name="common.Retry_Listener"></listener>
	}

}
