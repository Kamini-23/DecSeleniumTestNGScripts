package testNgScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification {
	
	//SoftAssertion: here we verify the results and not validate				
	// if expectedtitle & actualtitle  match, script will continue to execute
	// if expectedtitle & actualtitle  donot match,
	//script will continue the execution,but will also give error message to user where results donot match			
  // SoftAssert, assertequals(actual, expected)
	// create object for SoftAssert class
	// call method assertequals();
	//in the last , call method asserAll;
	
	
	@Test
	public void myverfication()
	{
		Reporter.log("this is my test case for checking validation");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
				
		
				WebDriver driver = new ChromeDriver();	
				driver.manage().window().maximize();
				driver.get("https://www.wikipedia.org/");
				
				String expectedtitle="Wikipedia123";
				String actualtitle=driver.getTitle();
				Reporter.log("Saved current title value in varibale title");
				SoftAssert sf = new SoftAssert();
				
				sf.assertEquals("Wikipedia", "Wikipedia123", "expecttitle doesnot match actual title");
				
				String expectedurl="https://www.wikipedia123.org/";
				String url=driver.getCurrentUrl();
				Reporter.log("Saved current url value in varibale url");		
				System.out.println(url);
				
				sf.assertEquals(url, expectedurl," expected url doenot match the actual url");
				
				sf.assertAll();
	}

}



