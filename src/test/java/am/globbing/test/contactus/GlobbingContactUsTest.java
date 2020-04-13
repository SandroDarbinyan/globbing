package am.globbing.test.contactus;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.page.contactus.GlobbingContactUsPage;
import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.test.base.GlobbingBaseTest;

public class GlobbingContactUsTest extends GlobbingBaseTest {
	// Test Case ID:21
	// Given that the user is on globbing.am home page,when user clicks on "About
	// US" button,
	// clicks on "Social Responsibility" button,
	// then "About us" page is being scrolled down till "Social Responsibility"
	// section is displayed
	@Test
	public void arabkirBranchTest() {
		// 21.2:Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		page.verifyElementClickable(page.arabkirBranch);
		// 21.3:Click on "Arabkir" branch
		page.clickOnArabkirBranch();
		Assert.assertTrue(page.arabkirInfo.isDisplayed());

	}

	// Test Case ID:22
	// Given that the user is on globbing.am home page,when user clicks on "Contact
	// Us" button,
	// clicks on "Hrazdan" branch,then information about "Hrazdan" branch is
	// displayed in the pop-up window opened on the map
	@Test
	public void hrazdanBranchTest() {
		// 21.2:Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		page.verifyElementClickable(page.hrazdanBranch);
		// 21.3:Click on "Hrazdan" branch
		page.clickOnHrazdanBranch();
		Assert.assertTrue(page.hrazdanInfo.isDisplayed());

	}

}
