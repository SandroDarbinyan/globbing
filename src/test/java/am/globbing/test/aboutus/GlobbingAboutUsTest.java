package am.globbing.test.aboutus;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.globbing.page.aboutus.GlobbingAboutUsPage;
import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.test.base.GlobbingBaseTest;

public class GlobbingAboutUsTest extends GlobbingBaseTest {
	// Test Case ID:18
	// Test Case Description: Given that the user is on globbing.am home page,when
	// user clicks on "About US" button,
	// clicks on "Why globbing" button,then "About us" page is being scrolled down
	// till "Why Globbing" text is displayed
	@Test
	public void goToWhyGlobbingTest() {
		// STEP 18.2:Click on "About Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		GlobbingAboutUsPage page = menu.gotToAboutUsPage();
		page.verifyElementClickable(page.aboutUsTxt);
		Assert.assertTrue(page.aboutUsTxt.isDisplayed());

		// STEP 18.3:Click on "Why Globbing" button
		page.goToWhyGlobbing();
		Assert.assertTrue(page.whyGlobbingSection.isDisplayed());

	}

	// Test Case ID:19
	// Test Case Description: Given that the user is on globbing.am home page,
	// when user clicks on "About US" button,clicks on "Team" button,
	// then "About us" page is being scrolled down till "Team" text is displayed
	@Test
	public void goToTeamTest() {
		// STEP 19.2:Click on "About Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		GlobbingAboutUsPage page = menu.gotToAboutUsPage();
		page.verifyElementClickable(page.aboutUsTxt);
		Assert.assertTrue(page.aboutUsTxt.isDisplayed());

		// STEP 19.3:Click on "Team" button
		page.goToTeam();
		Assert.assertTrue(page.teamSection.isDisplayed());

	}

	// Test Case ID:20
	// Test Case Description: Given that the user is on globbing.am home page,
	//when user clicks on "About US" button,clicks on "Social Responsibility" button,
	//then "About us" page is being scrolled down till "Social Responsibility" text is displayed
	@Test
	public void goToSocialResponsibilityTest() {
		// STEP 20.2:Click on "About Us" button
		GlobbingMenuPage menu = new GlobbingMenuPage(driver);
		GlobbingAboutUsPage page = menu.gotToAboutUsPage();
		page.verifyElementClickable(page.aboutUsTxt);
		Assert.assertTrue(page.aboutUsTxt.isDisplayed());

		// STEP 20.3:Click on "Social Responsibility" button
		page.goToSocialResponsibility();
		Assert.assertTrue(page.socialResponsibilitySection.isDisplayed());

	}
}
