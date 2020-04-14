package am.globbing.page.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.instagram.GlobbingInstagramPage;
import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.page.youtube.GlobbingYoutubePage;

public class GlobbingContactUsPage extends GlobbingMenuPage {

	public GlobbingContactUsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = GlobbingContactUsPageXpaths.CONTACT_US_TXT)
	public WebElement contactUsTxt;

	@FindBy(xpath = GlobbingContactUsPageXpaths.CONTACT_US_FORM)
	public WebElement contactUsForm;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.ARABKIR_BRANCH)
	public WebElement arabkirBranch;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.ARABKIR_INFO)
	public WebElement arabkirInfo;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.HRAZDAN_BRANCH)
	public WebElement hrazdanBranch;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.HRAZDAN_INFO)
	public WebElement hrazdanInfo;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.YOUTUBE_ICON)
	public WebElement youtubeIcon;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.INSTAGRAM_ICON)
	public WebElement instagramIcon;
	
	
	public void clickOnArabkirBranch() {
		arabkirBranch.click();
	}
	
	public void clickOnHrazdanBranch() {
		hrazdanBranch.click();
	}
	
	public GlobbingYoutubePage clickOnYoutubeIcon() {
		youtubeIcon.click();
		return new GlobbingYoutubePage(driver);
	}
	
	public GlobbingInstagramPage clickOnInstagramIcon() {
		instagramIcon.click();
		return new GlobbingInstagramPage(driver);
	}

}
