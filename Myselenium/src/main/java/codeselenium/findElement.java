package codeselenium;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/buttons");
		WebElement homebtn=driver.findElement(By.id("home"));
		homebtn.click();
		driver.navigate().back();
		WebElement findlocbtn=driver.findElement(By.id("position"));
		Point xyvalue=findlocbtn.getLocation();
		int xval=xyvalue.getX();
		int yval=xyvalue.getY();
		System.out.println("x value:"+xval);
		System.out.println("y value:"+yval);
		WebElement findcolorbtn=driver.findElement(By.id("color"));
		String color=findcolorbtn.getCssValue("background-color");
		System.out.println("color:"+color);
		WebElement sizebtn=driver.findElement(By.id("property"));
		int width=sizebtn.getSize().getWidth();
		int height=sizebtn.getSize().getHeight();
		System.out.println("Width:"+width);
		System.out.println("Height:"+height);
		WebElement buttondisabled=driver.findElement(By.id("isDisabled"));
		Boolean btnstatus=buttondisabled.isEnabled();
		if(btnstatus==false)
		{
			System.out.println("Button is Disabled");	
		}
		WebElement holdbtn=driver.findElement(By.xpath("//h2[text()='Button Hold!']/ancestor::button"));
		Actions chbtn=new Actions(driver);
		chbtn.clickAndHold(holdbtn).build().perform();
		
		Thread.sleep(3000);
		driver.close();


	}

}
