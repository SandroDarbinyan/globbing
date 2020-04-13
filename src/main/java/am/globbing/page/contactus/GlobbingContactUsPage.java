package am.globbing.page.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.menu.GlobbingMenuPage;

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
	
	
	public void clickOnArabkirBranch() {
		arabkirBranch.click();
	}
	
	public void clickOnHrazdanBranch() {
		hrazdanBranch.click();
	}

}
