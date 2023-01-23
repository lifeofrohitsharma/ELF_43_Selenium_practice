package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEnumUsingKeyboardShortcut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Sharma.rohit199709@gmail.com",
				Keys.CONTROL + "a");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Keys.CONTROL + "v");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		Thread.sleep(1000);

		driver.quit();
	}

}
