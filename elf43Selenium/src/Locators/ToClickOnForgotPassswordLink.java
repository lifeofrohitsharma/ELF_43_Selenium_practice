package Locators;

// Using PartialLinkText() method...
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnForgotPassswordLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		Thread.sleep(1000);
		loginLink.click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("password")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}