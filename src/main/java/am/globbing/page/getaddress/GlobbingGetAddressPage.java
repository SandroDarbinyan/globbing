package am.globbing.page.getaddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.menu.GlobbingMenuPage;

public class GlobbingGetAddressPage extends GlobbingMenuPage{

	public GlobbingGetAddressPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingGetAddressPageXpaths.GET_ADDRESS_TXT)
	public WebElement getAddressTxt;
}
