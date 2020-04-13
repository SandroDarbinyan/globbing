package am.globbing.page.aboutus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.menu.GlobbingMenuPage;

public class GlobbingAboutUsPage extends GlobbingMenuPage {

	public GlobbingAboutUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingAboutUsPageXpaths.ABOUT_US_TXT)
	public WebElement aboutUsTxt;
	
	@FindBy(xpath = GlobbingAboutUsPageXpaths.WHY_GLOBBING_BUTTON)
	public WebElement whyGlobbingButton;
	
	@FindBy(xpath = GlobbingAboutUsPageXpaths.TEAM_BUTTON)
	public WebElement teamButton;
	
	@FindBy(xpath = GlobbingAboutUsPageXpaths.SOCIAL_RESPONSIBILITY)
	public WebElement socialResponsibilityButton;
	
	@FindBy(xpath = GlobbingAboutUsPageXpaths.WHY_GLOBBING_SECTION)
	public WebElement whyGlobbingSection;
	
	@FindBy(xpath = GlobbingAboutUsPageXpaths.TEAM_SECTION)
	public WebElement teamSection;
	
	@FindBy(xpath = GlobbingAboutUsPageXpaths.SOCIAL_RESPONSIBILITY_SECTION)
	public WebElement socialResponsibilitySection;
	
	
	public GlobbingAboutUsPage goToWhyGlobbing() {
		whyGlobbingButton.click();
		return new GlobbingAboutUsPage(driver);
	}
	
	public GlobbingAboutUsPage goToTeam() {
		teamButton.click();
		return new GlobbingAboutUsPage(driver);
	}
	
	public GlobbingAboutUsPage goToSocialResponsibility() {
		socialResponsibilityButton.click();
		return new GlobbingAboutUsPage(driver);
	}

}
