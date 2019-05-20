package by.it.ikasabutskaya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.seleniumhq.org");
        //удалать слип после отладки
        Thread.sleep(5000);

    }

}
