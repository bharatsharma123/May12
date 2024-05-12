package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {
	
	public WebDriver driver;
	
	@Test
	public void method1()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		}
	
	
	

}
