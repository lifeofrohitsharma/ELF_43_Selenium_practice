package automationWebDriverMethods;

// full screen() method present in window interface...
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.testyantra.com/");
		driver.manage().window().fullscreen();
	}

}
