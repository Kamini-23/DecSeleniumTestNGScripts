package testNgScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeClass
	public void openbrowser()
	{
		System.out.println("Opent he chromebrowser");
		System.out.println("open the webapp");
		System.out.println("login into mail box");
	}
	
	@BeforeMethod
	public void createuser()
	{

		System.out.println("createuser by sonal");
		System.out.println("createuser by sonal");
		System.out.println("createuser by sonal");
		System.out.println("createuser by sonal");
		System.out.println("createuser by sonal");
		System.out.println("createuser by sonal");
		System.out.println("createuser by sonal");

		System.out.println("createuser added by MAC");

	}
	@Test
	public void method1()
	{
		System.out.println("this is method with no priority");
	}
	@Test(priority='1')
	public void createemail()
	{
		System.out.println("to create email test steps executed");
	}
	@Test(priority='2')
	public void modifyemail()
	{
		System.out.println("to modify email test steps executed");
	}
	@Test(priority='3')
	public void deleteemail()
	{
		System.out.println("to delete email test steps executed");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout into mail box");
		System.out.println("close the browser");
	}

}
