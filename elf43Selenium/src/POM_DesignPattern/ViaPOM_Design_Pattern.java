package POM_DesignPattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class ViaPOM_Design_Pattern {

	public void toSearchBussesForThreeDiiferentLocation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);

		driver.get("https://in.via.com/");

		// Step 1: creating object for BasePage POM class to get the acces for
		// Navigation Button.
		BasePage basePage = new BasePage(driver);
		basePage.getPopupCancelButton().click();
		basePage.getBusBarNavIcon().click();

		// Step 2: Searching for the buses for three different locations
		BusHomePage busHomePage = new BusHomePage(driver);

		// For first destination----
		busHomePage.getOneWay().click();
		busHomePage.getFromlocation().clear();
		busHomePage.getFromlocation().sendKeys("Bangalore");
		busHomePage.getBanagloreSuggestion().click();
		busHomePage.getDestination().clear();
		busHomePage.getDestination().sendKeys("Goa");
		busHomePage.getGoaSuggestion().click();

		// selecting the date from the calander
		busHomePage.getDepartureDate().click();
		driver.findElement(By.xpath("//span[.='Jan']/../../..//div[.='30']")).click();
		busHomePage.getRoundTrip().click();
		busHomePage.getReturnDate().click();
		driver.findElement(By.xpath("(//span[.='Feb']/../../..//div[.='20'])[2]")).click();
		busHomePage.getSearchBusesButton().click();
		Thread.sleep(3000);
		driver.navigate().back();

		// For second destination----
		busHomePage.getOneWay().click();
		busHomePage.getFromlocation().clear();
		busHomePage.getFromlocation().sendKeys("Bangalore");
		busHomePage.getBanagloreSuggestion().click();
		busHomePage.getDestination().clear();
		busHomePage.getDestination().sendKeys("Pondicherry");
		busHomePage.getPondicherrySuggestion().click();

		// selecting the date from the calander
		busHomePage.getDepartureDate().click();
		driver.findElement(By.xpath("//span[.='Jan']/../../..//div[.='19']")).click();
		busHomePage.getRoundTrip().click();
		busHomePage.getReturnDate().click();
		driver.findElement(By.xpath("(//span[.='Feb']/../../..//div[.='20'])[2]")).click();
		busHomePage.getSearchBusesButton().click();
		Thread.sleep(3000);
		driver.navigate().back();

		// For third destination----
		busHomePage.getOneWay().click();
		busHomePage.getFromlocation().clear();
		busHomePage.getFromlocation().sendKeys("Goa");
		busHomePage.getGoaSuggestion().click();
		busHomePage.getDestination().clear();
		busHomePage.getDestination().sendKeys("Pondicherry");
		busHomePage.getPondicherrySuggestion().click();

		// selecting the date from the calander
		busHomePage.getDepartureDate().click();
		driver.findElement(By.xpath("//span[.='Jan']/../../..//div[.='19']")).click();
		busHomePage.getRoundTrip().click();
		busHomePage.getReturnDate().click();
		driver.findElement(By.xpath("(//span[.='Feb']/../../..//div[.='20'])[2]")).click();
		busHomePage.getSearchBusesButton().click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
}