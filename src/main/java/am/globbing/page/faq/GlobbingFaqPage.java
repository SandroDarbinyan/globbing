package am.globbing.page.faq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.contactus.GlobbingContactUsPage;

public class GlobbingFaqPage extends GlobbingContactUsPage {

	public GlobbingFaqPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingFaqPageXpaths.FAQ_TITLE)
	public WebElement faqTitle;

}
