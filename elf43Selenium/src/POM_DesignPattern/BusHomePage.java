package POM_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusHomePage {

	public BusHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "One way")
	private WebElement oneWay;

	@FindBy(linkText = "Round trip")
	private WebElement roundTrip;

	@FindBy(linkText = "Packages")
	private WebElement packages;

	@FindBy(id = "src")
	private WebElement fromlocation;

	@FindBy(id = "dest")
	private WebElement destination;

	@FindBy(id = "departure")
	private WebElement departureDate;

	@FindBy(xpath = "//input[@placeholder='Select Return Date']")
	private WebElement returnDate;

	@FindBy(xpath = "//input[@type='submit' and contains(@class,'search-journey')]")
	private WebElement searchBusesButton;

	@FindBy(xpath = "//div[text()='Bangalore']")
	private WebElement banagloreSuggestion;

	@FindBy(xpath = "//div[text()='Chennai']")
	private WebElement chennaiSuggestion;

	@FindBy(xpath = "//div[text()='Goa']")
	private WebElement goaSuggestion;

	@FindBy(xpath = "//div[text()='Pondicherry']")
	private WebElement pondicherrySuggestion;

	public WebElement getOneWay() {
		return oneWay;
	}

	public void setOneWay(WebElement oneWay) {
		this.oneWay = oneWay;
	}

	public WebElement getRoundTrip() {
		return roundTrip;
	}

	public void setRoundTrip(WebElement roundTrip) {
		this.roundTrip = roundTrip;
	}

	public WebElement getPackages() {
		return packages;
	}

	public void setPackages(WebElement packages) {
		this.packages = packages;
	}

	public WebElement getFromlocation() {
		return fromlocation;
	}

	public void setFromlocation(WebElement fromlocation) {
		this.fromlocation = fromlocation;
	}

	public WebElement getDestination() {
		return destination;
	}

	public void setDestination(WebElement destination) {
		this.destination = destination;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(WebElement departureDate) {
		this.departureDate = departureDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(WebElement returnDate) {
		this.returnDate = returnDate;
	}

	public WebElement getSearchBusesButton() {
		return searchBusesButton;
	}

	public void setSearchBusesButton(WebElement searchBusesButton) {
		this.searchBusesButton = searchBusesButton;
	}

	public WebElement getBanagloreSuggestion() {
		return banagloreSuggestion;
	}

	public void setBanagloreSuggestion(WebElement banagloreSuggestion) {
		this.banagloreSuggestion = banagloreSuggestion;
	}

	public WebElement getChennaiSuggestion() {
		return chennaiSuggestion;
	}

	public void setChennaiSuggestion(WebElement chennaiSuggestion) {
		this.chennaiSuggestion = chennaiSuggestion;
	}

	public WebElement getGoaSuggestion() {
		return goaSuggestion;
	}

	public void setGoaSuggestion(WebElement goaSuggestion) {
		this.goaSuggestion = goaSuggestion;
	}

	public WebElement getPondicherrySuggestion() {
		return pondicherrySuggestion;
	}

	public void setPondicherrySuggestion(WebElement pondicherrySuggestion) {
		this.pondicherrySuggestion = pondicherrySuggestion;
	}
}