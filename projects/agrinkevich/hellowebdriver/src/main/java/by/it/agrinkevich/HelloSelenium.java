package by.it.agrinkevich;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);
        /*By queryLocator=By.xpath("//input[@class='gLFyf gsfi']");
        WebElement queryInput = waitAndGetWebElement(driver, queryLocator);
        queryInput.sendKeys("привет\n");
        waitAndGetWebElement(driver,By.xpath("//span[@class=\"csb ch\"]"));*/
        driver.quit();
    }

    /*private static WebElement waitAndGetWebElement(WebDriver driver, By queryLocator) {
        (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(queryLocator));
        return driver.findElement(queryLocator);
    }*/
}
