package by.it.okoyro;

import by.it.okoyro.pages.StartPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaTest {

	private WebDriver driver;

	//	private WebElement flightTab = driver.findElement(By.id("tab-flight-tab-hp"));
	//	private WebElement flightInputFrom = driver.findElement(By.id("flight-origin-hp-flight"));
	//	private WebElement flightInputTo = driver.findElement(By.id("flight-destination-hp-flight"));
	//	private WebElement oneWayButton = driver.findElement(By.id("flight-type-one-way-label-hp-flight"));
	//	private WebElement searchButton = driver.findElement(By.id(""));

	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}


	@Test
	public void taskA() throws Exception {
		driver.get("https://www.expedia.com/");

		StartPage startPage = new StartPage(driver);
		startPage
				.selectSearchFlightMode()
				.setFlightFrom("Minsk") //, Belarus (MSQ-All Airports
				.setFlightTo("Moscow") // , Russia (MOW-All Airports
				.selectOneWayFlight()
				.setDepartureDate("06/20/2019")
				.performSearch(); // TODO: 2019-05-21 continue the flow

		Thread.sleep(5000);

		// get prices elements as a result
//		List<WebElement> resultPrice = driver.findElements(By.xpath(""));
//		Assert.assertTrue(resultPrice.size() > 1);


	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
