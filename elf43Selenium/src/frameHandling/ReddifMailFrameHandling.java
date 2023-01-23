package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
/* WAS 
 * Step:1 open reddif mail website: https://mail.rediff.com
 * Step 2: login with the given credentials US: sumanthelfbatch@rediffmail.com
 * 											password: Testing@123
 * Step 3: click on write mail.
 * Step 4: 	in To textfield add sumanthelfbatch@rediffmail.com
 * 			in subject textfeild add your name.
 * 			in body type any of the message of your choice.
 * 			send the email.
 * Step 5: GO back to inbox and wait until you receive the mail
 * Step 6: Select the mail which you have sent and then delete it.
 * Step 7: capture the screen Shot of the delete message.   */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifMailFrameHandling {
	/***
	 * 
	 * @author Rohit
	 * @throws InterruptedException
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step:1 open reddif mail website: https://mail.rediff.com
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		/*
		 * Step 2: login with the given credentials US: sumanthelfbatch@rediffmail.com
		 * password: Testing@123
		 */
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@title='Sign in']")).sendKeys(Keys.ENTER);

		// Step 3: click on write mail.
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();

		/*
		 * Step 4: 1. in To textfield add sumanthelfbatch@rediffmail.com 2. in subject
		 * textfeild add your name. 3. in body type any of the message of your choice.
		 * 4. send the email.
		 */
		Thread.sleep(3000);
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthelfbatch@rediffmail.com");
		// driver.findElement(By.name("searchContacts")).sendKeys("sumanthelfbatch",Keys.ENTER);
		// driver.findElement(by.)

		driver.findElement(By.xpath("//label[text()='Subject:']/..//input")).sendKeys("Rohit", Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]")).sendKeys("Hi Praveen");

	}

}
