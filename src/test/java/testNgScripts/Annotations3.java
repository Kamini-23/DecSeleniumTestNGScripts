package testNgScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
	
	@BeforeSuite
	public void method1()
	{
		System.out.println("this method is executed before the suite");
	}
	
	@BeforeClass
	public void method3()
	{
		System.out.println("this method is executed as first method of Annotations3 class");
	}
	
	@Test
	public void method2()
	{
		System.out.println("this is a test method of annotations3 class");
	}


}
