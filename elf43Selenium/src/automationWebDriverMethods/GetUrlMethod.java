package automationWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testyantra.com/");
		driver.get("https://www.linkedin.com/feed/");
		driver.close();
	}

}
