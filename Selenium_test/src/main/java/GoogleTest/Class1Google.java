package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Class1Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Administrator\\Documents\\Jane_Program.html");
		// WebElement firstName = driver.findElement(By.id("fname"'));
		
		//By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		By firstName = RelativeLocator.with(By.tagName("input")).above(By.name("lname")).below(By.xpath("//input[@value='f']"));
		driver.findElement(firstName).click();
		//driver.close();
		
		
	}

}
