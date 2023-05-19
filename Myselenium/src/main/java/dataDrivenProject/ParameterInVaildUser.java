package dataDrivenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInVaildUser {
	@Test
	@Parameters({"user","password"})
	public void invalidPuser(String uname,String upass) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys(uname);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(upass);
		//Thread.sleep(3000);
        WebElement loginbutton=driver.findElement(By.xpath("//button[text()=' Login ']"));
        loginbutton.click();		
		driver.close();
	}

}
