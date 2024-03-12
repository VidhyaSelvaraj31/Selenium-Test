package WebElement_Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts");
	 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	 driver.findElement(By.linkText("See an example alert")).click();
	 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	 Alert alert1 = driver.switchTo().alert();
	 String text = alert1.getText();
	 alert1.accept();
	}
	
}
