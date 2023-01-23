package woodenStreet_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreetAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Step 1: Going to URL...
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(15000);

		// Step 1.1: To close the pop up on the Homepage...
		driver.findElement(By.id("loginclose1")).click();
		Thread.sleep(1000);

		// Step 2: To find the Study table link and click on it...
		driver.findElement(By.xpath("//p[text()='Study Tables']")).click();
		Thread.sleep(1000);

		// To click on the second product from the list...
		String dynamic = "Rs ";
		String priceOfProduct = driver.findElement(By.xpath("(//strong[contains(text(),'" + dynamic + "')])[2]"))
				.getText();
		System.out.println(priceOfProduct);
		priceOfProduct = priceOfProduct.replace("Rs", "");
		priceOfProduct = priceOfProduct.replace(",", "");
		priceOfProduct = priceOfProduct.trim();

		// Step 4 & 5: To check the price of the product is greater than 10000 display
		// cost is too high...
		int cost = Integer.parseInt(priceOfProduct);
		if (cost > 10000) {
			System.out.println("Cost of the product is too high...");
		} else {
			driver.findElement(By.xpath("(//a[contains(text(),' Study Table ')])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("button-cart-buy-now")).click();
		}
	}
}