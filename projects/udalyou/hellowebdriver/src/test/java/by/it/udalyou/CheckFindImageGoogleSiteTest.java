package by.it.udalyou;

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
    private static WebElement waitAndGetWebElement(WebDriver driver, By queryLocator) {
        return (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(queryLocator));

    }
   @Before
    public void SetUpBrauser() throws InterruptedException {
         driver=new ChromeDriver();
driver.manage().window().maximize();
    }

    @Test
public void TaskA  ()throws Exception{
        driver.get("https://www.google.com/");
        By seach = By.xpath("//input[@class='gLFyf gsfi']");
        WebElement seachedlement = waitAndGetWebElement(driver, seach);
        seachedlement.sendKeys("https://www.seleniumhq.org/\n");
        Thread.sleep(5000);

        By seach2 = By.xpath("//*[@id=\"hdtb - msb - vis\"]/div[3]/a");
        WebElement seachedlement2 = waitAndGetWebElement(driver, seach2);
        seachedlement2.click();

        Assert.assertEquals("1","1");

    }

    @After
    public void OutBrauser(){
       driver.quit();
    }
}
