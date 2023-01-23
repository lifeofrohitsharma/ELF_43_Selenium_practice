package frameHandling;

/* WAS to enter the Phone Number inside the Mobile number textfeild at Dream11 website...
 	website: https://www.dream11.com/	*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDream11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.dream11.com/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		Thread.sleep(1000);
		driver.switchTo().frame(frameElement);

		driver.findElement(By.id("regEmail")).sendKeys("976543210");

		Thread.sleep(2000);
		driver.quit();
	}
}