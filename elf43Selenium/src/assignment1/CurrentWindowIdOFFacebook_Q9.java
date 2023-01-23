package assignment1;
//WAS TO GET THE CUURENT WINDOW ID OF FACEBOOK...

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentWindowIdOFFacebook_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");

		String currentWindowID = driver.getWindowHandle();
		System.out.println("Current window id of facebook.com is: \n" + currentWindowID);
		driver.quit();
	}
}