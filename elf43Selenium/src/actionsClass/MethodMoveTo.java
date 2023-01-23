package actionsClass;

// WAS TO UNDERSTAND THE METHODS PRESENT IN ACTIONS CLASS...
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/***
 * 
 * @author Rohit
 *
 */
public class MethodMoveTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Navigating to website...
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);

		// identifying the element on which action to be perform...
		WebElement linkToBeClick = driver.findElement(By.linkText("Not Sure Where To Begin?"));

		// creating Object of Actions Class...
		Actions action = new Actions(driver);

		/*
		 * using moveToElement() method and passing the element refernce as argument and
		 * performing click action...
		 */
		action.moveToElement(linkToBeClick).click().perform();

		Thread.sleep(3000);
		driver.quit();
	}
}