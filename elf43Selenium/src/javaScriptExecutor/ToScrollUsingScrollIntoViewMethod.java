package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// WAS TO SCROLL USING THE scrollIntoView() on the webpage...
public class ToScrollUsingScrollIntoViewMethod {
	/***
	 * 
	 * @author Rohit
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/");

		// locating element with the help of link text...
		WebElement elementToBeScrolled = driver.findElement(By.linkText("Get Started Now"));

		// type casting driver into JavascriptExecutor type reference...
		JavascriptExecutor js = (JavascriptExecutor) driver;

		/*
		 * with the help of JavascriptExecutor calling executeScript method passing
		 * webelement as an argument.
		 */
		js.executeScript("arguments[0].scrollIntoView(true)", elementToBeScrolled);
	}

}
