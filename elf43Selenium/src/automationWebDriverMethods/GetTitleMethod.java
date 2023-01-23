package automationWebDriverMethods;

//	getTitle() Method will return the Title of the web site in the form of String... 
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testyantra.com/");
		/*
		 * This getTitle() Method will return the Title of the web site in the form of
		 * String. Return type will be String...
		 */
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
	}
}