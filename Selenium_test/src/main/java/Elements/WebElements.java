package DifferentElements;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.selenium.dev/selenium/web/web-form.html");
			
			WebElement textInput = driver.findElement(By.id("my-text-id"));
			WebElement passwordInput = driver.findElement(By.name("my-password"));
			WebElement textArea = driver.findElement(By.name("my-textarea"));
			WebElement dropDown = driver.findElement(By.name("my-datalist"));
			WebElement selectDropDown = driver.findElement(By.name("my-select"));
			WebElement dropdownValue = driver.findElement(By.xpath("option[@value ='New York']"));
			Select select = new Select(selectDropDown);
			//WebElement browseFiled = driver.findElement(By.name("my-file"));
			WebElement browseFile = driver.findElement(By.name("my-file"));
			File uploadFile = new File("C:\\Users\\Administrator\\Downloads\\Waffles.jpg");
			browseFile.sendKeys(uploadFile.getAbsolutePath());
			driver.findElement(By.id("file-submit")).click();
			
		}
		finally {
			driver.close();
		}
		}
}
	
	
			
			
			
		/*	textInput.sendKeys("Jane");
			passwordInput.sendKeys("password");
			textArea.sendKeys("Coimbatore");
			System.out.println(select.getOptions().size());
			select.selectByVisibleText("One");
			System.out.println(dropdownValue.isDisplayed());
			dropDown.click();
			System.out.println(dropdownValue.isDisplayed());
			Actions action = new Actions(driver);
			
			Action dropdownA = action
					.click(dropDown)
					.sendKeys("New")
					.build();
			
			dropdownA.perform();
		/*	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
				System.out.println(dropdownValue.isDisplayed());
			}
		}
		*/
		

