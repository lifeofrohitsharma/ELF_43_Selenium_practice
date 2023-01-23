package automationWebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.get("https://online.qspiders.com/student");
		Thread.sleep(2000);
		Navigation navigate = driver.navigate();
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();
		URL url = new URL("https://www.hungama.com/");
		navigate.to(url);
		driver.quit();
	}
}
