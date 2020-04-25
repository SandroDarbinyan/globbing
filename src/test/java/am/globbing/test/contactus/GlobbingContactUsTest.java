package am.globbing.test.contactus;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.page.contactus.GlobbingContactUsPage;
import am.globbing.page.faq.GlobbingFaqPage;
import am.globbing.page.instagram.GlobbingInstagramPage;
import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.page.restricteditems.GlobbingRestrictedItemsPage;
import am.globbing.page.termsandconditions.GlobbingTermsAndConditionsPage;
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
		page.verifyElementClickable(page.arabkirInfo);
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
	// clicks on "Instagram" icon,then the Instagram account of Globbing is opened
	// in a new window
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

	// Test Case ID:25
	// Given that the user is on globbing.am home page,when user clicks on "Contact
	// Us" page,
	// fills in contact form with correct values and clicks on "Send" button,then
	// message should be sent
	@Test
	public void contactFormFunctionalityTest1() {
		// 25.2.Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		// 25.3.Fills in "Name" input field
		page.fillInName("Name");
		// 25.4.Fills in "Subject" input filed
		page.fillInSubject();
		// 25.5.Fills in "Email" input field
		page.fillInEmailField("name@name.com");
		// 25.6.Fills in "Message text" input filed
		page.fillInMessage("Message");
		// 25.7.Clicks on "Send" button
		page.clickOnSendButton();
		page.verifyElementClickable(page.messageIsSentText);
		Assert.assertTrue(page.messageIsSentText.isDisplayed());

		page.closeModale();
	}

	// Test Case ID:26
	// Given that the user is on globbing.am home page,when user clicks on "Contact
	// Us" button,
	// fills in contact form with correct values besides email input field,clicks on
	// "Send" button,
	// then message should not be sent and error message should be displayed for
	// "Email" input field
	@Test
	public void contactFormFunctionalityTest2() {
		// 26.2.Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		// 26.3.Fills in "Name" input field
		page.fillInName("Name");
		// 26.4.Fills in "Subject" input filed
		page.fillInSubject();
		// 26.5.Fills in "Message text" input filed
		page.fillInMessage("Message");
		// 26.6.Clicks on "Send" button
		page.clickOnSendButton();
		page.verifyElementClickable(page.invalidEmail);
		Assert.assertTrue(page.invalidEmail.isDisplayed());
	}

	// Test Case ID:27
	// Given that the user is on globbing.am home page,when user clicks on "Contact
	// Us" button,
	// fills in contact form with correct values besides email input field,clicks on
	// "Send" button,
	// then the message should not be sent and error message should be displayed for
	// "Email" input field
	@Test
	public void contactFormFunctionalityTest3() {
		// 27.2.Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		// 27.3.Fills in "Name" input field
		page.fillInName("Name");
		// 27.4.Fills in "Subject" input filed
		page.fillInSubject();
		// 27.5.Fills in "Email" input filed
		page.fillInEmailField("test@test.com");
		// 27.6.Clicks on "Send" button
		page.clickOnSendButton();
		page.verifyElementClickable(page.invalidMessage);
		Assert.assertTrue(page.invalidMessage.isDisplayed());
	}

	// Test Case ID:28
	// Given that the user is on globbing.am home page, when user clicks on "Contact
	// Us" button,
	// clicks on "FAQ" button, then new page is opened with "Frequently Asked
	// Questions" title
	@Test
	public void faqFunctionalityTest() {
		// 28.2.Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		// 28.3.Click on "FAQ" button
		GlobbingFaqPage faq = page.clickOnFaqLink();
		faq.verifyElementClickable(faq.faqTitle);
		Assert.assertTrue(faq.faqTitle.isDisplayed());
	}

	// Test Case ID:29
	// Given that the user is on globbing.am home page, when user clicks on "Contact
	// Us" button,
	// clicks on "Restricted Items" button, then new page is opened with "Restricted
	// items" title
	@Test
	public void restrictedItemsFunctionalityTest() {
		// 29.2.Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		// 29.3.Click on "Restricted Items" button
		GlobbingRestrictedItemsPage items = page.clickOnRestrictedItemsLink();
		items.verifyElementClickable(items.restrictedItemsTitle);
		Assert.assertTrue(items.restrictedItemsTitle.isDisplayed());

	}

	// Test Case ID:30
	// Given that the user is on globbing.am home page, when user clicks on "Contact
	// Us" button,
	// clicks on "Terms and Conditions" button, then new page is opened with "Terms
	// and Conditions" title
	@Test
	public void termsAndConditionsFunctionalityTest() {
		// 30.2.Click on "Contact Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		menu.verifyElementClickable(menu.contactUsBtn);
		GlobbingContactUsPage page = menu.gotToContactUsPage();
		page.verifyElementClickable(page.contactUsForm);
		Assert.assertTrue(page.contactUsForm.isDisplayed());
		// 30.3.Click on "Terms and Conditions" button
		GlobbingTermsAndConditionsPage terms = page.clickOntermsAndConditionsLink();
		terms.verifyElementClickable(terms.termsAndConditionsTitle);
		Assert.assertTrue(terms.termsAndConditionsTitle.isDisplayed());

	}

}
