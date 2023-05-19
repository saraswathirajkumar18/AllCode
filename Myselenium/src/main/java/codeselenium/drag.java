package codeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/draggable/");
	    driver.manage().window().maximize();
	    driver.switchTo().frame(0);
	    WebElement contentbox=driver.findElement(By.id("draggable"));
	    Actions a=new Actions(driver);
	    int x=contentbox.getLocation().getX();
	    int y=contentbox.getLocation().getY();   
        a.dragAndDropBy(contentbox, x+10, y+20).perform();
	    
	
	
	
	}
}
