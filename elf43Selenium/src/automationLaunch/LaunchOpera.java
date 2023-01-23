package automationLaunch;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOpera {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		OperaDriver driver = new OperaDriver();
		Thread.sleep(3000);
		driver.close();
	}
}