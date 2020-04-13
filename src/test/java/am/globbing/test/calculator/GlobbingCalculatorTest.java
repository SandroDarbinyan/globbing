package am.globbing.test.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.test.base.GlobbingBaseTest;
import am.globing.page.calculator.GlobbingCalculatorPage;
import am.globing.page.calculator.GlobbingCalculatorPageXpaths;

public class GlobbingCalculatorTest extends GlobbingBaseTest {

	// Test Case ID: 11
	// Test case Description: Given that the user is on the globbing.am home
	// page,when user clicks on calculator icon,
	// where "USA" is selected as default, types 2 in input field,
	// then the cost for 2kg should be 8000
	@Test
	public void usCalculatorTest() {
		// STEP 11.2:Click on Calculator icon
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.calculatorIcon);
		GlobbingCalculatorPage page = menu.openCalculator();
		Assert.assertFalse(driver.findElements(By.xpath(GlobbingCalculatorPageXpaths.PRICE_VALUE)).isEmpty());
		// STEP 11.3: Fill in "2" in weight input field
		page.fillInWeight("2");
		Assert.assertEquals(page.price.getText(), "10000");

		// Additional step:
		page.verifyElementClickable(page.close);
		page.closeCalculator();
		Assert.assertFalse(driver.findElement(By.xpath(GlobbingCalculatorPageXpaths.SHIPPING_COST_TXT)).isDisplayed());

	}

	// Test Case ID: 12
	// Test Case Description: Given that the user is on globbing.am home page,
	// when user clicks on calculator icon,selects "Russia" from drop-down input
	// field and types 4 in next input field,
	// then the cost for 4kg should be 8000
	@Test
	public void rusCalculatorTest() throws InterruptedException {
		// STEP 12.2: Click on calculator icon
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		GlobbingCalculatorPage page = menu.openCalculator();
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingCalculatorPageXpaths.SHIPPING_COST_TXT)).size() >= 1);
		// STEP 12.3: Click on "Countries" input field
		page.verifyElementClickable(page.countries);
		Thread.sleep(1000);
		page.openCountries();
		// STEP 12.4: Select "Russia" from drop-down option
		page.verifyElementClickable(page.inputCountry);
		page.selectCountry("Russia");
		// STEP 12.5: Fill in "4" in weight input field
		page.fillInWeight("4");
		Assert.assertEquals(page.price.getText(), "8000");

		// Additional step:
		page.verifyElementClickable(page.close);
		page.closeCalculator();
		Assert.assertFalse(driver.findElement(By.xpath(GlobbingCalculatorPageXpaths.SHIPPING_COST_TXT)).isDisplayed());
	}

	// Test Case ID: 13
	// Test Case Description: Given that the user is on globbing.am home page,when
	// user clicks on calculator icon,
	// selects "Germany" from drop-down input field and types 3 in next input field,
	// then the cost for 3kg should be 15000
	@Test
	public void germCalculatorTest() throws InterruptedException {
		// STEP 13.2: Click on calculator icon
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		GlobbingCalculatorPage page = menu.openCalculator();
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingCalculatorPageXpaths.SHIPPING_COST_TXT)).size() >= 1);
		// STEP 13.3: Click on "Countries" input field
		page.verifyElementClickable(page.countries);
		Thread.sleep(1000);
		page.openCountries();
		// STEP 13.4: Select "Germany" from drop-down option
		page.verifyElementClickable(page.inputCountry);
		page.selectCountry("Germany");
		// STEP 13.5: Fill in "3" in weight input field
		page.fillInWeight("3");
		Assert.assertEquals(page.price.getText(), "15000");
	}

}
