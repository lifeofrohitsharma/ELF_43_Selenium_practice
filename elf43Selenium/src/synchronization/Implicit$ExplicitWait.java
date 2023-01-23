package synchronization;

// Implicit and Explicit wait.... ****  $$ Syncronization $$ ****
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * 
 * @author Rohit
 *
 */
public class Implicit$ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait ***Syncronization***
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://firelawn.com/");

		// Explicit wait ***Syncronization***
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		driver.findElement(By.xpath("//span[text()='5.0']/../..//span[text()='APPLE iPhone 14 Pro']")).click();
		driver.findElement(By.xpath("//input[@placeholder='580023']")).sendKeys("201005");
		WebElement checkButton = driver.findElement(By.xpath("//button[text()='Check']"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
	}
}