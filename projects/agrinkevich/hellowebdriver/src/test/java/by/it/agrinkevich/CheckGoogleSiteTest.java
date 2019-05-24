package by.it.agrinkevich;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckGoogleSiteTest {

    @Test
    public void userTryFindHelloInGoogle() throws Exception{
        WebDriver driver=new ChromeDriver();
        try {
            driver.get("https://google.com");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Assert.assertTrue(driver.getTitle().contains("Google"));
        }
        finally {
            driver.quit();
        }
    }
}
