package automationWebDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

// To get the id's of all the opened tab...
public class GetIdsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testyantra.com/");
		driver.get("https://www.w3schools.com/");
		driver.get("https://online.qspiders.com/student");
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
	}
}