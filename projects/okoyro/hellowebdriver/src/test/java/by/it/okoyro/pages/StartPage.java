package by.it.okoyro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {

	private WebDriver driver;

	public StartPage(WebDriver driver) {
		this.driver = driver;
	}

	private By flightTab = By.id("tab-flight-tab-hp");
	private By flightInputFrom = By.id("flight-origin-hp-flight");
	private By flightInputTo = By.id("flight-destination-hp-flight");
	private By oneWayButton = By.id("flight-type-one-way-label-hp-flight");
	private By searchButton = By.cssSelector("#gcw-flights-form-hp-flight > div.cols-nested.ab25184-submit > label > button");
	private By departureDateInput = By.id("flight-departing-hp-flight");
	private By airportDropDawn = By.id("typeaheadDataPlain");


	// TODO: 2019-05-21 add all required locators

	public StartPage selectSearchFlightMode() {
		driver.findElement(flightTab).click();
		(new WebDriverWait(driver, 5))
				.until(ExpectedConditions.presenceOfElementLocated(oneWayButton));
		return this;
	}

	public StartPage setFlightFrom(String destinationFrom) {
		driver.findElement(flightInputFrom).sendKeys(destinationFrom);
		(new WebDriverWait(driver, 5))
				.until(ExpectedConditions.presenceOfElementLocated(airportDropDawn));
		driver.findElements(By.className("results-item")).get(1).click();
		return this;
	}

	public StartPage setFlightTo(String destinationTo) {
		driver.findElement(flightInputTo).sendKeys(destinationTo);
		(new WebDriverWait(driver, 5))
				.until(ExpectedConditions.presenceOfElementLocated(airportDropDawn));
		driver.findElements(By.className("results-item")).get(1).click();
		return this;
	}

	public StartPage setDepartureDate(String date) {
		driver.findElement(departureDateInput).sendKeys(date);
		return this;
	}

	public StartPage selectOneWayFlight() {
		driver.findElement(oneWayButton).click();
		(new WebDriverWait(driver, 5))
				.until(ExpectedConditions.invisibilityOfElementLocated(By.id("flight-returning-hp-flight")));
		return this;
	}

	public void performSearch() {
		driver.findElement(searchButton).click();
	}


}
