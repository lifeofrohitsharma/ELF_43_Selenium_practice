package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to read the data from the property file...
public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		// Step 1: creating Input Stream type object.
		File absPath = new File("./testData/configuration.properties");
		FileInputStream fis = new FileInputStream(absPath);

		// Step 2: Creating object of File Type.
		Properties properties = new Properties();
		properties.load(fis);

		// Step 3: Reading methods.
		String key = properties.get("ChromeBrowserkey").toString();
		String value = properties.get("ChromeBrowserPath").toString();
		String url = properties.get("url").toString();

		// Setting System property for launching shadi.com using properties files.
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// navigating to URl...
		driver.get(url);

		// Registration...
		driver.findElement(By.xpath("//a[text()='Join Now']")).click();
		driver.findElement(By.id("first_name")).sendKeys("Rohit");
		driver.findElement(By.id("last_name")).sendKeys("Sharma");
		driver.findElement(By.xpath("//label[text()='Gender']/..//label[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='Looking for']/..//label[text()='Female']")).click();

	}

}
