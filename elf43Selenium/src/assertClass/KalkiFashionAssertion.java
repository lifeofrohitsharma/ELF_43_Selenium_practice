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

public class KalkiFashionAssertion {

	String expectedPageTitle = "Buy Traditional Indian Clothing and Ethnic Wear for Women and Men - KALKI Fashion";
	String dataEmail = "sharma.rohit199709@gmail.com";
	String expectedErrorMessage = "Please provide valid email-id!!";

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebDriverWait explicitWait = new WebDriverWait(driver, 15);

		// Step 1: Verifying Page title
		driver.get("https://www.kalkifashion.com/");
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle, "Title Missmatch (Invalid Title)");

		// Step 2: SignIn feature
		WebElement emailIdTextfield = driver.findElement(By.id("email_id"));
		WebElement signInbutton = driver.findElement(By.id("signinsubmit"));
		driver.findElement(By.xpath("//span[text()='Sign in / SignUp']")).click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(signInbutton));
		emailIdTextfield.clear();

		// Step 3: Verifying Error Message.
		signInbutton.click();
		WebElement ErrorMesaage = driver.findElement(By.xpath("//span[text()='Please provide valid email-id!!']"));
		String actualErrorMessage = ErrorMesaage.getAttribute("value");
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message is Invalid");

		// Step 4: Verifying email data.
		emailIdTextfield.sendKeys(dataEmail);
		String actualEmailID = emailIdTextfield.getAttribute("value");
		Assert.assertEquals(actualEmailID, dataEmail, "EmailID Missmatch");
		signInbutton.click();
		driver.quit();
	}
}