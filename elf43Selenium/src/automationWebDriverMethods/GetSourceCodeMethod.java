package automationWebDriverMethods;

// getPageSource() method return type is String and it provides the source code of the web page... 
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceCodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		// used to get the source code of the web page...
		String sourceCodeOfPage = driver.getPageSource();
		System.out.println(sourceCodeOfPage);
		driver.close();
	}
}