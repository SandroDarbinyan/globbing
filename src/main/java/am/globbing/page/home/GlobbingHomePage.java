package am.globbing.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.menu.GlobbingMenuPage;

public class GlobbingHomePage extends GlobbingMenuPage {

	public GlobbingHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingHomePageXpaths.HOME_SECTION)
	public WebElement homeSection;

}
