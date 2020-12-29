package testNgScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertBox {

@Test
public void messagecheck() throws InterruptedException {

	Reporter.log("This test case is to check alert box",true);
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		
Reporter.log("opening chrome browser",true);
		WebDriver driver = new ChromeDriver();	
		//driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//click on sign button
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		// switching from webpage to alert box
		
		Thread.sleep(2000);
	
		Alert a= driver.switchTo().alert();
	
		Reporter.log("step to get error message",true);
	String errorText= a.getText();
	
	//Assert.assertEquals(errorText, "Please enter the a valid user name","message doesnot match");
	
	SoftAssert sf = new SoftAssert();
	
	sf.assertEquals(errorText, "Please enter the a valid user name","message doesnot match");
	

	
	System.out.println(errorText);
	
	Thread.sleep(3000);
	
	a.accept();
	
  
	driver.close(); 
	sf.assertAll();
		 
	}

}
