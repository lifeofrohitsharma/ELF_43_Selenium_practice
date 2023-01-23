package workingWithtTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	@Parameters("url")
	@Test
	public void crossBrowser(@Optional("http://demowebshop.tricentis.com/") String urlFromXML,
			@Optional("opera") String bname) {
		WebDriver driver = null;
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(urlFromXML);

		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rohit");
		driver.findElement(By.id("LastName")).sendKeys("Sharma");
		driver.findElement(By.id("Email")).sendKeys("sharma.rohit199709@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Rohit@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rohit@1234");
		driver.findElement(By.id("register-button")).click();

		driver.quit();
	}
}
