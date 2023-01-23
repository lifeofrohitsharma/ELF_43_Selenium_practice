package automationLaunch;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.close();
	}
}