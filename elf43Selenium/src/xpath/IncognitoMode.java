package xpath;

import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ",/driver/chromedriver.exe");
		ChromeOptions incog = new ChromeOptions();
		incog.addArguments("https://www.w3schools.com/");
		Thread.sleep(5000);

	}

}
