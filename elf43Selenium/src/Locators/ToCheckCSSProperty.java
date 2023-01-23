package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//WAS to cehck the CSS property of the elements...
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckCSSProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");

		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));

		System.out.println(loginButton.getCssValue("border-radius"));
		System.out.println(loginButton.getCssValue("height"));
		System.out.println(loginButton.getCssValue("font-family"));

		driver.quit();
	}
}