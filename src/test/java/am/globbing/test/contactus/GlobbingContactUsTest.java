package am.globbing.test.contactus;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.page.contactus.GlobbingContactUsPage;
import am.globbing.page.instagram.GlobbingInstagramPage;
import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.page.youtube.GlobbingYoutubePage;
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
		// 22.2:Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		page.verifyElementClickable(page.hrazdanBranch);
		// 22.3:Click on "Hrazdan" branch
		page.clickOnHrazdanBranch();
		Assert.assertTrue(page.hrazdanInfo.isDisplayed());

	}

	// Test Case ID:23
	// Given that the user is on globbing.am home page,when user clicks on "Contact
	// Us" button,
	// clicks on "Youtube" icon,then Globbing`s youtube channel is opened in a new
	// window
	@Test
	public void youtubeIconTest() {
		// 23.2:Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		page.verifyElementClickable(page.youtubeIcon);

		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// 23.3: Click on "Youtube" icon
		GlobbingYoutubePage youtubePage = page.clickOnYoutubeIcon();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		youtubePage.verifyElementClickable(youtubePage.channelName);
		Assert.assertEquals(youtubePage.channelName.getText(), "Globbing");

		// Close the new window
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}

	// Test Case ID:24
	// Given that the user is on globbing.am home page,when user clicks on "Contact
	// Us" button,
	// clicks on "Instagram" icon,then the Instagram account of Globbing is opened in a new window
	@Test
	public void instagramIconTest() {
		// 24.2:Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		page.verifyElementClickable(page.instagramIcon);

		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// 24.3: Click on "Instagram" icon
		GlobbingInstagramPage instagramPage = page.clickOnInstagramIcon();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		instagramPage.verifyElementClickable(instagramPage.accountName);
		Assert.assertEquals(instagramPage.accountName.getText(), "globbingarmenia");

		// Close the new window
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}

}
