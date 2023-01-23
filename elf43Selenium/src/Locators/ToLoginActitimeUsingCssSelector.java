package Locators;

// WAS TO LOGIN AND LOGOUT FROM ACTITIME BY USING CSS SELECTOR...
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginActitimeUsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(1000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.cssSelector("a[href='/logout.do']")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}