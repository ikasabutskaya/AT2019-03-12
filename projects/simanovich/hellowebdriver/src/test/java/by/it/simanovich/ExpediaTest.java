package by.it.simanovich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaTest {

    private static WebElement waitAndGetWebElement(WebDriver driver, By inputLocator) {
        return (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(inputLocator));
    }

    private WebDriver driver;

    @Before
    public void setupBrowser()  {
        driver = new ChromeDriver();
    }


    @Test
    public void taskA() throws Exception {


        driver.get("https://www.expedia.com/");

        WebElement buttonFlight = waitAndGetWebElement(driver, By.xpath("//*[@id=\"tab-flight-tab-hp\"]/span[1]")) ;
        buttonFlight.click();


        WebElement fromSearchField = waitAndGetWebElement(driver, By.xpath("//*[@id=\"flight-origin-hp-flight\"]"));
        fromSearchField.sendKeys("Minsk, Belarus (MSQ-All Airports)\n");

        WebElement toSearchField = waitAndGetWebElement(driver, By.xpath("//*[@id=\"flight-destination-hp-flight\"]"));
        toSearchField.sendKeys("Moscow, Russia (MOW-All Airports)\n");

        Thread.sleep(5000);
    }

    @After
    public void browserQuit(){
        driver.quit();
    }

}
