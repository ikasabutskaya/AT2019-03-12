package by.it.agrinkevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaTest {

    private WebDriver driver;


    @Before
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void taskA() throws Exception {
        driver.get("https://www.expedia.com/");
        WebElement buttonFlight = driver.findElement(By.id("tab-flight-tab-hp"));
        buttonFlight.click();

        WebElement buttonOneWay = driver.findElement(By.id("flight-type-one-way-label-hp-flight"));
        buttonOneWay.click();

        WebElement inputOrigin = driver.findElement(By.id("flight-origin-hp-flight"));
        inputOrigin.click();
        inputOrigin.sendKeys("Minsk, Belarus (MSQ-All Airports)");

        WebElement inputDestination = driver.findElement(By.id("flight-destination-hp-flight"));
        inputDestination.click();
        inputDestination.sendKeys("Moscow, Russia (MOW-All Airports)");

        WebElement inputDepartingDate = driver.findElement(By.id("flight-departing-single-hp-flight"));
        inputDepartingDate.click();

        Thread.sleep(3000);
    }

    @After
    public void tearDownBrowser() {
        driver.quit();
    }
}
