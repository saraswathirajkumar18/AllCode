package codeChallange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;

public class DragDropChallange {
	WebDriver driver;
	Actions action;
	
@BeforeSuite
@Parameters({"drivername","driverpath"})
public void browserSetup(String webdrivername,String webdriverpath)
{
	System.setProperty(webdrivername,webdriverpath);
	switch(webdrivername)
	{
	case "webdriver.chrome.driver":
	    driver=new ChromeDriver();
	    break;
	case "webdriver.gecko.driver":
		  driver = new FirefoxDriver();
	      break;
	case "webdriver.edge.driver":
		driver = new EdgeDriver();
	      break;
    default:System.out.println("Pls choose any one from these browsers:chrome,Firefox,Microsoft Edge");
	
	}
	
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

	JavascriptExecutor js = (JavascriptExecutor) driver;  
	js.executeScript("window.scrollBy(0,1100)");
	
	PageFactory.initElements(driver,PageElements.class);
	action=new Actions(driver);
}
//place capital in country

@Test(priority=0)

public void allMatchCase()
	{
		  action.dragAndDrop(PageElements.oslo,PageElements.norway).build().perform();
		  action.dragAndDrop(PageElements.stockholm,PageElements.sweden).build().perform();
		  action.dragAndDrop(PageElements.washington,PageElements.unitedstates).build().perform();
		  action.dragAndDrop(PageElements.copenhagen,PageElements.denmark).build().perform();
		  action.dragAndDrop(PageElements.seoul,PageElements.southkorea).build().perform();
		  action.dragAndDrop(PageElements.rome,PageElements.italy).build().perform();
		  action.dragAndDrop(PageElements.madrid,PageElements.spain).build().perform(); 
	}
@Test(priority=2)
public void partialMatchCase()
	{
		  action.dragAndDrop(PageElements.oslo,PageElements.sweden).build().perform();
		  action.dragAndDrop(PageElements.stockholm,PageElements.norway).build().perform();
		  action.dragAndDrop(PageElements.washington,PageElements.unitedstates).build().perform();
		  action.dragAndDrop(PageElements.copenhagen,PageElements.denmark).build().perform();
		  action.dragAndDrop(PageElements.seoul,PageElements.southkorea).build().perform();
		  action.dragAndDrop(PageElements.rome,PageElements.spain).build().perform();
		  action.dragAndDrop(PageElements.madrid,PageElements.italy).build().perform(); 
		  
	}
@Test(priority=1)
public void noneMatchCase()
	{
		  action.dragAndDrop(PageElements.oslo,PageElements.southkorea).build().perform();
		  action.dragAndDrop(PageElements.stockholm,PageElements.norway).build().perform();
		  action.dragAndDrop(PageElements.washington,PageElements.denmark).build().perform();
		  action.dragAndDrop(PageElements.copenhagen,PageElements.unitedstates).build().perform();
		  action.dragAndDrop(PageElements.seoul,PageElements.sweden).build().perform();
		  action.dragAndDrop(PageElements.rome,PageElements.spain).build().perform();
		  action.dragAndDrop(PageElements.madrid,PageElements.italy).build().perform(); 
		  
	}
//place capital back to its position
@AfterMethod
public void putCapitalback()
{
	WebElement[] allcapital = {PageElements.oslo,PageElements.stockholm,PageElements.washington,PageElements.copenhagen,PageElements.seoul,PageElements.rome,PageElements.madrid};
	  
	  for(WebElement capital:allcapital)
	  {  //String color="#00ff00";
		 String elecolor =capital.getCssValue("background-color");
		 String hexcolor = Color.fromString(elecolor).asHex();
		 String content=capital.getText();
		 //System.out.println(hex);
		 //String[] arrColor = hex.split("#");
		 //assertTrue(arrColor[1].equals("008000"));
		 //System.out.println("color is "+color);
		 if(hexcolor.equals("#00ff00"))
		 {
			System.out.println(content +" is placed in correct country"); 
		 }
		 else
		 {
			 System.out.println(content +" is placed in wrong country");
			
		 }
		 
	  }
	  action.dragAndDrop(PageElements.oslo,PageElements.capitalArea).build().perform();
	  action.dragAndDrop(PageElements.stockholm,PageElements.capitalArea).build().perform();
	  action.dragAndDrop(PageElements.washington,PageElements.capitalArea).build().perform();
	  action.dragAndDrop(PageElements.copenhagen,PageElements.capitalArea).build().perform();
	  action.dragAndDrop(PageElements.seoul,PageElements.capitalArea).build().perform();
	  action.dragAndDrop(PageElements.rome,PageElements.capitalArea).build().perform();
	  action.dragAndDrop(PageElements.madrid,PageElements.capitalArea).build().perform();
	 
	  
}
@AfterSuite
public void closeBrowser()
{
driver.close();
}
}