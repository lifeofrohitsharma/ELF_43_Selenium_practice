package pop_up;

// Handling Hidden Division PopUp ***File Upload***
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Rohit
 *
 */
public class FresherWorldFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Navigating to Freshersworld website...
		driver.get(
				"https://www.freshersworld.com/user/register?src=aprnd&utm_medium=&utm_campaign=&utm_source=&gclid=EAIaIQobChMIrsCWvYqe_AIV25JmAh38xwTFEAAYASAAEgLJkvD_BwE");

		Thread.sleep(1000);
		// identifying the upload icon with input tag...
		
		driver.findElement(By.id("file-upload"))
				.sendKeys("C:/Users/sharm/OneDrive/Pictures/Screenshots/RohitSharma.png");

		Thread.sleep(1000);
		// Handling Popup...
		Alert FileCannotBeUploaded = driver.switchTo().alert();
		System.out.println(FileCannotBeUploaded.getText()); // Fething Alert Message...
		FileCannotBeUploaded.accept();
		Thread.sleep(1000);

		// uploading suppoted file to website again...
		driver.findElement(By.id("file-upload")).sendKeys("C:/Users/sharm/OneDrive/Desktop/CV/CV.pdf");
	}

}
