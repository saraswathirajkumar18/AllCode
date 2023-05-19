package codeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/radio");
		//Radio Button
		//1.select option
		WebElement radiobtn1=driver.findElement(By.id("yes"));
		radiobtn1.click();
		//2.confirm only one option selected
		WebElement radiobtn2=driver.findElement(By.id("one"));
		Boolean status1=radiobtn2.isSelected();
		WebElement radiobutton2=driver.findElement(By.id("two"));
		Boolean status2=radiobutton2.isSelected();
		if(status1==false&&status2==false)
		{
			radiobtn2.click();
			System.out.println("Only one radio button selected");
		}
		//3.select the option
		WebElement radiobtn3=driver.findElement(By.id("bug"));
		radiobtn3.click();
		//4.find which option is selected
		List<WebElement> radiobtn4=driver.findElements(By.name("foobar"));
		for(WebElement buttonstatus:radiobtn4 )
		{
			if(buttonstatus.isSelected())
			{
			String labelele=buttonstatus.getAttribute("id");
				System.out.println("Selected input id is :"+labelele);
			}
		}
		//5.confirm last button is disabled
		List<WebElement> radiobtn5=driver.findElements(By.name("plan"));
		int count=(radiobtn5.size());
		Boolean lastbtn=radiobtn5.get(count-1).isEnabled();
		if(lastbtn)
		{
			System.out.println("Last button is not disabled");
		}
		else
		{
			System.out.println("Last button is disabled");	
		}
		//Check box
		//select option
		WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox']"));
	    if(checkbox1.isSelected())
	    {
	    System.out.println("Checkbox is selected");	
	    }
	    WebElement checkbox2=driver.findElement(By.xpath("//label[text()=' I agree to the ']/child::input"));
	    checkbox2.click();
		driver.close();
	}

}
