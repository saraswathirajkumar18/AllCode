package codeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CountryCapitalPageObject {
	public static WebElement oslo(WebDriver driver)
	{
		return driver.findElement(By.id("box1"));
	}
	public static WebElement norway(WebDriver driver)
	{
		return driver.findElement(By.id("box101"));
	}
	

}
