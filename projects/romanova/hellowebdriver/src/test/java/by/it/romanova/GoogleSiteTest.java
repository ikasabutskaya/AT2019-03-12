package by.it.romanova;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSiteTest {

    private WebDriver driver;

    @Before
    public void driverInit(){
        driver = new ChromeDriver();
    }

    @Test
    public void findAnyResultByRequest(){
        driver.get("https://www.google.com");
        By input = By.xpath("//input[@class=\"gLFyf gsfi\"]");
        WebElement element = waitAndGetElement(driver,input);
        element.sendKeys("eee\n");

        By result = By.xpath("//*[@alt=\"Google\"]");
        waitAndGetElement(driver, result);
    }

    private static WebElement waitAndGetElement(WebDriver driver, By query) {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(query));
        return driver.findElement(query);
    }

    @After
    public void driverQuit(){
        driver.quit();
    }


}
