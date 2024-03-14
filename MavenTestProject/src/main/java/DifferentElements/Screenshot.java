package DifferentElements;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement searchBox = driver.findElement(By.name("q"));
	String timeStamp = new SimpleDateFormat("yyMMdd_HHmmss").format(new Date());
	System.out.println(timeStamp);
	//TakesScreenshot ts = (TakesScreenshot) driver;
	//File source = ts.getScreenshotAs(OutputType.FILE);
	File source = searchBox.getScreenshotAs(OutputType.FILE);
	String destination = "/Screenshots2/"+"Lucky"+".png";
	try {
		FileUtils.copyFile(source, new File(destination));
		System.out.println("Screenshot Captured and Saved to: " + destination);	
	} catch (IOException e) {
		System.out.println("Failed to capture the screenshot:" + e.getMessage());
	}

	}

}
