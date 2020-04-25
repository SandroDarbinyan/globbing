package am.globbing.page.termsandconditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.contactus.GlobbingContactUsPage;

public class GlobbingTermsAndConditionsPage extends GlobbingContactUsPage{

	public GlobbingTermsAndConditionsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = GlobbingTermsAndConditionsPageXpaths.TERMS_AND_CONDITIONS_TITLE)
	public WebElement termsAndConditionsTitle;

}
