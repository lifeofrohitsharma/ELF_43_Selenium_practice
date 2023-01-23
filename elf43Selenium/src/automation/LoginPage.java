package automation;

// WAS TO VERIFY THE LOGIN FUNCTIONALITY....
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Rohit
 * 
 */
public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

}
