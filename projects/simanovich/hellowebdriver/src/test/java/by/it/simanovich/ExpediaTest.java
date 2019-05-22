package by.it.simanovich;

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
    public void setupBrowser()  {
        driver = new ChromeDriver();
    }


    @Test
    public void taskA() throws Exception {
        driver.get("https://www.expedia.com/");

        WebElement buttonFlight = driver.findElement(By.xpath("//*[@id=\"tab-flight-tab-hp\"]/span[1]"));
        buttonFlight.click();


        WebElement fromSearchField = driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]"));
        fromSearchField.sendKeys("Minsk, Belarus (MSQ-All Airports)\n");

        WebElement toSearchField = driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]"));
        toSearchField.sendKeys("Moscow, Russia (MOW-All Airports)\n");

        Thread.sleep(5000);
    }

    @After
    public void browserQuit(){
        driver.quit();
    }

}
