package dataDrivenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe
public class InValidPassword {
	@Test
	public void invalidPassword() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement user=driver.findElement(By.name("username"));
	user.sendKeys();
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("admin1234");
	WebElement loginbutton=driver.findElement(By.xpath("//button[text()=' Login ']"));
    loginbutton.click();	
	driver.close();
}
}