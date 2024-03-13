package DifferentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement checkBox = driver.findElement(By.cssSelector("#isAgeSelected"));
		checkBox.click();
		System.out.println("After Select :" + checkBox.isSelected());
		checkBox.click();
		System.out.println("After UnSelect :" + checkBox.isSelected());
	}

}
