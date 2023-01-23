package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// WAS to understand how to click on the disabled element on the webpage using JavascriptExecutor...
/***
 * 
 * @author Rohit
 *
 */
public class ToUnderstandClickOnDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// navigating to vtiger website...
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase7-archive-downloads.html");

		// identifying the link under which disabled element is present...
		driver.findElement(By.partialLinkText("jdk-7u80-windows-x64.exe")).click();

		// identifying disabled elements...
		WebElement disabledButton = driver.findElement(By.xpath("//a[text()='Download jdk-7u80-windows-x64.exe']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disabledButton);

		Thread.sleep(4000);
		driver.quit();
	}
}