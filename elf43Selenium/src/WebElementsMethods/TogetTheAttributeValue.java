package WebElementsMethods;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

// WAS TO GET THE ATTRIBUTE VALUE...
public class TogetTheAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/");

		/*
		 * driver.findElement(By.xpath("//a[text()='Log in']")).click(); // To get the
		 * Attribute Value... using getAttribute() method... WebElement textfieldValue =
		 * driver.findElement(By.xpath("//input[@name='email']"));
		 * textfieldValue.sendKeys("sharma.rohit199709@gmail.com"); Thread.sleep(1000);
		 * String attributeValue = textfieldValue.getAttribute("value");
		 * System.out.println(attributeValue);
		 */

		// To capture the ToolTip text...
		String toolTipTitle = driver.findElement(By.xpath("//a[@id='cert_navbtn']")).getAttribute("title");
		System.out.println(toolTipTitle);
		Thread.sleep(1000);

		// To get the alternative name of the image...
		driver.get("https://www.woodenstreet.com/");
		String alternateText = driver.findElement(By.xpath("//img[@title='Table Lamps']")).getAttribute("alt");

		Thread.sleep(1000);
		System.out.println(alternateText);

		driver.quit();

	}
}