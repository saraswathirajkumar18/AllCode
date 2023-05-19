package codeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class input_Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
	    WebElement fullname=driver.findElement(By.id("fullName"));
	    fullname.sendKeys("Jane");
	    WebElement appendtext=driver.findElement(By.id("join"));
	    appendtext.sendKeys(".you?"+Keys.TAB);
	    WebElement textinside=driver.findElement(By.id("getMe"));
	    String text=textinside.getAttribute("value");
	    System.out.println("Text inside is"+text);
	    WebElement clearcon=driver.findElement(By.id("clearMe"));
	    clearcon.clear();
	    WebElement confirmtext=driver.findElement(By.id("noEdit"));
	    
	    if(confirmtext.isEnabled()==false)
	    {
	    	System.out.println("Edit field is Disabled");
	    }
	    WebElement readtext=driver.findElement(By.id("dontwrite"));
	 String inputreadonly=readtext.getAttribute("readonly");
	    
	 if(inputreadonly=="true")
	    {
	    	System.out.println("Text is readonly");	
	    }
	    
	    
	    
	    

	}

}
