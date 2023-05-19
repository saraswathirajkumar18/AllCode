package codeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		WebElement elefrom=driver.findElement(By.id("draggable"));
		WebElement eleto=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.clickAndHold(elefrom).moveToElement(eleto).release(eleto).build().perform();
		//2.Another way to do drag and drop
		//a.dragAndDrop(elefrom, eleto).build().perform();
		

	}

}
