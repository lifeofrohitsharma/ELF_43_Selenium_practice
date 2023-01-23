package Locators;

// using Locators for DemoWebShop...
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementByid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		Thread.sleep(2000);
		loginLink.click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("Sharma.rohit199709@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("1234jeevanvidya");
		Thread.sleep(2000);
		WebElement rememberMeButton = driver.findElement(By.id("RememberMe"));
		Thread.sleep(2000);
		rememberMeButton.click();
		driver.quit();
	}

}
