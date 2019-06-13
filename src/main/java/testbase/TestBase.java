package testbase;

import java.beans.EventHandler;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver e_driver;
	public static EventHandler eventListener;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:/workspace/JioCinema/config.properties");
			prop.load(ip);
		} catch (Exception e) {
			System.out.println("config file not found");
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
        if (browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		 }
		// else {
		// System.setProperty("webdriver.gecko.driver", "path where the .exe
		// file");
		// driver = new FirefoxDriver();
		// }

		// Initializing EventFiringWebDriver using Firefox/Chrome WebDriver
		// instance
		// e_driver = new EventFiringWebDriver(driver);

		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver

		// eventListener = new EventHandler();

		// register event listener for EventFiringWebDriver instance.
		// e_driver.register((WebDriverEventListener) eventListener);
		// driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			driver.get(prop.getProperty("url"));
		} catch (Exception e) {
			System.out.println("URL not defined");
		}
	}
}
