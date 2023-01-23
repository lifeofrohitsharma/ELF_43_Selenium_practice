package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to pass the text into disabled elements using JavascriptExecutor...
/***
 * 
 * @author Rohit
 *
 */
public class ToUnderstandClickOnDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// navigating to Skillrary website...
		driver.get("https://demoapp.skillrary.com/");

		// identifying the disabled textbox...
		WebElement textbox = driver.findElement(By.xpath("//input[@class='form-control']"));
		// checking whether element is enabled or not...
		System.out.println(textbox.isEnabled());

		// type casting driver into JavascriptExecutor type reference...
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// passing value inside the disabled element with the help of JavascriptExecutor
		js.executeScript("arguments[0].value='Rohit Sharma'", textbox);

		Thread.sleep(3000);
		driver.quit();
	}
}
