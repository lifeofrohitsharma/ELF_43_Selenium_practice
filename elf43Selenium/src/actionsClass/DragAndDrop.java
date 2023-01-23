package actionsClass;
//To understand Drag and drop method in Action class...

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/***
 * 
 * @author Rohit
 *
 */
public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Navigating to website demo.draganddrop.
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// identifying the frames...
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		WebElement imageOndu = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement imageYeradu = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trashArea = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);
		// dragging and droping the image source and target...
		action.dragAndDrop(imageOndu, trashArea).perform();
		Thread.sleep(2000);
		// clicking on the image and holding it...
		action.clickAndHold(imageYeradu).moveByOffset(200, 20).perform();
		// moving the image upto the passed coordinates as an argumments...
//		action.moveByOffset(850, 400).perform();
	}
}