package codeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
	    WebElement fruitseclect=driver.findElement(By.id("fruits"));
	     Select fruitopt=new Select(fruitseclect);
	     fruitopt.selectByVisibleText("Apple");
	//select multiple options
	     WebElement supheroselect=driver.findElement(By.id("superheros"));
	     Select supherooption=new Select(supheroselect);
	     supherooption.selectByIndex(10);
	     supherooption.selectByIndex(15);
	     supherooption.selectByIndex(20);
	    //select last option&print all options
	     WebElement lastselect=driver.findElement(By.id("lang"));
	     Select options=new Select(lastselect);
	     List<WebElement> alloptions=options.getOptions();
	     int noofoptions=alloptions.size();
	     options.selectByIndex(noofoptions-1);
	     for(WebElement result:alloptions)
	     {
	    	
	    	System.out.println(result.getText()); 
	    	 
	     }
	    //Print selected option
	     WebElement countryselect=driver.findElement(By.id("country"));
	     Select countryoption=new Select(countryselect);
	     countryoption.selectByVisibleText("India");
	     countryoption.selectByValue("Peru");
	     List<WebElement> selected=countryoption.getAllSelectedOptions();
	     for(WebElement webselected:selected)
	     {
	    	 System.out.println(webselected.getText());
	     }
	    //Bootstrap dropdown selection
	    driver.get("https://semantic-ui.com/modules/dropdown.html");
	    driver.findElement(By.xpath("//span[text()=\'3 Themes\']")).click();
	    driver.findElement(By.xpath("//div[@data-text='Default Theme']")).click();
	    
	}

}
