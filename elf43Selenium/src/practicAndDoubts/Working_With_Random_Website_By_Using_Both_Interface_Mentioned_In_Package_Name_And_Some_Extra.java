package practicAndDoubts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Random_Website_By_Using_Both_Interface_Mentioned_In_Package_Name_And_Some_Extra {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		username.clear();
		Thread.sleep(3000);
		username.sendKeys("admin", Keys.TAB);
		WebElement pwd = driver.findElement(By.name("pwd"));
		Thread.sleep(3000);
		pwd.clear();
		Thread.sleep(3000);
		pwd.sendKeys("manager", Keys.ENTER);

		Thread.sleep(3000); // i have added this line only...
		// driver.quit();
	}
}