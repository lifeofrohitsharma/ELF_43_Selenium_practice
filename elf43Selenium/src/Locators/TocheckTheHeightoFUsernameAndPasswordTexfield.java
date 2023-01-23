package Locators;

// WAS to check whether the elements present in correct position and are not being overlapped...
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocheckTheHeightoFUsernameAndPasswordTexfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login");

		WebElement emailTextfield = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pwdTextfield = driver.findElement(By.xpath("//input[@id='pass']/.."));

		Rectangle parametersOfEmailTextfield = emailTextfield.getRect();
		Rectangle parametersOfPwdTextfield = pwdTextfield.getRect();

		int YlocationOfEmail = parametersOfEmailTextfield.getY();
		int YlocationOfPwd = parametersOfPwdTextfield.getY();
		int YLocationplusHeightOfEmail = parametersOfEmailTextfield.getWidth() + YlocationOfEmail;
		int YlocationPlusHeightOfPwd = parametersOfPwdTextfield.getHeight() + YlocationOfPwd;

		System.out.println(YlocationOfEmail);
		System.out.println(YlocationOfPwd);
		System.out.println(YLocationplusHeightOfEmail);
		System.out.println(YlocationPlusHeightOfPwd);

		if (YLocationplusHeightOfEmail == YlocationPlusHeightOfPwd) {
			System.out.println("Element Email and Password Textfield are being overlapped");
		} else {
			System.out.println("Element Email and Password Textfield are in correct position");
		}
		if (YlocationOfEmail == YlocationOfPwd) {
			System.out.println("Elements are not present at correct position");
		} else {
			System.out.println("Elements are present at correct position");
		}
	}

}
