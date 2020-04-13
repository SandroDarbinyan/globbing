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

}
