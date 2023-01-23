package WebElementsMethods;

//WAS to use the web element interface method such as: isDisplayed, isSelected, isEnabled...
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnabledSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);

		WebElement checkbox = driver.findElement(By.name("remember"));
		// Checking remember checkbox is being displayed or not...
		System.out.println("Displayed or not...");
		System.out.println(checkbox.isDisplayed());
		// Checking is checkbox element is Enabled or not...
		System.out.println("Enabled or not...");
		System.out.println(checkbox.isEnabled());
		// Before cliking...
		Thread.sleep(1000);
		System.out.println("before clicking checking selected or not...");
		System.out.println(checkbox.isSelected());
		// After Clicking...
		checkbox.click();
		Thread.sleep(1000);
		System.out.println("After clicking...");
		System.out.println(checkbox.isSelected());

		driver.quit();
	}
}