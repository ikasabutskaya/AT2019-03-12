package by.it.agrinkevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;

public class CheckFindImageGoogleSiteTest {

    private WebDriver driver;

    private static WebElement waitAndGetWebElement(WebDriver driver, By queryLocator) {
        return (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(queryLocator));
    }

    @Before
    public void setUpBrowser() {
        driver=new ChromeDriver();
        //driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void TaskA() throws Exception{
        driver.get("https://www.google.com/");
        By byQueryInput = By.xpath("//input[@class='gLFyf gsfi']");
        WebElement queryInput = waitAndGetWebElement(driver, byQueryInput);
        queryInput.sendKeys("seleniumhq\n");
        //queryInput.submit();

        By byLinkImagesSearch = By.xpath("//*[@class='hdtb-mitem hdtb-imb'][1]/a");
        WebElement linkImagesSearch = waitAndGetWebElement(driver, byLinkImagesSearch);
        linkImagesSearch.click();

        By byLinkResultFirstImage = By.xpath("//*[@class='rg_bx rg_di rg_el ivg-i'][@data-ri='0']");
        WebElement linkResultFirstImage = waitAndGetWebElement(driver, byLinkResultFirstImage);
        linkResultFirstImage.click();


        By byLinkResultSite = By.xpath("//*[@class='irc_vpl i3599 irc_lth'][@tabindex='0']");
        WebElement linkResultSite = waitAndGetWebElement(driver, byLinkResultSite);
        linkResultSite.click();

        Thread.sleep(2000);

        //open a new tab and check url at the last tab
        Set<String> handles = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<>(handles);
        String newTab = handlesList.get(handlesList.size() - 1);

        // switch to new tab
        driver.switchTo().window(newTab);

        String url = driver.getCurrentUrl();
        assertTrue(url.startsWith("https://www.seleniumhq.org"));
    }

    @Test
    public void TaskB() throws Exception{
        driver.get("https://www.google.com/");
        By byQueryInput = By.xpath("//input[@class='gLFyf gsfi']");
        WebElement queryInput = waitAndGetWebElement(driver, byQueryInput);
        queryInput.sendKeys("seleniumhq\n");
        //queryInput.submit();

        By byLinkImagesSearch = By.xpath("//*[@class='hdtb-mitem hdtb-imb'][1]/a");
        WebElement linkImagesSearch = waitAndGetWebElement(driver, byLinkImagesSearch);
        linkImagesSearch.click();

        By byLinkResultFirstImage = By.xpath("//*[@class='rg_bx rg_di rg_el ivg-i'][@data-ri='0']");
        WebElement linkResultFirstImage = waitAndGetWebElement(driver, byLinkResultFirstImage);
        linkResultFirstImage.click();

        By byLinkResultSite = By.xpath("//*[@class='irc_vpl i3599 irc_lth'][@tabindex='0']");
        WebElement linkResultSite = waitAndGetWebElement(driver, byLinkResultSite);
        linkResultSite.click();

        Thread.sleep(2000);

        Set<String> handles = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<>(handles);
        String newTab = handlesList.get(handlesList.size() - 1);
        driver.switchTo().window(newTab);

        String url = driver.getCurrentUrl();
        assertTrue(url.startsWith("https://www.seleniumhq.org"));
        assertTrue(driver.getTitle().contains("Selenium - Web Browser Automation"));

        newTab = handlesList.get(0);
        driver.switchTo().window(newTab);


        By byLinkSearch = By.xpath("//input[@class='gLFyf gsfi']");
        WebElement linkSearch = waitAndGetWebElement(driver, byLinkSearch);
        linkSearch.clear();


        By byFirstImage = By.xpath("//img[@id='i48MSmX01sE18M:']");
        WebElement firstImage = waitAndGetWebElement(driver, byFirstImage);
        //firstImage.click();

        /*By byButtonSearchByImage = By.xpath("//*[@class='S3Wjs']");
        WebElement buttonSearchByImage = waitAndGetWebElement(driver, byButtonSearchByImage);
        buttonSearchByImage.click();*/


        Actions builder = new Actions(driver);
        //builder.dragAndDrop(firstImage, linkSearch).build().perform();
        builder.clickAndHold(firstImage).moveToElement(linkSearch).release().build().perform();



        /*By byLinkFirstResultSite = By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a[1]/h3");
        WebElement linkFirstResultSite = waitAndGetWebElement(driver, byLinkFirstResultSite);
        linkFirstResultSite.click();

        assertTrue(driver.getCurrentUrl().contains("https://www.seleniumhq.org/selenium-ide/"));*/
    }

    @After
    public void tearDownBrowser(){
        driver.quit();
    }
}
