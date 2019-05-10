package by.it.agrinkevich;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckGoogleSiteTest {

    @Test
    public void userTryFindHelloInGoogle() throws Exception{
        WebDriver driver=new ChromeDriver();
        try {
            driver.get("https://google.com");
            By queryLocator=By.xpath("//input[@class='gLFyf gsfi']");
            WebElement queryInput = waitAndGetWebElement(driver, queryLocator);
            queryInput.sendKeys("привет\n");
            waitAndGetWebElement(driver,By.xpath("//span[@class=\"csb ch\"]"));

            Assert.assertTrue(driver.getTitle().contains("Google"));
        }
        finally {
            driver.quit();
        }
    }

    private static WebElement waitAndGetWebElement(WebDriver driver, By queryLocator) {
        (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(queryLocator));
        return driver.findElement(queryLocator);
    }

}
