package WebElementsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// To understand pageLoadTimeout() in Selenium...
public class PageLoadTimeout {
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

		/*
		 * using pageLoadTimeout() to analyse that page is getting load in specific time
		 * or not...
		 */
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		// directing to the website...
		driver.get("\"https://profile.w3schools.com/log-in");

		driver.quit();
	}
}