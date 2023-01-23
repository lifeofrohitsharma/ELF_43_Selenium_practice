package Locators;

//  WAS TO REGISTER ON DEMOWEBSHOP WEBSITE USING CSS SELECTOR TAGS...
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementByCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://demowebshop.tricentis.com/");
			// Thread.sleep(1000);

			driver.findElement(By.cssSelector("a[class='ico-register']")).click();
			// Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[id='gender-male']")).click();
			driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Rohit");
			// Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Sharma");
			// Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("sharma.rohit199709@gmail.com");
			// Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name=\"Password\"]")).sendKeys("Rohit1234");
			// Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Rohit1234");
			// Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='register-button']")).click();
			// Thread.sleep(1000);
			driver.quit();
		}
	}

}