package automation;
/* WAS Steps we will perform.	** Website Link **	https://www.kalkifashion.com/
 * 								** Login credentials ** 
 * 								1. email ID: sharma.rohit199709@gmail.com
 * 								2. password: Rohit@1234
 * 								** Pre requisites: User is already signed in.
 * Steps to perform:
	1. To go on KalkiFashion website.
	2. Choose Kids category.
	3. click on the second product present in the list.
	4. close the parent window.
	5. choose the size of the product.
	6. Add the product to cart.
	7. provide sigin credentials on the login page.
	8. remove the product from the cart.
	9. go on the Homepage. */

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Rohit
 *
 */
public class KalkiFashion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step 1: Go on Kalkifashion Website...
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(1000);

		// Step 1.1: To handle the pop up on the KalkiFashion HomePage
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(1000);

		// Step 2: Go on Kids section...
		driver.findElement(By.xpath("//a[text()='Kids']")).click();

		// Step 3: Fetching the cost of second product...
		String prodIndex = "2";
		String priceOfProduct = driver.findElement(By.xpath("(//li[contains(@class,'item product product-item')])["
				+ prodIndex + "]//span[contains(@data-price-type,'finalPrice')]")).getText();
		System.out.println(priceOfProduct);
		priceOfProduct = priceOfProduct.replace("Rs.", "");
		priceOfProduct = priceOfProduct.replaceAll(",", "");
		priceOfProduct = priceOfProduct.replaceAll(".00", "");
		priceOfProduct = priceOfProduct.trim();
		System.out.println(priceOfProduct);

		/*
		 * Step 4 & 5: To check the price of the product is greater than 10000 display
		 * cost is too high...
		 */
		int cost = Integer.parseInt(priceOfProduct);
		if (cost > 3000) {
			System.out.println("Cost of the product is too high...");
		} else {
			String prodListIndex = "2";
			driver.findElement(By.xpath("//li[@class='item product product-item'][" + prodListIndex + "]")).click();
			String pwid = driver.getWindowHandle();
			Set<String> allWids = driver.getWindowHandles();
			allWids.remove(pwid);
			driver.close();

			for (String windowID : allWids) {
				driver.switchTo().window(windowID);
			}
			// Step 6: Select the size from the Options present for the product...
			String size = "2";
			driver.findElement(By.xpath("(//div[@class='swatch-option text'])[" + size + "]")).click();
			Thread.sleep(1000);

			// Step 7: Adding the product to the cart...
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			Thread.sleep(2000);

			// Step 8: Providing Login Credential for the Sigin page...
			driver.findElement(By.id("email_id")).sendKeys("sharma.rohit199709@gmail.com");
			driver.findElement(By.id("userpassword")).sendKeys("Rohit@1234");
			driver.findElement(By.id("signinsubmit")).click();
			Thread.sleep(1000);

			// Step 9: Removing the product from the Add to cart Page...
			driver.findElement(By.xpath("//input[@title='Qty1']")).sendKeys("0");
			driver.findElement(By.xpath("//button[text()='Update']")).click();

			// Step 10: Directing back to HomePage...
			driver.findElement(By.xpath("//img[contains(@title,'Latest Fashion')]")).click();
			Thread.sleep(5000);
		}
		driver.quit();
	}
}