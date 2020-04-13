package am.globbing.page.topshops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.menu.GlobbingMenuPage;

public class GlobbingTopShopsPage extends GlobbingMenuPage {

	public GlobbingTopShopsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = GlobbingTopShopsPageXpaths.TOP_SHOPS_SECTION)
	public WebElement topShopSection;

}
