package WebElement_Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://the-internet.herokuapp.com/upload"); File uploadFile =
		 * new File("C:\\Users\\Administrator\\Downloads\\Waffles.jpg");
		 * 
		 * WebElement fileInput =
		 * driver.findElement(By.cssSelector("input[type=file]"));
		 * fileInput.sendKeys(uploaadFile.getAbsolutePath());
		 * driver.findElement(By.id("file-submit")).click(); WebElement fileName =
		 * driver.findElement(By.id("uploaded-files"));
		 * Assertions.assertEquals("Waffles.jpg", fileName.getText());
		 * 
		 */
		    
		try {
			driver.get("https://the-internet.herokuapp.com/upload");
			//driver.get("https://www.selenium.dev/selenium/web/web-form.html");
			WebElement browseFile = driver.findElement(By.name("file"));
			browseFile.sendKeys("C:\\Users\\Administrator\\Downloads\\Waffles	.jpg");
			driver.findElement(By.id("file-submit")).click();
			String fileName = driver.findElement(By.id("uploaded-files")).getText();
			if(fileName.contains("Waffles.jpg")) {
			System.out.println("Tada, File Uploaded!!"+fileName);
			}
			else {
				System.out.println("Oops, File Not Uploaded!!"+fileName);
			}
			}
		
		finally {
			//driver.close();
		}
}
}
