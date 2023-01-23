package automationWebDriverMethods;

// Difference between close() and quit();
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffBtwCloseQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sharm/OneDrive/Desktop/MultipleWindow.html");

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);

		Set<String> allWindowsIDS = driver.getWindowHandles();
		for (String windowIDS : allWindowsIDS) {
			System.out.println(windowIDS);
		}
		driver.quit();
		/*
		 * quit will close all the pages of current selenium server and will stop the
		 * server... close will close the page where the driver control is present and
		 * it will not stop the server...
		 */
	}
}