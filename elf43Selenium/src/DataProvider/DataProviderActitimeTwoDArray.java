package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderActitimeTwoDArray {

	@DataProvider(parallel = true)
	public String[][] data() {
		String arr[][] = { { "admin", "manager" }, { "trainee", "trainee" } };
		return arr;
	}

	@Test(dataProvider = "data")
	public void actiTime(String credentials[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(3000);
		driver.quit();
	}
}