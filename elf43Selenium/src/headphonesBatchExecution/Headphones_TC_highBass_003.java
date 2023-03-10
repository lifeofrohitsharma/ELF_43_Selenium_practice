package headphonesBatchExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Headphones_TC_highBass_003 {

	@Parameters("browsername")
	@Test(groups = "System")
	public void Headphones(@Optional("chrome") String bname) throws InterruptedException {

		WebDriver driver = null;
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://in.jbl.com/");
		driver.quit();
	}
}
