package workingWithtTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersFromTestNG$XMLFile {

	@Parameters({ "url", "username", "pwd" })
	@Test
	public void readDataFromXML(@Optional("https://demo.actitime.com/login.do") String urlFromXML 
			@Optional String usernameFromXML) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("urlFromXML");
		driver.quit();
	}
}
