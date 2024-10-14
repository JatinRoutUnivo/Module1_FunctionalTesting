package Amity.Online;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CaptureScreenshot {
	
	WebDriver driver;
	
	public static String Screenshot(WebDriver driver, String testName) throws IOException{
	TakesScreenshot srcShot= ((TakesScreenshot)driver);
	File srcFile=srcShot.getScreenshotAs(OutputType.FILE);
	// Generate a unique filename using the test name and current timestamp
    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    String destination = "C:\\Users\\admin\\eclipse-workspace\\Online\\Screenshot\\" + testName + "_" + timestamp + ".png";
	//String destination= "C:\\Users\\admin\\eclipse-workspace\\Online\\Screenshot\\myscreenshot.png";
	
	File destiFile=new File(destination);
	FileUtils.copyFile(srcFile, destiFile);
	return destination;
	
}

}
