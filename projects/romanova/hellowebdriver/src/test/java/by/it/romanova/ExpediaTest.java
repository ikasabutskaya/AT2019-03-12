package by.it.romanova;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ExpediaTest{

    private WebDriver driver;

    @Before
    public void setUpDriver(){
       driver = new ChromeDriver();
    }

    @Test
    public void TaskA() throws Exception{
        driver.get("https://www.expedia.com/");
        HomePage homePage = new HomePage(driver);
        homePage.assertMainPageLoaded();
        homePage.clickFlightSearch();
        homePage.typeDepartureAirport("Minsk, Belarus (MSQ-All Airports)");
        homePage.typeDestinationAirport("Moscow, Russia (MOW-All Airports)");
        homePage.selectDepartingDate();
        homePage.selectReturningDate();
        homePage.submitForm();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.checkMoreThanOneResult();
        Thread.sleep(3000);
        // waitForElementAndClick(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button/span"));


    }




    @After
    public void tearDownDriver(){
        driver.quit();
    }
}
