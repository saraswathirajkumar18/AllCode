package dataDrivenProject;

import java.io.IOException;
import java.io.*; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class DataProviderUsingExcel {
	WebDriver driver;
	
	String[][] userdata;
	
	 @DataProvider(name="excelData") 
	 public String[][] loginDetails() throws
	 BiffException, IOException 
	 { 
	 userdata=readExcelData(); 
	 return userdata; 
	 }
	
	
	public String[][] readExcelData()
		throws IOException, BiffException
{
	FileInputStream excelfile=new FileInputStream("C:\\Users\\krajk\\OneDrive\\Desktop\\Testdata2.xls");
	Workbook book=Workbook.getWorkbook(excelfile);
	Sheet excelsheet=book.getSheet(0);
	int noofrow=excelsheet.getRows();
	int noofcol=excelsheet.getColumns();
	String exceldata[][]=new String[noofrow-1][noofcol];
	for(int i=1;i<noofrow;i++)
	{
		for(int j=0;j<noofcol;j++)
		{
		exceldata[i-1][j]=excelsheet.getCell(j, i).getContents(); 	
		}
	}
	return exceldata;
}
@BeforeTest
public void beforeTest()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
	 driver=new ChromeDriver();

}
@Test(dataProvider="excelData")
public void excelDataValidation(String uname,String upass) throws InterruptedException
{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement user=driver.findElement(By.name("username"));
	user.sendKeys(uname);
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys(upass);
	WebElement loginbutton=driver.findElement(By.xpath("//button[text()=' Login ']"));
    loginbutton.click();	
	

}
@AfterTest
public void afterTest()
{
	driver.close();
}

}
