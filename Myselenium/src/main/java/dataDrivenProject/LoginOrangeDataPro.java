package dataDrivenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginOrangeDataPro   {
String[][] loginData={
	{"Admin","admin123"},
	{"Admin1","admin123"},
	{"Admin","admin1234"},
	{"Admin1","admin1234"}
};
@DataProvider(name="orangeLogin")
public String[][] loginDetails()
{
return loginData;
}
@Test(dataProvider="orangeLogin")
public void loginDataProvider(String uname,String upass) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement user=driver.findElement(By.name("username"));
	user.sendKeys(uname);
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys(upass);
	WebElement loginbutton=driver.findElement(By.xpath("//button[text()=' Login ']"));
    loginbutton.click();	
	driver.close();

}
}
