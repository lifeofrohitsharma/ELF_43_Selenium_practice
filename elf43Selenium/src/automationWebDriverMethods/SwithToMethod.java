package automationWebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sharm/OneDrive/Desktop/MultipleWindow.html");

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);

		String expectedPageTitle = "Original Italian Recipes - Giallozafferano Recipes";
		Set<String> allWindoWiDS = driver.getWindowHandles();

		for (String windowid : allWindoWiDS) {
			driver.switchTo().window(windowid);
			String actualPageTitle = driver.getTitle();
			if (expectedPageTitle.equals(actualPageTitle)) {
				driver.manage().window().maximize();
				break;
			}
		}
		driver.quit();
	}
}