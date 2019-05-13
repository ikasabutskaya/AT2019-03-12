package by.it.okoyro;

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

import java.util.List;

public class CheckFindImageGoogleSiteTest {

	private WebDriver driver;

	//	private static WebElement waitAndGetWebElement(WebDriver driver, By queryLocator) {
	//		(new WebDriverWait(driver, 5))
	//				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class = 'gLFyf gsfi']")));
	//		return WebElement;
	//	}

	@Before
	public void setUpBrowser() {
		driver = new ChromeDriver();
		//		driver.manage().window().maximize(); doesn't work WebDriverException: unknown error: failed to change window state to maximized, current state is normal
	}

	@Test
	public void taskA() throws Exception {
		driver.get("https://google.com");
		WebElement searchInput = (new WebDriverWait(driver, 5))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.gLFyf.gsfi")));
		searchInput.sendKeys("seleniumhq\n");
		WebElement imagesLink = (new WebDriverWait(driver, 5))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#hdtb-msb-vis  a.q.qs[href*='isch']")));
		imagesLink.click();
		(new WebDriverWait(driver, 5))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.S3Wjs")));
		List<WebElement> images = driver.findElements(By.cssSelector("div#is-hlc a.iKjWAf"));
		WebElement firstImage = images.get(1);
//				.findElement(By.xpath("."));
		firstImage.click();

//		WebElements images = (new WebDriverWait(driver, 5))
//						.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div#is-hlc a.iKjWAf")));


		Thread.sleep(5000);


		Assert.assertEquals("1", "1");
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
