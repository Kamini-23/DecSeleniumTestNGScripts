package testNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo {

	@Test
	public void framesdemo() throws InterruptedException {
		// TODO Auto-generated method stub

		
		//1 frame name: packageListFrame
		//2nd frame: packageFrame
		//3rd frame: classFrame
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		
		// switch to frame 1 -packageListFrame
		// click on the link
		
		// switch back to default content
		
		//switch to frame 3: classFrame
		//click on alink
		
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		Thread.sleep(2000);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	

}
