package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAS TO UNDERSTAND THE METHODS PRESENT IN ACTIONS CLASS...

/***
 * 
 * @author Rohit
 *
 */
public class ToUseMoveToElementUsingOffsetValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Navigating to website...
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);

		// Identifying web element...
		WebElement videoEleNavBar = driver.findElement(By.xpath("(//a[text()='Videos'])[1]"));
		Thread.sleep(2000);

		// Creating Object of Action Class...and providing coordinates...
		Actions action = new Actions(driver);
		action.moveToElement(videoEleNavBar, -235, 35).click().perform();
		Thread.sleep(3000);
		driver.quit();
	}
}