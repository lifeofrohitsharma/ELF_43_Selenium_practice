package Locators;

/* WAS TO CHECK THE WEBELEMENTS OF FACEBOOK LOGIN PAGE i.e. Username and password 
	are properly aligned towards left and Right...*/
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeGetLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");

		WebElement emailTextfield = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pwdTextfield = driver.findElement(By.xpath("//input[@id='pass']/.."));

		Point loactionOfEmailTextfield = emailTextfield.getLocation();
		Dimension sizeOfEmailTextField = emailTextfield.getSize();

		Point loactionOfPwdTextfield = pwdTextfield.getLocation();
		Dimension sizeOfPwdsTextField = pwdTextfield.getSize();

		int xLocationOfEmailTextField = loactionOfEmailTextfield.getX();
		int xLocationOfPwdTextField = loactionOfPwdTextfield.getX();
		int xLoactionPlusWidthOfEmailTextField = sizeOfEmailTextField.getWidth() + xLocationOfEmailTextField;
		int xLoactionPlusWidthOFPwdTextField = sizeOfPwdsTextField.getWidth() + xLocationOfPwdTextField;

		System.out.println(xLocationOfEmailTextField);
		System.out.println(xLocationOfPwdTextField);
		System.out.println(xLoactionPlusWidthOfEmailTextField);
		System.out.println(xLoactionPlusWidthOFPwdTextField);

		// Left Alignment Check...
		if (xLocationOfEmailTextField == xLocationOfPwdTextField) {
			System.out.println("Email Textfield and Password TextField are properly aligned...");
		} else {
			System.out.println("Email Textfield and Password TextField are not inline towards left...");
		}
		// Right Alignment Check...
		if (xLoactionPlusWidthOfEmailTextField == xLoactionPlusWidthOFPwdTextField) {
			System.out.println("Email Textfield and Password TextField are properly aligned towards Right...");
		} else {
			System.out.println("Email Textfield and Password TextField are not inline towards Right...");
		}
		Thread.sleep(1000);

		driver.quit();
	}
}