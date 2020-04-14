package am.globbing.page.instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.contactus.GlobbingContactUsPage;

public class GlobbingInstagramPage extends GlobbingContactUsPage{

	public GlobbingInstagramPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = GlobbingInstagramPageXpaths.ACCOUNT_NAME)
	public WebElement accountName;

}
