package automationWebDriverMethods;

//	How to get the Session id of Current Tab... using ****getWindowHandle()**** Method... 
import org.openqa.selenium.chrome.ChromeDriver;

public class GetIdMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testyantra.com/");
		String sessionID = driver.getWindowHandle();
		// Provides the Session ID of the current session...(Changes Dynamically)
		System.out.println(sessionID);
	}

}
