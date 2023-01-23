package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropAssignment {

	public static WebDriverWait explicitWait;

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
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trashbox = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));

		Actions action = new Actions(driver);
		// dragging the images into the trash box...

		action.dragAndDrop(image1, trashbox).perform();
		explicitWait.until(
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='The peaks of High Tatras']")));

		action.clickAndHold(image2).moveToElement(trashbox).release().perform();
		explicitWait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//img[@alt='The chalet at the Green mountain lake']")));

		action.dragAndDropBy(image3, 500, 0).perform();
		explicitWait
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='Planning the ascent']")));

		action.moveToElement(image4).clickAndHold().moveToElement(trashbox).release().perform();

		// dragging the images from the trash box to gallery...

		action.dragAndDrop(image1, gallery).perform();
		explicitWait.until(
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='The peaks of High Tatras']")));

		action.moveToElement(image2).clickAndHold().moveToElement(gallery).release().perform();
		explicitWait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//img[@alt='The chalet at the Green mountain lake']")));

		action.clickAndHold(image3).moveToElement(gallery).release().perform();
		explicitWait
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='Planning the ascent']")));

		action.dragAndDropBy(image4, -400, 0).perform();

		// For Accepteed Elements...

		driver.switchTo().defaultContent(); // Switching frame***
		driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(frame2);
		WebElement elemToBedraged = driver.findElement(By.id("draggable"));
		WebElement NotDropable = driver.findElement(By.id("draggable-nonvalid"));
		WebElement target = driver.findElement(By.id("droppable"));

		action.dragAndDropBy(NotDropable, 500, 0).release().perform();

		Thread.sleep(1000);
		action.dragAndDrop(elemToBedraged, target).perform();
		System.out.println(target.getText());

	}

}
