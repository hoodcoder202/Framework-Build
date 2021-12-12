import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class testclassexamples {

			public static void main(String[] args) throws InterruptedException {
				
				// Setting the webdriver.chrome.driver property to its executable's location
				System.setProperty("webdriver.edge.driver", "C:\\Users\\tevin\\EdgeDriver\\edgedriver_win64");
				
				// Creating a driver object referencing WebDriver interface
				WebDriver driver = new EdgeDriver();
			
				// Using get() method to open a webpage
				driver.get("https://www.saucedemo.com/");
				
				System.out.println(driver.getTitle());
				
				//run first then add wait time to show students how fastit is and give
				// example of wait times to be used
				
				//Javascript command
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				Thread.sleep(3000);
				WebElement userName = driver.findElement(By.id("user-name"));
				
				js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", userName);
				
				userName.sendKeys("standard_user");
				
				Thread.sleep(3000);
				WebElement password = driver.findElement(By.id("password"));
				
				js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;'));", password);
				
				password.sendKeys("secret_sauce");
				
				
				
				
				
		}
	
   }

	