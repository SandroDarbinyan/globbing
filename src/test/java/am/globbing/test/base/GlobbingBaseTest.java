package am.globbing.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import am.globbing.page.header.GlobbingHeaderPage;

public class GlobbingBaseTest {
	protected WebDriver driver;

	@BeforeClass
	public void prepareEnv() throws IOException {
		Properties prop;
		prop = readPropertiesFile("src/test/resources/browser.properties");
		String browserType = prop.getProperty("type");
		String driverPath = prop.getProperty("path");
		System.setProperty(browserType, driverPath);
		openBrowser(browserType);

		// Step *.1 : Go to www.globbing.am
		driver.get("https://am.globbing.com/en");
		driver.manage().window().maximize();

		// Making website content to English
		GlobbingHeaderPage btn = new GlobbingHeaderPage(driver);
		btn.clickOnLanguageSwitcher();
		btn.verifyElementClickable(btn.engSwitcher);
		btn = btn.contentToEnglish();

	}

	@AfterClass
	public void cleanUp() {
		 driver.quit();
	}

	public Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}

	public void openBrowser(String browserType) {
		switch (browserType) {
		case "webdriver.chrome.driver":
			driver = new ChromeDriver();
			break;
		case "webdriver.gecko.driver":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new InternetExplorerDriver();
		}

	}

}
