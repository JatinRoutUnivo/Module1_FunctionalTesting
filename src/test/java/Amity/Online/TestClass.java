package Amity.Online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://amityonline.com/");
	} 

	
	@Test
	public void checkurl() {
		
		System.out.println("Current url:- " + driver.getCurrentUrl());
	}
	
	

@AfterMethod
public void close() {
	//driver.quit();
}


}
