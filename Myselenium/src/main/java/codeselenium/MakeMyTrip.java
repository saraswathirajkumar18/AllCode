package codeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTrip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	
	WebElement flighticon=driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']/child::span[2]"));
	flighticon.click();
	Thread.sleep(3000);
	WebElement roundtrip=driver.findElement(By.xpath("//li[contains(text(),'Round Trip')]/child::span"));
	roundtrip.click();
	//Thread.sleep(9000);
	System.out.println("hai");
	WebElement frombox=driver.findElement(By.xpath("//span[text()='From']"));
	frombox.click();
	
	WebElement frominputbox=driver.findElement(By.xpath("//input[@placeholder='From']"));
	frominputbox.click();
	//Select fromOptions=new Select(from);
	//fromOptions.selectByIndex(0);
	//from.click();
	String value="Delhi";
    frominputbox.sendKeys(value);
	List<WebElement> fromOptions =driver.findElements(By.xpath("//li[starts-with(@id,'react-autowhatever-1-section-0')]//p[@class='font14 appendBottom5 blackText']"));
	for (WebElement option : fromOptions) {
		//if(value.equals (option.getText()))
		if(option.getText().contains(value))
		{
		option.click();
		break;
		}
	}
	System.out.println("fromdone");
	WebElement tobox=driver.findElement(By.xpath("//span[@class='lbl_input  appendBottom10'][text()='To']"));
    tobox.click();
    WebElement toinputbox=driver.findElement(By.xpath("//input[@placeholder='To']"));
    toinputbox.click();
    String toPlace="Bengaluru";
    toinputbox.sendKeys(toPlace);
    Thread.sleep(3000);
   List<WebElement> toOptions =driver.findElements(By.xpath("//li[starts-with(@id,'react-autowhatever-1-section-0')]//p[@class='font14 appendBottom5 blackText']"));
    for(WebElement listofoptions:toOptions)
    {
    	if(listofoptions.getText().contains(toPlace))
    	{
    		listofoptions.click();
    	break;
    	}
    }
    System.out.println("todone");


    	
    	
	//fromOptions.click();
    //driver.close();
}
}

