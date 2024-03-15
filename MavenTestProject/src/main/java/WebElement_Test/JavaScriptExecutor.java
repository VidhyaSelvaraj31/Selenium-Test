package WebElement_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.get("https://demo.opencart.com/");
	WebElement macbook = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/h4/a"));
	//js.executeScript("arguments[0].scrollIntoView();",macbook);
	js.executeScript("window.scrollTo(0,document.body.height)");
	js.executeScript("arguments[0].click()", macbook);
	//WebElement checkBox = driver.findElement(By.className("ctp-checkbox-label"));
	//checkBox.click();

	}

}
