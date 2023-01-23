package pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LicIndia_ComPopUpHandling {
	public static WebDriverWait explicitWait;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://licindia.in/");
		WebElement elemToBeClicked = driver.findElement(By.linkText("Agents Portal"));
		try {
			elemToBeClicked.click();
		} catch (ElementClickInterceptedException e) {
			js.executeScript("window.scrollBy(0,300)");
			elemToBeClicked.click();
		}
		String PrentWindowID = driver.getWindowHandle();

		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());

		confirmationAlert.accept();
		Set<String> windowIDs = driver.getWindowHandles();
		windowIDs.remove(PrentWindowID);
		driver.close();
		for (String windowID : windowIDs) {
			driver.switchTo().window(windowID);
		}
		WebElement userID = driver.findElement(By.id("da_textfield-1105-errorEl"));
		WebElement password = driver.findElement(By.id("da_textfield-1106-errorEl"));

		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		System.out.println(userID.getText());
		System.out.println(password.getText());

	}
}