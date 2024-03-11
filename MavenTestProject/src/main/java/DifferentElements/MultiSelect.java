package DifferentElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelect {
	 public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement (By.id("cars"));
		Select option = new Select (dropdown);
		option.selectByVisibleText("Volvo");
		option.selectByVisibleText("Saab");
		List<WebElement> elementList= option.getAllSelectedOptions();
		 for(WebElement element:elementList) {
			 System.out.println(element.getText());
		 }
	
		 
	 }
}
