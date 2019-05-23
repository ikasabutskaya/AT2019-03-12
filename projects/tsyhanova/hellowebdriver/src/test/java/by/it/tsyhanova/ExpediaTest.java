package by.it.tsyhanova;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;

public class ExpediaTest {


    WebDriver driver;

    @Before
    public void setUpBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void taskA() throws Exception {


        /*driver.get("https://www.expedia.com/");

        StartPage startPage = new StartPage(driver);

        ResultPage resultPage = startPage
                .selectSearchFlightMode()
                .selectOneWay()
                .setOrigin("Minsk, Belarus (MSQ-All Airports)")
                .setDestination("Moscow, Russia (MOW-All Airports)")
                .setDepartingDate("05/24/2019")
                .getSearch();

        int resultSearchCount = resultPage.getResultSearchCount();
        Assert.assertTrue(resultSearchCount > 1);*/


        driver.get("https://www.expedia.com/");
        Thread.sleep(5000);
        WebElement buttonFlight=driver.findElement(By.id("tab-flight-tab-hp"));
        buttonFlight.click();
        Thread.sleep(5000);
        WebElement oneWay=driver.findElement(By.id("flight-type-one-way-label-hp-flight"));
        oneWay.click();
        Thread.sleep(10000);
        WebElement inputFlightingFrom=driver.findElement(By.id("flight-origin-hp-flight"));
        inputFlightingFrom.click();
        inputFlightingFrom.sendKeys("Minsk, Belarus (MSQ-All Airports)");
        Thread.sleep(10000);
        WebElement inputFlightingTo=driver.findElement(By.id("flight-destination-hp-flight"));
        inputFlightingTo.click();
        inputFlightingTo.sendKeys("Moscow, Russia (MOW-All Airports)");
        Thread.sleep(10000);
        WebElement inputDepartingDate=driver.findElement(By.id("flight-departing-hp-flight"));
        inputDepartingDate.click();
        LocalDateTime now=LocalDateTime.now();
        int year=now.getYear();
        int month=now.getMonthValue();
        int day=now.getDayOfMonth();
        StringBuilder currentDate=new StringBuilder();
        String currentYear=Integer.toString(year);
        String currentMonth=Integer.toString(month);
        String currentDay=Integer.toString(day);
        currentDate.append(currentMonth);
        currentDate.append("/");
        currentDate.append(currentDay);
        currentDate.append("/");
        currentDate.append(currentYear);
        System.out.println(currentDate);
        inputDepartingDate.sendKeys(currentDate);
        Thread.sleep(10000);
    }


    @After
    public void tearDownBrowser() {
       // driver.quit();
    }
}
