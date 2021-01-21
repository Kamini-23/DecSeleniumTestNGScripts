package testNgScripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollingTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(2000);
		
		// To scroll until the element is visible
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("scroll(0,1000)");
		
		Thread.sleep(2000);
		
		js.executeScript("scroll(0,-300)");
		
		
	/*	WebElement e= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", e);
		
		e.click();*/
		
		
	    takeScreenshot("Selenium screenshot page");
	}
	public static void takeScreenshot(String filename) throws Exception{
		
        //Convert web driver object to TakeScreenshot

        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //Copy file at destination
        File f1= new File("C:\\\\Users\\\\vishal mittal\\\\workspace\\\\SeleniumTraining9PM\\\\src\\\\seleniumScripts"+filename+".jpg");
            FileHandler.copy(f,f1);

}
		
		
		
		
		
		
		
		
		
	}


