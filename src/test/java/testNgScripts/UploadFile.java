package testNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://filebin.net/");
		
		driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\vishal mittal\\Desktop\\input.xls");
		
		
	}

}
