package DifferentElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : " + parentWindow);
		WebElement tabButton = driver.findElement(By.xpath("//button[contains(text(), 'new Tab')]"));
		tabButton.click();
		System.out.println("Page Title :" + driver.getTitle());
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of windows.. " + tabs.size());
		for(String child:tabs) {
			System.out.println("Windows.." + child);
		if(!child.equalsIgnoreCase(parentWindow)) {
			driver.switchTo().window(child);
			System.out.println("Child Window Title..." + driver.getTitle());
			driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a")).click();
		}
		}
		//driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Page Title.." + driver.getTitle());
	}

}
