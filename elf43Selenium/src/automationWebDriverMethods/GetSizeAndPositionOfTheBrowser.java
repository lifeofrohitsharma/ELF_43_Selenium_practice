package automationWebDriverMethods;

// how to get the dimensions and position of the browser... using Dimension and Point class...
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPositionOfTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		// getting dimensions of Browser using getSize();
		Dimension sizeOfBrowser = driver.manage().window().getSize();
		int height = sizeOfBrowser.getHeight();
		int width = sizeOfBrowser.getWidth();
		System.out.println(height);
		System.out.println(width);
		// getting position and coordinates of Browser using getPosition();
		Point positionOfBrowser = driver.manage().window().getPosition();
		System.out.println(positionOfBrowser.getX());
		System.out.println(positionOfBrowser.getY());
		driver.close();
	}
}