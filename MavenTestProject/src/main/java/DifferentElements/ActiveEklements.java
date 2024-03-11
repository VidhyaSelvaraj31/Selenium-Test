package DifferentElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ActiveEklements {
	
	
	      public static void main(String[] args) {
	          WebDriver driver = new ChromeDriver();
	          try {
	              driver.get("https://google.com");
	              String attr = driver.switchTo().activeElement().getAttribute("title");
	              System.out.println(attr);
	              driver.switchTo().activeElement().sendKeys("Waffles");
	              driver.switchTo().activeElement().sendKeys(Keys.ENTER); 
	              
	              /*Get element with tag name 'div'
					Get all the elements available with tag name 'p'
	              List<WebElement> elements = element.findElements(By.tagName("p"));
	             for (WebElement e : elements) {
	                  System.out.println(e.getText());
	              }
	              */
	              
	          } finally {
	              //driver.quit();
	          }
	      }
	  
}
