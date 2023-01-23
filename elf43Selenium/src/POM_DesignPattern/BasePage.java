package POM_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this); // Rule 1
	}

	@FindBy(id = "wzrk-cancel")
	private WebElement popupCancelButton;

	public WebElement getPopupCancelButton() {
		return popupCancelButton;
	}

	@FindBy(id = "Bus")
	private WebElement busBarNavIcon; // Rule 2

	public WebElement getBusBarNavIcon() {
		return busBarNavIcon;
	}
}