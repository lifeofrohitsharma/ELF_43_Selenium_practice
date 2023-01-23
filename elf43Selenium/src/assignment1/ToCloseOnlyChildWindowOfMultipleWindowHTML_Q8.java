package assignment1;

//WAS TO CLOSE ALL THE CHILD WINDOW FROM MULTIPLE WINDOW.HTML...
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyChildWindowOfMultipleWindowHTML_Q8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/sharm/OneDrive/Desktop/MultipleWindow.html");

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);

		String expectedPageTitle = "Multiple popups";

		Set<String> allWindowIDS = driver.getWindowHandles();

		for (String windowID : allWindowIDS) {
			driver.switchTo().window(windowID);
			String actualPageTitle = driver.getTitle();
			if (expectedPageTitle.equals(actualPageTitle)) {
				Thread.sleep(3000);
			} else {
				driver.close();
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}
}