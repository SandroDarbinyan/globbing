package am.globbing.page.restricteditems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.contactus.GlobbingContactUsPage;

public class GlobbingRestrictedItemsPage extends GlobbingContactUsPage{

	public GlobbingRestrictedItemsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = GlobbingRestrictedItemsPageXpaths.RESTRICTED_ITEMS_TITLE) 
	public WebElement restrictedItemsTitle;

}
