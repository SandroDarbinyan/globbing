package am.globbing.page.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.base.GlobbingBasePage;
import am.globbing.page.header.GlobbingHeaderPage;
import am.globbing.page.home.GlobbingHomePage;
import am.globbing.page.home.GlobbingHomePageXpaths;

public class GlobbingMemberPage extends GlobbingHeaderPage {

	public GlobbingMemberPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingMemberPageXpaths.USER_SETTINGS)
	public WebElement userSettings;

	@FindBy(xpath = GlobbingMemberPageXpaths.LOG_OUT_BUTTON)
	public WebElement logOutBtn;

	@FindBy(xpath = GlobbingMemberPageXpaths.USER_MESSAGES)
	public WebElement userMessages;
	
	@FindBy(xpath = GlobbingMemberPageXpaths.VERIFICATION_MESSAGE)
	public WebElement verificationMessage;

	public GlobbingMemberPage openSettings() {
		userSettings.click();
		return new GlobbingMemberPage(driver);
	}

	public GlobbingBasePage logOut() {
		logOutBtn.click();
		if (isElementPresent(GlobbingHomePageXpaths.HOME_SECTION))
			return new GlobbingHomePage(driver);
		else
			return new GlobbingMemberPage(driver);
	}

}
