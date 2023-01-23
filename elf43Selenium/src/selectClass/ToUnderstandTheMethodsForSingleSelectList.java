package selectClass;
/* WAS to use the methods present for Single Select List in Select Class...
 *  we will use:
 * 1. isMultiple();
 * 2. getOptions();
 * 3. getText();
 * 4. selectByIndex();
 * 5. selectByValue();
 * 6. selectByVisibleText();
 * */

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/***
 * 
 * @author Rohit
 *
 */
public class ToUnderstandTheMethodsForSingleSelectList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Ccreate%20new%20fb%20account%7C&placement=&creative=589460569870&keyword=create%20new%20fb%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-30459477270%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAwJWdBhCYARIsAJc4idDZHmJU2fvMXpxCkHqeXw-TfvDQtfELJydkQ5kmvj40W3B8R2A1gv8aAkEDEALw_wcB");

		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));

		/*
		 * for dayDropdown creating an object for Select class to print the options
		 * present under dropdown menu... **** using select class ****
		 */

		Select daySelect = new Select(dayDropdown);
		System.out.println("dayDropdown " + daySelect.isMultiple() + "\n");
		List<WebElement> dayDropdownOptions = daySelect.getOptions();
		for (WebElement ele : dayDropdownOptions) {
			System.out.print(ele.getText() + ", ");
		}
		System.out.println("***********************************************************");

		/*
		 * to select the option present in DayDropdowwn...using selectByIndex() passing
		 * the index value.
		 */
		daySelect.selectByIndex(6);

		/*
		 * for monthDropdown creating an object for Select class to print the options
		 * present under dropdown menu... **** using select class ****
		 */

		Select monthSelect = new Select(monthDropdown);
		System.out.println("monthDropdown " + monthSelect.isMultiple() + "\n");
		List<WebElement> monthDropdownOptions = monthSelect.getOptions();
		for (WebElement ele : monthDropdownOptions) {
			System.out.print(ele.getText() + ", ");
		}
		System.out.println("***********************************************************");

		monthSelect.selectByValue("9");
		/*
		 * for year Dropdown creating an object for Select class to print the options
		 * present under dropdown menu... **** using select class ****
		 */

		Select yearSelect = new Select(yearDropdown);
		System.out.println("yearDropdown " + yearSelect.isMultiple() + "\n");
		List<WebElement> yearDropdownOptions = yearSelect.getOptions();
		for (WebElement ele : yearDropdownOptions) {
			System.out.print(ele.getText() + ", ");
		}

		yearSelect.selectByVisibleText("1997");

		Thread.sleep(4000);
		driver.quit();
	}
}