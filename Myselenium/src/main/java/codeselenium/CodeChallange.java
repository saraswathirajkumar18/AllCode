package codeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CodeChallange {
	public static void check()
	{
		list String[][]	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//capitals
		
		  WebElement oslo=driver.findElement(By.id("box1")); 
		  WebElement stockholm=driver.findElement(By.id("box2")); 
		  WebElement washington=driver.findElement(By.id("box3")); 
		  WebElement copenhagen=driver.findElement(By.id("box4"));
		  WebElement seoul=driver.findElement(By.id("box5"));
		  
		  WebElement rome=driver.findElement(By.id("box6")); 
		  WebElement madrid=driver.findElement(By.id("box7")); 
		  //country 
		  WebElement norway=driver.findElement(By.id("box101")); 
		  WebElement sweden=driver.findElement(By.id("box102")); 
		  WebElement unitedstates=driver.findElement(By.id("box103")); 
		  WebElement denmark=driver.findElement(By.id("box104")); 
		  WebElement southkorea=driver.findElement(By.id("box105")); 
		  WebElement italy=driver.findElement(By.id("box106"));  
		  WebElement spain=driver.findElement(By.id("box107"));
		  
		  WebElement capitalArea=driver.findElement(By.id("dropContent"));
		  //osolo,sweden
		  Actions a=new Actions(driver); 
		  //place capital to its country
		  a.dragAndDrop(oslo,norway).build().perform();
		  if(oslo.getAttribute(back))
		  a.dragAndDrop(stockholm,sweden).build().perform();
		  a.dragAndDrop(washington,unitedstates).build().perform();
		  a.dragAndDrop(copenhagen,denmark).build().perform();
		  a.dragAndDrop(seoul,southkorea).build().perform();
		  a.dragAndDrop(rome,italy).build().perform();
		  a.dragAndDrop(madrid,spain).build().perform(); 
		  //place capital in its box
		  a.dragAndDrop(oslo,capitalArea).build().perform();
		  a.dragAndDrop(stockholm,capitalArea).build().perform();
		  a.dragAndDrop(washington,capitalArea).build().perform();
		  a.dragAndDrop(copenhagen,capitalArea).build().perform();
		  a.dragAndDrop(seoul,capitalArea).build().perform();
		  a.dragAndDrop(rome,capitalArea).build().perform();
		  a.dragAndDrop(madrid,capitalArea).build().perform();
		  
		  //a.dragAndDrop(capital1, cap).build().perform();
		 ///Actions a=new Actions(driver);
//a.dragAndDrop(CountryCapitalPageObject.oslo(driver),CountryCapitalPageObject.norway(driver)).build().perform();

		
	}

}
