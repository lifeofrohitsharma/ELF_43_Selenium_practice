package assignment1;
// WAS TO RESIZE THE WINDOW TO 100 WIDTH AND 200 HEIGHT...

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow_Q3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");

		// Setting Default position of the Browser...
		Point setDefaultPosition = new Point(0, 0);
		driver.manage().window().setPosition(setDefaultPosition);
		Thread.sleep(2000);

		// Setting the new dimensions for the browser...
		Dimension newDimensionOfBrowser = new Dimension(100, 200);
		driver.manage().window().setSize(newDimensionOfBrowser);
		Thread.sleep(2000);

		driver.quit();
	}
}