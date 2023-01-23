package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAS to perfom on GoogleDoodle on Google search bar to identify the image which is present in the search result...*/

/***
 *
 * @author Rohit
 *
 */
public class ToUnderstandAutoScrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// directing to website...
		driver.get("https://www.google.com/doodles");

		// typecasting webdriver type object driver into JavascriptExecutor.
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// using infine for loop for scrolling purpose...
		for (;;) {
			try {
				driver.findElement(By.linkText("Jamaica Independence Day 2022")).click();
				break;
			} catch (NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,200);");
			}
		}
	}
}