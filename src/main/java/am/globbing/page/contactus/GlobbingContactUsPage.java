package am.globbing.page.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.faq.GlobbingFaqPage;
import am.globbing.page.instagram.GlobbingInstagramPage;
import am.globbing.page.menu.GlobbingMenuPage;
import am.globbing.page.restricteditems.GlobbingRestrictedItemsPage;
import am.globbing.page.termsandconditions.GlobbingTermsAndConditionsPage;
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
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.NAME_INPUT_FIELD)
	public WebElement nameField;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.SUBJECT_INPUT_FIELD)
	public WebElement subjectField;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.EMAIL_INPUT_FIELD)
	public WebElement emailField;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.MESSAGE_INPUT_FIELD)
	public WebElement messageField;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.SEND_BUTTON)
	public WebElement sendButton;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.MESSAGE_IS_SENT)
	public WebElement messageIsSentText;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.CLOSE_MODALE)
	public WebElement closeModale;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.SUBJECT_IDEA)
	public WebElement subjectIdea;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.INVALID_EMAIL)
	public WebElement invalidEmail;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.INVALID_MESSAGE)
	public WebElement invalidMessage;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.FAQ_LINK)
	public WebElement faqLink;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.RESTRICTED_ITEMS_LINK)
	public WebElement restrictedItemsLink;
	
	@FindBy(xpath = GlobbingContactUsPageXpaths.TERMS_AND_CONDITIONS_LINK)	
	public WebElement termsAndConditionsLink;
	
		
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
	
	public void fillInName(String name) {
		nameField.sendKeys(name);
	}
	
	public void fillInSubject() {
		subjectField.click();
		subjectIdea.click();
	}
	
	public void fillInEmailField(String email) {
		emailField.sendKeys(email);
	}
	
	public void fillInMessage(String message) {
		messageField.sendKeys(message);
	}
	
	public void clickOnSendButton() {
		sendButton.click();
	}
	
	public void closeModale() {
		closeModale.click();
	}
	
	public GlobbingFaqPage clickOnFaqLink() {
		faqLink.click();
		return new GlobbingFaqPage(driver);
	}
	
	public GlobbingRestrictedItemsPage clickOnRestrictedItemsLink () {
		restrictedItemsLink.click();
		return new GlobbingRestrictedItemsPage(driver);
	}
	
	public GlobbingTermsAndConditionsPage clickOntermsAndConditionsLink () {
		termsAndConditionsLink.click();
		return new GlobbingTermsAndConditionsPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
}
