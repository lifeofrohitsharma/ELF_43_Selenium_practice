package selectClass;
//WAS to understand the multi select method present in Select class...

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
public class ToUnderstandMultiSelectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// direction to the website...
		driver.get("file:///C:/Users/sharm/Downloads/dropDown.html");

		// navigating to the element...
		WebElement multiSelectDropdown = driver.findElement(By.id("m1"));

		// to retrieve all the options present under dropdown...
		System.out.println("Options present usnder the dropdown: ");
		Select fruitDropdown = new Select(multiSelectDropdown);
		System.out.println("dropdown is Multi Select or not: " + fruitDropdown.isMultiple());
		List<WebElement> dropdownOption = fruitDropdown.getOptions();
		for (WebElement ele : dropdownOption) {
			System.out.print(ele.getText() + ", ");
		}
		// Selecting options using index value and value...
		fruitDropdown.selectByIndex(2);
		fruitDropdown.selectByValue("1");
		fruitDropdown.selectByVisibleText("Pineapple");
		fruitDropdown.selectByIndex(5);

		// selected options in the list are...
		System.out.println("Selected options in the list are: ");
		Select selectedElements = new Select(multiSelectDropdown);
		List<WebElement> selectedElementsInDropdown = selectedElements.getAllSelectedOptions();
		for (WebElement ele : selectedElementsInDropdown) {
			System.out.print(ele.getText() + ", ");
		}
		// using deselect() method...
		selectedElements.deselectByIndex(2);
		selectedElements.deselectByValue("1");
		selectedElements.deselectByVisibleText("Pineapple");
		selectedElements.deselectAll();

		// for first selected element...
		System.out.println("Which element selected first in the dropdown: ");
		fruitDropdown.selectByVisibleText("Pineapple");
		fruitDropdown.selectByIndex(5);
		// getFirstSelectedOption(); -It will return the webelement in the form of
		// webElement...
		WebElement firstSelectedOption = fruitDropdown.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
