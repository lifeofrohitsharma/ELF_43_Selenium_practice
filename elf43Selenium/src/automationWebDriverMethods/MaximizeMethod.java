package automationWebDriverMethods;
 
//	manage() method to use in the starting of browser...
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}