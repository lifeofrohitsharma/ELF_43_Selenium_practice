package Locators;

// Register user at DemoWebshop using locator....
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsOnRegisterPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement registerButton = driver.findElement(By.linkText("Register"));
		registerButton.click();
		WebElement genderButton = driver.findElement(By.id("gender-male"));
		Thread.sleep(1000);
		genderButton.click();
		driver.findElement(By.id("FirstName")).sendKeys("Rohit");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Sharma");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("Sharma.rohit199709@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("1234jeevanvidya");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234jeevanvidya");
		Thread.sleep(1000);
		WebElement regitButton = driver.findElement(By.id("register-button"));
		regitButton.click();
		Thread.sleep(1000);
		driver.quit();
	}
}