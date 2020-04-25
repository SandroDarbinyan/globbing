package am.globbing.test.header;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.page.header.GlobbingHeaderPage;
import am.globbing.page.header.GlobbingHeaderPageXpaths;
import am.globbing.page.member.GlobbingMemberPage;
import am.globbing.page.member.GlobbingMemberPageXpaths;
import am.globbing.page.register.GlobbingRegisterPage;
import am.globbing.test.base.GlobbingBaseTest;

public class GlobbingHeaderTest extends GlobbingBaseTest {

	// Test Case ID: 1
	// Test Case Description: Given that the user is on the globbing.am home
	// page,when user clicks on language switcher option,
	// and clicks on Russian flag,then content is presented in Russian language
	@Test
	public void rusLangSwitcherTest() throws InterruptedException {

		// STEP 1.2:Click on language switcher
		GlobbingHeaderPage page = new GlobbingHeaderPage(driver);
		page.verifyElementClickable(page.rusSwitcher);
		page = page.clickOnLanguageSwitcher();

		// STEP 1.3:Click on Russian flag
		page.verifyElementClickable(page.rusSwitcher);
		page = page.contentToRussian();
		page.verifyElementClickable(page.rusLogin);

		// Additional Step:Making to English again
		GlobbingHeaderPage btn = new GlobbingHeaderPage(driver);
		btn.clickOnLanguageSwitcher();
		btn.verifyElementClickable(btn.engSwitcher);
		btn = btn.contentToEnglish();

	}

	// Test Case ID: 2
	// Test Case Description:Given that the user is on the globbing.am home page,
	// when user clicks on "Login" button,then Login window is openned in home page
	@Test
	public void openLoginWindowTest() {
		// STEP 2.2:Click on Login button
		GlobbingHeaderPage page = new GlobbingHeaderPage(driver);
		page = page.openLoginWindow();
		page.verifyElementClickable(page.forgottenPassword);
		Assert.assertTrue(page.forgottenPassword.isDisplayed());
	}

	// Test Case ID: 3
	// Test Case Description:Given that the user is on the globbing.am home
	// page,when user clicks on "Register" button,
	// then new page is openned with registeration form
	@Test
	public void goToRegisterPageTest() {
		// STEP 3.2:Click on Register button
		GlobbingHeaderPage page = new GlobbingHeaderPage(driver);
		GlobbingRegisterPage reg = page.goToRegisterPage();
		Assert.assertTrue(reg.registerBtn.isDisplayed());

		// Additional step:Navigate to back
		driver.navigate().back();
		Assert.assertTrue(driver.findElement(By.xpath(GlobbingHeaderPageXpaths.LOGIN)).isDisplayed());
	}

	// Test Case ID: 14
	// Test Case Description: Given that the user is on globbing.am home page,when
	// user clicks on Login button,
	// fills in correct email and password and clicks on Login button,then user is
	// logged in
	@Test
	public void loginPositiveTest() {
		// STEP 14.2: Click on Login button
		GlobbingHeaderPage header = new GlobbingHeaderPage(driver);
		header = header.openLoginWindow();
		header.verifyElementClickable(header.forgottenPassword);
		Assert.assertTrue(header.forgottenPassword.isDisplayed());
		// STEP 14.3: Fill in "Email" input field
		header.fillInEmail("manualandautomation@gmail.com");
		// STEP 14.4:Fill in "Password" input field
		header.fillInPassword("globbingtest");
		// STEP 14.5:Click on "Login" button
		header.login();
		GlobbingMemberPage member = new GlobbingMemberPage(driver);
		member.verifyElementClickable(member.userMessages);
		Assert.assertTrue(driver.findElements(By.xpath(GlobbingMemberPageXpaths.USER_MESSAGES)).size() >= 1);

		// Additional step: Log out
		member.verifyElementClickable(member.userSettings);
		member.openSettings();
		member.verifyElementClickable(member.logOutBtn);
		member.logOut();
		header.verifyElementClickable(header.loginWindow);
	}

	// Test Case ID: 15
	// Test Case Description: Given that the user is on globbing.am home page,
	// when user clicks on Login button,fills in correct email,does not fill in
	// password and clicks on Login button,
	// then user is not logged in and error message is displayed for password input
	// field
	@Test
	public void loginNegativeTest() {
		// STEP 15.2: Click on Login button
		GlobbingHeaderPage header = new GlobbingHeaderPage(driver);
		header = header.openLoginWindow();
		header.verifyElementClickable(header.forgottenPassword);
		Assert.assertTrue(header.forgottenPassword.isDisplayed());
		// STEP 15.3: Fill in "Email" input field
		header.fillInEmail("manualandautomation@gmail.com");
		// STEP 14.4:Click on "Login" button
		header.login();
		Assert.assertFalse(GlobbingHeaderPageXpaths.PASSWORD_ERROR_MESSAGE.isEmpty());

	}

}
