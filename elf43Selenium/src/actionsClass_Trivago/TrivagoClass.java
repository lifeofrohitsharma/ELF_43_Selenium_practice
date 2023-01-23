package actionsClass_Trivago;

import java.time.LocalDateTime;
import java.time.Month;
//Trivago Website Calander PopUp handle... using Hidden Division pop-Up***
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrivagoClass {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime systemDateTime = LocalDateTime.now();
		int year = systemDateTime.getYear();
		String monthName = systemDateTime.getMonth().name();
		int day = systemDateTime.getDayOfMonth();
		String month = "" + monthName.charAt(0) + monthName.substring(1, monthName.length()).toLowerCase();

		String destination = "Delhi";

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Step 1: Navigating to Trivago website...
		driver.get("https://www.trivago.in/");

		// Handling cookies popup...
		driver.findElement(By.xpath("//button[text()='OK']")).click();

		// Search Bar for Destination...
		WebElement search = driver.findElement(By.id("input-auto-complete"));
		search.sendKeys(destination);
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);

		// Providing Scroll 150in Y-axis...
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(1000);

		// Check-in calander...
		driver.findElement(By.xpath("//span[text()='Check in']")).click();

		// Providing SystemTimeStamp***
		// xpath----------- //button[text()='"+month+"
		// "+year+"']/..//span[text()='"+day+"']
		// button[text()='January 2023']/..//span[text()='20']

		// previos button...
		WebElement previous = driver.findElement(By.xpath("//button[@data-testid='calendar-button-prev']"));
		previous.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='" + month + "" + year + "']/..//span[text()='" + day + "']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='" + month + "" + year + "']/..//span[text()='" + 31 + "']"))
				.click();
	}

}