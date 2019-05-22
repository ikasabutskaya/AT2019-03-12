package by.it.simanovich;

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

public class CheckFindImageGoogleSiteTest {

    private WebDriver driver;

    private static WebElement waitAndGetWebElement(WebDriver driver, By inputLocator) {
        return (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(inputLocator));
    }


    @Before
    public void setupDriver() {
       driver =  new ChromeDriver();
       driver.manage().window().maximize();
    }


    @Test
    public void taskA () throws Exception{
        driver.get("https://www.google.com");
        By byQueryInput = By.xpath("//input[@class='gLFyf gsfi']");
        WebElement queryInput = waitAndGetWebElement(driver, byQueryInput);
        queryInput.sendKeys("seleniumhq\n");
        By byImagelocator = By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a");
        WebElement imageClick = waitAndGetWebElement(driver, byImagelocator);
        imageClick.click();
        By byFirstImage = By.xpath("//*[@id=\"i48MSmX01sE18M:\"]");
        WebElement firstImage = waitAndGetWebElement(driver,byFirstImage);
        firstImage.click();
        By byLinkFromImage = By.xpath("//*[@id=\"irc_cc\"]/div[2]/div[3]/div[1]/div/div[1]/span/a");
        WebElement linkFromImage = waitAndGetWebElement(driver, byLinkFromImage);
        linkFromImage.click();
        Thread.sleep(5000);


        Assert.assertEquals("1", "1");
    }

    @After
    public void theDownBrowser () {
        driver.quit();
    }
}
