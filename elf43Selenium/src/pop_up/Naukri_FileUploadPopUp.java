package pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// file upload popup at Naukri.com
public class Naukri_FileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		try {
			driver.findElement(By.id("resumeUpload"))
					.sendKeys("C:/Users/sharm/OneDrive/Pictures/Screenshots/RohitSharma.png");
			WebElement errorMessage = driver.findElement(By.className("info out err-label"));
			System.out.println(errorMessage.getText());

			Alert alretHandling = driver.switchTo().alert();
			System.out.println(alretHandling.getText());
			alretHandling.accept();

		} catch (NoAlertPresentException e) {

			driver.findElement(By.id("resumeUpload")).sendKeys("C:/Users/sharm/OneDrive/Desktop/CV/CV.pdf");
		}
	}
}