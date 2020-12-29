package testNgScripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDowns {


@Test
public void dropdowncheck() throws InterruptedException {

		
		// Select - 2 methods : selectByIndex and SelectByVisibleText
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
	//1. Select the dropDown
		WebElement e= driver.findElement(By.xpath("//select[@name='coffee']"));
		
           Select dd =new Select(e);
		
           
           dd.selectByIndex(2);  // with sugar
           
           Thread.sleep(3000);
           
           dd.selectByVisibleText("With cream & sugar");
           Thread.sleep(3000);
           
           dd.selectByValue("crisp");
           
           Thread.sleep(3000);
           
           
           List<WebElement> l= dd.getOptions();
           
  
           
      int count=     l.size();
      
      System.out.println(count);
           
      // Assignment: print all the values of the dropdown using for-each loop
      
      for(int i=0; i<count;i++)
		{
			System.out.println(l.get(i).getText());
			
			
		}
		    
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
		
		
		
		
		
		
		
		
	}

}
