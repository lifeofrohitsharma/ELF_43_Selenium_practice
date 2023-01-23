package actionsClass_TrelloSoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// To perform contextClick on the Trello WebApplication.... 
/***
 * 
 * @author Rohit
 *
 */
public class ToPerfomContextMenu {
	public static WebDriverWait explicitWait;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Step 1: Navigating to the Url: of Trello web application and Login
		driver.get("https://trello.com/login");
		// identifying email textfield and entering the details...
		driver.findElement(By.id("user")).sendKeys("sharma.rohit199709@gmail.com", Keys.ENTER);

		// explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Rohit@1234");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(1000);

		driver.findElement(By.className("board-tile")).click();
		WebElement task = driver.findElement(By.xpath("//h2[text()='Task']/../.."));
		WebElement task1 = driver.findElement(By.xpath("//span[text()='Manual  Mock']"));
		WebElement task2 = driver.findElement(By.xpath("//span[text()='Java Mock']"));
		WebElement task3 = driver.findElement(By.xpath("//span[text()='Selenium Mock']"));

		WebElement manual = driver.findElement(By.xpath("//h2[text()='Manual']/../.."));
		WebElement java = driver.findElement(By.xpath("//h2[text()='Java']/../.."));
		WebElement selenium = driver.findElement(By.xpath("//h2[text()='Selenium']/../.."));

		Actions action = new Actions(driver);
		action.dragAndDrop(task1, manual).perform();
		action.dragAndDrop(task2, java).perform();
		action.dragAndDrop(task3, selenium).perform();

	}
}