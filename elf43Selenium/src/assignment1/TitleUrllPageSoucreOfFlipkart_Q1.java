package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

// WAS TO GET THE TITLE, URL AND PAGE SOURCE OF FLIPKART WEBSITE...
public class TitleUrllPageSoucreOfFlipkart_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Web site url: get() method**
		driver.get("https://www.flipkart.com/");

		// getting web site title by using getTitle() method**
		String titleOfFlipkart = driver.getTitle();
		System.out.println(titleOfFlipkart);

		// getting web site Url by using getCurrentUrl() method**
		String UrlOfWebsite = driver.getCurrentUrl();
		System.out.println(UrlOfWebsite);

		// getting pageSourceOfWebsite by using getPageSource() method**
		String pageSourceOfWebsite = driver.getPageSource();
		System.out.println(pageSourceOfWebsite);
		driver.quit();
	}
}