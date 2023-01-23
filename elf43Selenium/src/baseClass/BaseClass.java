package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import GenricLibrary.ReadData1;

public class BaseClass {

	public WebDriver driver;

	@Parameters("browserName")
	@BeforeClass(alwaysRun = true)
	public void browserSetup(@Optional("chrome") String bname) throws InvalidBrowserException {
		// Step 1: Open the browser and enter the test Url
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/webdriver.exe");
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geko.driver", "./driver/geko.exe");
			driver = new FirefoxDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (bname.equals("opera")) {
			System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
			driver = new OperaDriver();
		} else {
			throw new InvalidBrowserException();
		}
		Reporter.log("Empty Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(ReadData1.fromPropertyFile("url"));
	}

	@AfterClass(alwaysRun = true)
	public void browserTermination() {
		driver.quit();
	}

	@SuppressWarnings("serial")
	public class InvalidBrowserException extends Exception {
		InvalidBrowserException() {
			super("Choose is invalid");
		}

	}
}
