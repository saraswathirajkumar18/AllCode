package seleniumInterviewCode;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MaximiseWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\krajk\\OneDrive\\Desktop\\chromedriver.exe");
	ChromeOptions chromeOptions=new ChromeOptions();
	chromeOptions.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(chromeOptions);
	driver.get("C:\\Users\\krajk\\OneDrive\\Desktop\\sample.html");
	//driver.manage().window().maximize();
	
	//Dimension dimension=new Dimension(1920,1080);  
	//driver.manage().window().setSize(dimension);
	
/*ChromeOptions option=new ChromeOptions();
option.addArguments("--start-maximized");      */                                                                                                                                                    -maximized")

	}

}
