package codeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class localsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/krajk/OneDrive/Desktop/htmlproject/register.html");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("sara@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Heybody*987");
		WebElement repassword=driver.findElement(By.id("retypepassword"));
		repassword.sendKeys("Heybody*987");
		WebElement firstname=driver.findElement(By.id("firstname"));
		firstname.sendKeys("sara");
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys("raj");
		WebElement gender=driver.findElement(By.id("female"));
		gender.click();
		WebElement countrybox=driver.findElement(By.id("country"));
		Select country=new Select(countrybox);
		country.selectByVisibleText("Finland");
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		WebElement newsletter=driver.findElement(By.id("newsletter"));
		newsletter.click();
		WebElement register=driver.findElement(By.id("register"));
		register.click();
		driver.close();
		
		
		
	}

}
