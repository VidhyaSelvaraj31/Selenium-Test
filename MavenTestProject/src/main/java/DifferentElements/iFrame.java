package DifferentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
//		driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().frame(0);
		WebElement inputText = driver.findElement(By.id("tinymce"));
		inputText.clear();
		inputText.sendKeys("Intha Ulagamey Ipadithan");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();

	}

}
