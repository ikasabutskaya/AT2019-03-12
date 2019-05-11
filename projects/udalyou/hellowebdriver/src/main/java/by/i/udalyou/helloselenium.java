package by.i.udalyou;

import org.omg.CORBA.WCharSeqHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloselenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://googl.com");
        Thread.sleep(5000);
        By queryLocator=By.xpath
                ("//input[@class='gLFyf gsfi']");
                WebElement queryInput=driver.findElement(queryLocator);
    queryInput.sendKeys("привет \n");
        Thread.sleep(5000);
        driver.quit();
    }
}
