package testbase;

import java.beans.EventHandler;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver e_driver;
	public static EventHandler eventListener;
	public static JavascriptExecutor js;

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
	
	public static void click(WebElement element) {
		System.out.println("Waiting for the element: " + element + " to be clickable for 10 secs ");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		System.out.println("Element: " + element + "is clickable on page");
	}
	
	public static void verifyElementIsDisplayed(WebElement element) {

		System.out.println("Waiting for the element: " + " ' " + element.getText() + "'" + " to be visible for 10 secs ");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Element: " + element + " is visible on page");

	}
	
	public static void pauseVideo() {
		js=(JavascriptExecutor)driver;
		js.executeScript("jwplayer().pause()");
		System.out.println("Video paused");
	}

	public static void playVideo() {
		js=(JavascriptExecutor)driver;
		js.executeScript("jwplayer().play()");
		System.out.println("Video played");
		}

	public static void setVolume() {
		js=(JavascriptExecutor)driver;
		js.executeScript("jwplayer().setVolume(80)");
		System.out.println("Volume set to 80");
		}
	
	public static void muteVolume() {
		js=(JavascriptExecutor)driver;
		js.executeScript("jwplayer().setMute(true)");
		System.out.println("Video muted");
	}

	

}
