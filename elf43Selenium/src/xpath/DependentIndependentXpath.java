package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/kids-bedside-lamp?catid=1520&sort=p.product_id&order=DESC");

		driver.findElement(
				By.xpath("https://www.woodenstreet.com/kids-bedside-lamp?catid=1520&sort=p.product_id&order=DESC"))
				.click();
		driver.quit();
	}

}
