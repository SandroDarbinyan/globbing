package am.globbing.test.menu;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.page.aboutus.GlobbingAboutUsPage;
import am.globbing.page.buyforme.GlobbingBuyForMePage;
import am.globbing.page.buyforme.GlobbingBuyForMePageXpaths;
import am.globbing.page.contactus.GlobbingContactUsPage;
import am.globbing.page.getaddress.GlobbingGetAddressPage;
import am.globbing.page.getaddress.GlobbingGetAddressPageXpaths;
import am.globbing.page.home.GlobbingHomePage;
import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.page.menu.GlobbingMenuPageXpaths;
import am.globbing.page.topshops.GlobbingTopShopsPage;
import am.globbing.page.topshops.GlobbingTopShopsPageXpaths;
import am.globbing.test.base.GlobbingBaseTest;
import am.globing.page.calculator.GlobbingCalculatorPageXpaths;

public class GlobbingMenuTest extends GlobbingBaseTest {
	// Test Case ID: 4
	// Test Case Description: Given that the user is on the globbing.am home
	// page,when user clicks on the Globbing logo,
	// then the home page is reloaded
	@Test
	public void logoFunctionalityTest() {

		// STEP 4.2:Click on Globbing logo
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.logo);
		GlobbingHomePage page = menu.clickOnLogo();
		page.verifyElementClickable(page.homeSection);
		Assert.assertTrue(page.homeSection.isDisplayed());
	}

	// Test Case ID: 5
	// Test case Description:Given that the user is on globbing.am home page,when
	// user clicks on "About us" button,
	// then new page is opened telling about the company
	@Test
	public void aboutUsLinkTest() {
		// STEP 5.2:Click on "About Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		GlobbingAboutUsPage page = menu.gotToAboutUsPage();
		page.verifyElementClickable(page.aboutUsTxt);
		Assert.assertTrue(page.aboutUsTxt.isDisplayed());
	}

	// Test Case ID: 6
	// Test case Description:Given that the user is on globbing.am home page,when
	// user clicks on "Contact us" button,
	// then new page is opened with contact form
	@Test
	public void contactUsUsLinkTest() {
		// STEP 6.2:Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
	}

	// Test Case ID: 7
	// Test case Description: Given that the user is on the globbing.am home
	// page,whe user clicks on
	// "Services" button,clicks on "Buy for me" opened option,
	// then New page is openned containing "Let Globbing buy products for you" text
	@Test
	public void buyForMeLinkTest() {
		// STEP 7.2:Click on "Services" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu = menu.clickOnServicesButton();
		menu.verifyElementClickable(menu.buyForMeBtn);
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingMenuPageXpaths.BUY_FOR_ME_BTN)).size() >= 1);
		// Step 7.3:Click on "Buy For Me" button
		GlobbingBuyForMePage page = menu.goToBuyForMePage();
		page.verifyElementClickable(page.buyForMeTxt);
		Assert.assertTrue(page.isElementPresent(GlobbingBuyForMePageXpaths.BUY_FOR_ME_TXT));

	}

	// Test Case ID: 8
	// Test case Description: Given that the user is on the globbing.am home
	// page,when user clicks on
	// "Services" button,clicks on "Get Address" opened option,
	// then new page is openned containing "How it works" text
	@Test
	public void getAddressLinkTest() {
		// STEP 8.2:Click on "Services" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu = menu.clickOnServicesButton();
		menu.verifyElementClickable(menu.getAddressBtn);
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingMenuPageXpaths.GET_ADDRESS_BTN)).size() >= 1);
		// Step 8.3:Click on "Get Address" button
		GlobbingGetAddressPage page = menu.goToGetAddressPage();
		page.verifyElementClickable(page.getAddressTxt);
		Assert.assertTrue(page.isElementPresent(GlobbingGetAddressPageXpaths.GET_ADDRESS_TXT));

	}

	// Test Case ID: 9
	// Test case Description: Given that the user is on globbing.am home page,when
	// user clicks on "Top
	// Shops" button,
	// then new page is opened which contains "Top Shops" title and contains some
	// list with Top Shops
	@Test
	public void topShopsLinkTest() {
		// STEP 9.2:Click on "Top Shops" button
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingMenuPageXpaths.TOP_SHOPS_BTN)).size() >= 1);
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu = menu.goToTopShopsPage();
		GlobbingTopShopsPage page = new GlobbingTopShopsPage(driver);
		page.verifyElementClickable(page.topShopSection);
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingTopShopsPageXpaths.TOP_SHOPS_SECTION)).size() >= 1);

	}

	// Test Case ID: 10
	// Test case Description: Given that the user is on the globbing.am home
	// page,when user clicks on calculator icon,
	// then a window is opened on top of the home page which contains "Shipping
	// cost" text
	@Test
	public void calculatorLinkTest() {
		// STEP 10.2:Click on "Calculator" icon
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingMenuPageXpaths.CALCULATOR_ICON)).size() >= 1);
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu = menu.openCalculator();
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingCalculatorPageXpaths.SHIPPING_COST_TXT)).size() >= 1);

	}

}
