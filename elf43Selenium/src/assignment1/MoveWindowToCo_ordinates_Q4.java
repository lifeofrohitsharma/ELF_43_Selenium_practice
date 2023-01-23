package assignment1;

//WAS TO MOVE THE WIINDOW TO THESE CO-ORDINATES[100,50]...
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveWindowToCo_ordinates_Q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);

		// Setting the default coordinates of window...
		Point defaultPositionOfWindow = new Point(0, 0);
		driver.manage().window().setPosition(defaultPositionOfWindow);
		Thread.sleep(1000);

		// Setting the customized coordinates of window...
		Point customizedPositionOfWindow = new Point(100, 50);
		driver.manage().window().setPosition(customizedPositionOfWindow);
		Thread.sleep(1000);

		driver.quit();
	}
}