package testNgScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Validate {
	// Assertions in TestNG : these helps us to validate and verify expected data to actual data
	//2 types  : Hard assertions   : Assert class , assertequals(expected output, actual output)
	// Soft assertions
	
	// validation of data using TestNG
	
	@Test
	public void myvalidation()
	{
		Reporter.log("this is my test case for checking validation");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
				
		
				WebDriver driver = new ChromeDriver();	
				driver.manage().window().maximize();
				driver.get("https://www.wikipedia.org/");
				
				String expectedtitle="Wikipedia123";
				String actualtitle=driver.getTitle();
				Reporter.log("Saved current title value in varibale title");		
				//Hard-Assertion to validate your output, Use Assert Class
				
				//Assert.assertEquals(actualtitle,expectedtitle ,"Script failed as title donot match as expected");
				
				// if expectedtitle & actualtitle  match, script will continue to execute
				// if expectedtitle & actualtitle  donot match, script will stop to execute
			
//SoftAssertion: here we verify the results and not validate				
				// if expectedtitle & actualtitle  match, script will continue to execute
				// if expectedtitle & actualtitle  donot match,
				//script will continue the execution,but will also give error message to user where results donot match			
	
				
				String expectedurl="https://www.wikipedia.org/";
				String url=driver.getCurrentUrl();
				Reporter.log("Saved current url value in varibale url");		
				System.out.println(url);
	}

}
