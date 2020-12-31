package testNgScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Annotations2 {
	
WebDriver driver;

	

	@BeforeClass

	public void startBrowswer()

	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
	 	


	}

	

	@Test(priority ='1', dataProvider ="testData")

	public void wikipagedata(String name ,String Pword,String conPword,String email)

	{

			driver.findElement(By.id("wpName2")).clear();

			driver.findElement(By.id("wpName2")).sendKeys(name);

			driver.findElement(By.id("wpPassword2")).clear();

			driver.findElement(By.id("wpPassword2")).sendKeys(Pword);

			driver.findElement(By.id("wpRetype")).clear();

			driver.findElement(By.id("wpRetype")).sendKeys(conPword);

			

			driver.findElement(By.id("wpEmail")).clear();

			driver.findElement(By.id("wpEmail")).sendKeys(email);

			

	}

	

	

	

	@DataProvider(name ="testData")

	public  Object[][] readData() throws BiffException, IOException 

	{

	File f = new File ("C:\\\\Users\\\\vishal mittal\\\\Desktop\\\\mydata.xls")	;

	



 Workbook w = Workbook.getWorkbook(f);

Sheet s = w.getSheet("Sheet1");



 int row = s.getRows();

 int col =s.getColumns();

 String input  [][] =new String [row][col];

 for(int i = 0;i<row;i++) {

	 for(int j =0; j<col;j++) {

		 Cell c = s.getCell(j,i);

	 input[i][j]= c.getContents();


	 }

 }

 return input;

	}
	
}
