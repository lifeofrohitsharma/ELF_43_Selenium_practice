package WebElementsMethods;

// WAS TO USE CLEAR METHOD AND USE SUBMIT METHOD INSTEAD OF CLOSE METHOD...
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearAndSubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
		Thread.sleep(2000);

		WebElement userNameTextField = driver.findElement(By.xpath("//input[@id='username']"));
		// Manually clearing text field using enum ...
		userNameTextField.sendKeys(Keys.CONTROL + "A");
		userNameTextField.sendKeys(Keys.BACK_SPACE);
		// userNameTextField.clear();
		Thread.sleep(1000);
		userNameTextField.sendKeys("Rohit");

		WebElement passwordTextfield = driver.findElement(By.xpath("//input[@id='password']"));
		// Using clear method
		passwordTextfield.clear();
		passwordTextfield.sendKeys("Rohit@0000");

		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(3000);

		Thread.sleep(5000);
		driver.quit();
	}
}