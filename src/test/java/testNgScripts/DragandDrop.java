package testNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		
	 	WebDriver driver = new ChromeDriver();
	 	driver.manage().window().maximize();
		
driver.get("https://jqueryui.com/droppable/");

driver.switchTo().frame(0);

Actions action = new Actions(driver);

WebElement e= driver.findElement(By.id("draggable"));

WebElement e1= driver.findElement(By.id("droppable"));

// drag and drop

// click an hold for sometime on the element 1 and  move it to another location of element 2, release, build and perform

action.clickAndHold(e).moveToElement(e1).release().build().perform();


//double click
                                   
//action.doubleClick(e).build().perform();
Thread.sleep(3000);
//right click on an element
//action.contextClick(e1).build().perform();
Thread.sleep(5000);













driver.switchTo().defaultContent();
Thread.sleep(5000);
action.contextClick(driver.findElement(By.linkText("Draggable"))).build().perform();















		
		
		
	}

}
