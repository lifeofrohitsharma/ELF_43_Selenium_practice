package assignment1;
//WAS TO CLOSE ONLY BARBAEQUENATION WINDOW IN MULTIPLE WINDOW.HTML...

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyBarbequeNationWindow_Q10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/sharm/OneDrive/Desktop/MultipleWindow.html");

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		String expectedPageTitle = "#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation";

		Set<String> allWindowIDS = driver.getWindowHandles();

		for (String windowID : allWindowIDS) {
			driver.switchTo().window(windowID);
			String actualPageTitle = driver.getTitle();
			if (expectedPageTitle.equals(actualPageTitle)) {
				driver.close();
			}
		}
	}
}