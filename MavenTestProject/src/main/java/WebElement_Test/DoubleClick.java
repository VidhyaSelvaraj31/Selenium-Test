package WebElement_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		
		Actions actions = new Actions(driver);
		
		WebElement clickButton = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		clickButton.click();
		actions.doubleClick(clickButton).click(clickButton).contextClick().build().perform();	
	}

}
