package dataDrivenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidNamePassword {
	@Test
	public void validNamePassword() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		 WebElement loginbutton=driver.findElement(By.xpath("//button[text()=' Login ']"));
	     loginbutton.click();	
		driver.close();
	}

}
