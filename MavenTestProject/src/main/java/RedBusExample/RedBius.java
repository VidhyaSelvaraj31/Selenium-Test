package RedBusExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBius {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			WebElement From = driver.findElement(By.id("src"));
			From.sendKeys("Chennai");
			WebElement To = driver.findElement(By.id("dest"));
			To.sendKeys("Coimbatore");
			WebElement date = driver.findElement(By.id("onwardCal"));
			date.click();
			driver.findElement(By.xpath("//*[@id=\"onwardCal\"]div/div[2]/div/div/div[3]/div/span[text()='22']")).click();
			WebElement searchButton = driver.findElement(By.id("search_button"));
			searchButton.click();
		}
		finally {
		//	driver.close();
		}

	}

}
