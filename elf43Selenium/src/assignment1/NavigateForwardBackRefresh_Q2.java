package assignment1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

// WAS TO NAVIGATE TO ZOMATO AND SWIGGY AND THEN PERFORM BROWSER NAVIGATION, FORWARD, BACK, AND REFRESH...
public class NavigateForwardBackRefresh_Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Navigation navigateTo = driver.navigate();

		// directing to https://www.zomato.com/
		navigateTo.to("https://www.zomato.com/");

		// directing to https://www.swiggy.com/
		navigateTo.to("https://www.swiggy.com/");
		Thread.sleep(1000);
		// using back() method...for going back**
		navigateTo.back();
		Thread.sleep(1000);

		// using forward() method...for going forward**
		navigateTo.forward();
		Thread.sleep(1000);

		// using refresh() method...for refreshing the page**
		navigateTo.refresh();
		Thread.sleep(1000);

		driver.quit();
	}
}