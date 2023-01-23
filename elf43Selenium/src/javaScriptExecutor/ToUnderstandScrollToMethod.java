package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// WAS to understand scrollTo() passing X coordinates and Y coordinates as an arguments...

/***
 * 
 * @author Rohit
 *
 */
public class ToUnderstandScrollToMethod {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/");

		/*
		 * passing the coordinates from the webpage after scrolling distance to the
		 * element...
		 */
		int scrollDistance = 3614;

		// locating the element on the webpage..
		WebElement elementToLocate = driver.findElement(By.linkText("Learn jQuery"));

		// type casting driver into JavascriptExecutor type reference...
		JavascriptExecutor js = (JavascriptExecutor) driver;

		/*
		 * withe help of JavascriptExecutor calling method scrollTo() present in
		 * executeScript() & passing scrollDistance as an argumement...
		 */
		js.executeScript("window.scrollTo(0,arguments[0]);", scrollDistance);
		Thread.sleep(1000);

		// clicking on the element...
		elementToLocate.click();
	}
}
