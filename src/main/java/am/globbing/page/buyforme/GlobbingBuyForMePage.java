package am.globbing.page.buyforme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.menu.GlobbingMenuPage;

public class GlobbingBuyForMePage extends GlobbingMenuPage {

	public GlobbingBuyForMePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingBuyForMePageXpaths.BUY_FOR_ME_TXT)
	public WebElement buyForMeTxt;

}
