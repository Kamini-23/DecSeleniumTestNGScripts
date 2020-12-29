package testNgScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
	public void method1()
	{
		System.out.println("this method is executed before every test");
	}
	
	@Test
	public void method2()
	{
		System.out.println("this is a test method of annotations2 class");
	}

}
