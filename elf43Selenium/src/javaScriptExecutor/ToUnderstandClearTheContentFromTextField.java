package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// WAS to clear the content from the textfild using JavascriptExecutor...

/***
 * 
 * @author Rohit
 *
 */
public class ToUnderstandClearTheContentFromTextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// navigating to vtiger website...
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");

		// identifying the textbox...
		WebElement textbox = driver.findElement(By.id("username"));
		// type casting driver into JavascriptExecutor type reference...
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// passing value inside the disabled element with the help of JavascriptExecutor
		js.executeScript("arguments[0].value=''", textbox);

		Thread.sleep(3000);
		driver.quit();
	}
}