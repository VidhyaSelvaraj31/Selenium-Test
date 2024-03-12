package DifferentElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDown {
	 public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		// WebElement dropdown = driver.findElement(By.name("my-select"));
		 WebElement dropdown = driver.findElement(By.name("my-disabled"));
		 
		//Select s = new Select(dropdown);
		 //s.selectByIndex(2);
		// s.selectByIndex(3);
		// s.selectByVisibleText("One");
		 //List dropdown selectedOption
		 
	Boolean isEnabled = dropdown.isEnabled();
//		 System.out.println(isEnabled);
		 
	 }
}
