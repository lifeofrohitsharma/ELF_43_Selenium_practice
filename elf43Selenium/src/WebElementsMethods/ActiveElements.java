package WebElementsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// To understand the use of Active Element...

/***
 * @author Rohit
 */
public class ActiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//providing implicit wait condition....
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://profile.w3schools.com/log-in");
		
		// Using activeElement() to check 
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("sharma.rohit199709@gmail.com");

	}
}