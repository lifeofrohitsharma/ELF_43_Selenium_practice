package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderForMultipleUrl {

	@DataProvider
	public String[] data() {
		String arr[] = { 
				"https://demowebshop.tricentis.com/",
				"https://www.w3schools.com/",
				"https://online.qspiders.com/user",
				"https://www.linkedin.com/",
				"https://www.skyscanner.co.in/" };
		return arr;
	}

	@Test(dataProvider = "data")
	public void test(String url) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(url);
		driver.quit();
	}
}