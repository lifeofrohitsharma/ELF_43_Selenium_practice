package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyNotificationLinkedInByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(5000);

		driver.quit();
	}
}