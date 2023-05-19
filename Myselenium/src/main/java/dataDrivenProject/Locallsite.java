package dataDrivenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locallsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/krajk/OneDrive/Desktop/sample.html");
//capitals
		
		  WebElement oslo=driver.findElement(By.id("box1")); 
		  String color=oslo.getCssValue("background-color");
		  System.out.println(color);
		  
	}
}                                                                                                                                                                                                                                            


