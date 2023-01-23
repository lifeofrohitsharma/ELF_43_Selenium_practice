package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleOfActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(1000);

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		WebElement logout1 = driver.findElement(By.id("logoutLink"));
		logout1.click();
		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("trainee");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		Thread.sleep(1000);
		WebElement loginButton2 = driver.findElement(By.id("loginButton"));
		loginButton2.click();
		Thread.sleep(1000);

		String pageTitle2 = driver.getTitle();
		System.out.println(pageTitle2);

		WebElement logout2 = driver.findElement(By.id("logoutLink"));
		logout2.click();
		Thread.sleep(2000);

		driver.quit();
	}
}