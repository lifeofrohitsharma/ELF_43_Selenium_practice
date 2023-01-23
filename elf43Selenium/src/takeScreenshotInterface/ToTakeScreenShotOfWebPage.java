package takeScreenshotInterface;
//How to take the screenshot of an Web page... using TakeScreenShot Method.

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShotOfWebPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://mvnrepository.com/");

		TakesScreenshot ss = (TakesScreenshot) driver;
		File tempScreenhot = ss.getScreenshotAs(OutputType.FILE);
		File targetScreenshot = new File("./errorshots/snap.png");
		FileUtils.copyFile(tempScreenhot, targetScreenshot);
		targetScreenshot = new File("./errorshots/snap1.png");
		FileHandler.copy(tempScreenhot, targetScreenshot);

	}
}