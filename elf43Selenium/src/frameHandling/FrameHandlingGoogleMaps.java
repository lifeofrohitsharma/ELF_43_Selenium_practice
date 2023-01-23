package frameHandling;

/* WAS	Step 1: Go to google.
 		Step 2: click on the App menu.
 		Step 3: Click on the Maps.
 		*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Rohit
 *
 */
public class FrameHandlingGoogleMaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(1000);

		// switch the frames...
		driver.switchTo().frame("app");
		Thread.sleep(1000);

		// clicking on the maps buttons...
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

		Thread.sleep(5000);
		driver.quit();
	}

}
