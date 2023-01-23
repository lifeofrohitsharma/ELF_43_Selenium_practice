package automationWebDriverMethods;

// To Set the size and position of the Browser...
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSizeAndPositionOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		// Setting the position of the browser....
		Point positionOfTheBrowser = new Point(0, 0);
		driver.manage().window().setPosition(positionOfTheBrowser);
		Thread.sleep(2000);
		// Setting the dimension of the browser...
		Dimension sizeOfThebrowser = new Dimension(800, 800);
		driver.manage().window().setSize(sizeOfThebrowser);
	}
}