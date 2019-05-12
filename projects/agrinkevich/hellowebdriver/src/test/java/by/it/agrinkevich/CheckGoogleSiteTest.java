package by.it.agrinkevich;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGoogleSiteTest {

    @Test
    public void userTryFindHelloInGoogle() throws Exception{
        WebDriver driver=new ChromeDriver();
        try {
            driver.get("https://google.com");
            Assert.assertTrue(driver.getTitle().contains("Google"));
        }
        finally {
            driver.quit();
        }
    }
}
