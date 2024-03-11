package DifferentElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TextBox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.get("C:\\Users\\Administrator\\Documents\\Jane.html");
		WebElement textboxEnabled = driver.findElement(By.name("my-readonly"));
		WebElement textboxDisabled = driver.findElement(By.name("my-disabled"));
		
		Boolean isEnabled_tb = textboxDisabled.isEnabled();
		Boolean isDisabled_tb = textboxEnabled.isEnabled();
		System.out.println(isEnabled_tb);
		System.out.println(isDisabled_tb);

	}
}
