package seleniumInterviewCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_NavigateCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
//get()
//driver.get("https://www.google.com");
//navigate.to())
driver.navigate().to("C:\\Users\\krajk\\OneDrive\\Desktop\\sample.html");
driver.findElement(By.id("name")).sendKeys("hello"+Keys.ENTER);
Thread.sleep(2000);
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();




}

}
