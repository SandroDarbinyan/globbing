package am.globbing.test.register;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.page.header.GlobbingHeaderPage;
import am.globbing.page.member.GlobbingMemberPage;
import am.globbing.page.member.GlobbingMemberPageXpaths;
import am.globbing.page.register.GlobbingRegisterPage;
import am.globbing.test.base.GlobbingBaseTest;

public class GlobbingRegisterTest extends GlobbingBaseTest {
	// Test Case ID: 16
	// Test Case Description: Given that the user is on globbing.am home page,when
	// user clicks on Registration button,
	// fills in correct values and click on registration button,then new page is
	// opened with text "We have sent a verification email.
	// Confirm Registration from email"
	@Test
	public void registrationPositiveTest()  {
		// STEP 16.2:Click on Register button
		GlobbingHeaderPage header = new GlobbingHeaderPage(driver);
		GlobbingRegisterPage page = header.goToRegisterPage();
		Assert.assertTrue(page.registerBtn.isDisplayed());
		// STEP 16.3:Fill in correct email in "Email" input field
		int rand = ThreadLocalRandom.current().nextInt(100, 1000);
		page.fillInEmail("globbingtest" + rand + "@gmail.com");
		// STEP 16.4:Fill in correct password in "Password" input field
		page.fillInPassword("globbingtest");
		// STEP 16.5:Re-enter the same password in the next input field
		page.reEnterPassword("globbingtest");
		// STEP 16.6:Fill in phone number in "Phone number" input field
		page.fillInPhoneNumber("000000000");
		// STEP 16.7:Click on "Terms and conditions" checkbox
		page.acceptTerms();
		// STEP 16.7:Click on "Register" button
		page.register();
		GlobbingMemberPage reg = new GlobbingMemberPage(driver);
		reg.waitForElementPresent(reg.verificationMessage);
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingMemberPageXpaths.VERIFICATION_MESSAGE)).size() >= 1);

	}

	// Test Case ID: 17
	// Test Case Description: Given that the user is on globbing.am home page,
	// when user clicks on Registration button,fills in correct email,password,fills
	// in incorrect password in "Re-type password" input field,
	// fills in correct phone number,clicks on checkbox and select "Registration"
	// button,
	// then registration is not done and error message "Passwords are not the same,
	// Password Not Valid" is displayed
	@Test
	public void registrationNegativeTest() {
		// STEP 17.2:Click on Register button
		GlobbingHeaderPage header = new GlobbingHeaderPage(driver);
		header.verifyElementClickable(header.register);
		GlobbingRegisterPage page = header.goToRegisterPage();
		page.verifyElementClickable(page.registerBtn);
		Assert.assertTrue(page.registerBtn.isDisplayed());
		// STEP 17.3:Fill in correct email in "Email" input field
		int rand = ThreadLocalRandom.current().nextInt(1000, 10000);
		page.fillInEmail("globbingtest" + rand + "@gmail.com");
		// STEP 17.4:Fill in correct password in "Password" input field
		page.fillInPassword("globbingtest");
		// STEP 17.5:Re-enter the same password in the next input field
		page.reEnterPassword("testglobbing");
		// STEP 17.6:Fill in phone number in "Phone number" input field
		page.fillInPhoneNumber("000000000");
		// STEP 17.7:Click on "Terms and conditions" checkbox
		page.acceptTerms();
		// STEP 17.7:Click on "Register" button
		page.register();
		page.waitForElementPresent(page.errorMessage);
		Assert.assertTrue(page.errorMessage.isDisplayed());

	}
}
