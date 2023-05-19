package testPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelCode {

	@Test
	public void openGoogle()
	{  System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void openBing()
	{    System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com");
	
		
	}
}
