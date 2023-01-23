package actionsClass;
//WAS TO UNDERSTAND THE METHODS PRESENT IN ACTIONS CLASS...

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
public class ToPerformActionUsingMoveToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Navigating to website...
		driver.get("https://www.w3schools.com/");

		// Locting search bar and providing text inside it...
		WebElement searchTextbar = driver.findElement(By.id("search2"));
		searchTextbar.sendKeys("Java");

		Actions action = new Actions(driver);
		Thread.sleep(1000);
		// Using moveByOffset method providing coordinates as arguments...
		action.moveByOffset(822, 375).click().perform();

		Thread.sleep(3000);
		driver.quit();
	}
}