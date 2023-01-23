package autoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriAutoIT {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		WebElement fileUpload = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		fileUpload.click();

		Runtime.getRuntime().exec("./autiItprograms/FresherWorld.exe");
	}

}
