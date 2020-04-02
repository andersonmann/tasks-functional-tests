package br.rs.ammann.tasks.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author anderson.mann
 *
 */

public class BrowserFactory {
	protected static WebDriver driver;
	private static final String URL = "https://www.google.com";

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		try {
			driver.get(URL);
		} catch (TimeoutException e) {
			System.out.println("Page: " + URL + " did not load within 10 seconds!");
			e.printStackTrace();
		}
	}

	@AfterMethod
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}