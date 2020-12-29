package testNgScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.Xls_dataProvider;

public class POIDemo {
	
	
	 WebDriver driver;
	
	 
	 @BeforeClass

	 public void startbrowser()
	 {
		 Reporter.log("we are using data provider annotation"+"we are fetching data from excel sheet"); 

		 		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
	 	
	 }
	 
	 
	@Test(priority='1',dataProvider="testdata")
	public  void wikipagedata(String name, String password, String retype, String email)
	{
		driver.findElement(By.id("wpName2")).clear();
		
		driver.findElement(By.id("wpName2")).sendKeys(name);
		
		
		driver.findElement(By.id("wpPassword2")).clear();
		driver.findElement(By.id("wpPassword2")).sendKeys(password);
		driver.findElement(By.id("wpRetype")).clear();
		driver.findElement(By.id("wpRetype")).sendKeys(retype);
		driver.findElement(By.id("wpEmail")).clear();
		driver.findElement(By.id("wpEmail")).sendKeys(email);
	}
	
	
	// Our filetype is .xlsx
	
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws EncryptedDocumentException, IOException
	{
		Object input[] []=Xls_dataProvider.getTestData("Sheet1");
		return input;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public Object[][] readExcel() throws EncryptedDocumentException, IOException
	
	{
		Reporter.log("read the location of excel file", true);
		
		FileInputStream file=  new FileInputStream("C:\\Users\\vishal mittal\\Desktop\\testdata.xlsx");
		
		Reporter.log("getting workbook from above file location", true);
		
		Workbook book;
		book= WorkbookFactory.create(file);
		
		Reporter.log("Sheet is fetched from the workbook which at location file", true);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Reporter.log("Counting till the last row which has data in the sheet", true);
		int row= sheet.getLastRowNum();
		
		Reporter.log("Counting till the last col which has data in the sheet", true);
	    
		int col= sheet.getRow(0).getLastCellNum();
		
		
		Object[][] inputData= new Object[row][col];
		
		for(int i=0; i<row;i++)
		{
			for( int j=0; j<col;j++)
			{
				inputData[i][j]= sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		Reporter.log("Data is supplied to my test method", true);
		return inputData;
		
			
		
	}
*/
}















