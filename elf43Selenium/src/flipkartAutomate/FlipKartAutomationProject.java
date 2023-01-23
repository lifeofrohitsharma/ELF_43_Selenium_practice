package flipkartAutomate;

/* WAS to Automate Flipkart with Selenium perform following Steps:
 * 		Step 1: Open the browser and Navigate to FlipKart...
 * 		Step 2: Search for the three different Mobiles of different bransds.
 * 		Step 3: Add to cart.
 * 		Step 4: Remove the product which has least value.
 */
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * 
 * @author Rohit
 *
 */
public class FlipKartAutomationProject {
	public static WebDriver driver;
	public static WebDriverWait explicitWait;

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Open the browser and Navigate to FlipKart...
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		// Step 1.1: To close the Login popup...
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		// Step 3 & 4: Search and Add for three Different Product then Add to cart...
		searchAndAddProduct("APPLE");
		searchAndAddProduct("REDMI");
		searchAndAddProduct("realme");
	}

	private static void searchAndAddProduct(String productName) throws InterruptedException {
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys(productName, Keys.ENTER);
		/*
		 * Giving Explicit wait condition: as soon as the first product display in list
		 * of product it will wait...
		 */
		explicitWait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'" + productName + "')]")));
		Thread.sleep(3000);

		// for selecting the first product from the list everytime...
		driver.findElement(By.xpath("//div[contains(@data-tkid,'SEARCH')]/a")).click();

		// closing Parent Window...
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowIDS = driver.getWindowHandles();
		allWindowIDS.remove(parentWindowID);
		for (String windowID : allWindowIDS) {
			driver.switchTo().window(windowID);
		}

		// Providing Explicit time until Add to cart button become clickable...
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

		// Providing Explicit time until Place Order button becomes visible..
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[.='Place Order']")));
		driver.close();

		driver.switchTo().window(parentWindowID);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.name("q")).sendKeys(Keys.DELETE);
	}
}
