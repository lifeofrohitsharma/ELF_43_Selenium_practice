package assertClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClassSample {
	String expectedPageTitle = "actiTIME - Login";
	String expectedHomePageTitle = "actiTIME - Enter Time-Track";
	String usernameData = "admin";
	String passwordData = "manager";

	@Test
	public void actitime() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebDriverWait explicitWait = new WebDriverWait(driver, 15);

		// Step 1: Verifying Page title
		driver.get("https://demo.actitime.com/login.do");
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle, "Title of page is not matching(Inavlid Page Title)");

		// Step 2: Verifying username Textfield data
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys(usernameData);
		String actualUsernameData = username.getAttribute("value");
		Assert.assertEquals(actualUsernameData, usernameData, "Username data missmatch (Invalid Data)");

		// Step 3: Verifying Password Textfield data.

		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(passwordData);
		String actualPasswordData = password.getAttribute("value");
		Assert.assertEquals(actualPasswordData, passwordData, "Password is Invalid (Invalid Data)");

		driver.findElement(By.id("loginButton")).click();

		// Step 4: Verifying user has been succesfully logged in.

		WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle, "User has not been loggedin");
		logoutButton.click();
		driver.quit();
	}
}