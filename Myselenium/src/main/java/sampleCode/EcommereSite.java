package sampleCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommereSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://naveenautomationlabs.com/opencart");
	WebElement phone=driver.findElement(By.linkText("Phones & PDAs"));
	phone.click();
	WebElement cartbtn=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
	cartbtn.click();
	

	}

}