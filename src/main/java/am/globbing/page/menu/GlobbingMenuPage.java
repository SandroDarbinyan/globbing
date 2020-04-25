package am.globbing.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.aboutus.GlobbingAboutUsPage;
import am.globbing.page.buyforme.GlobbingBuyForMePage;
import am.globbing.page.contactus.GlobbingContactUsPage;
import am.globbing.page.getaddress.GlobbingGetAddressPage;
import am.globbing.page.header.GlobbingHeaderPage;
import am.globbing.page.home.GlobbingHomePage;
import am.globbing.page.topshops.GlobbingTopShopsPage;
import am.globing.page.calculator.GlobbingCalculatorPage;

public class GlobbingMenuPage extends GlobbingHeaderPage {

	public GlobbingMenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingMenuPageXpaths.LOGO_XPATH)
	public WebElement logo;

	@FindBy(xpath = GlobbingMenuPageXpaths.ABOUT_US_BTN)
	public WebElement aboutUsBtn;

	@FindBy(xpath = GlobbingMenuPageXpaths.CONTACT_US_BTN)
	public WebElement contactUsBtn;

	@FindBy(xpath = GlobbingMenuPageXpaths.SERVICES_BTN)
	public WebElement servicesBtn;

	@FindBy(xpath = GlobbingMenuPageXpaths.BUY_FOR_ME_BTN)
	public WebElement buyForMeBtn;

	@FindBy(xpath = GlobbingMenuPageXpaths.GET_ADDRESS_BTN)
	public WebElement getAddressBtn;

	@FindBy(xpath = GlobbingMenuPageXpaths.TOP_SHOPS_BTN)
	public WebElement topShopsBtn;

	@FindBy(xpath = GlobbingMenuPageXpaths.CALCULATOR_ICON)
	public WebElement calculatorIcon;

	public GlobbingHomePage clickOnLogo() {
		logo.click();
		return new GlobbingHomePage(driver);
	}

	public GlobbingAboutUsPage gotToAboutUsPage() {
		aboutUsBtn.click();
		return new GlobbingAboutUsPage(driver);
	}

	public GlobbingContactUsPage gotToContactUsPage() {
		contactUsBtn.click();
		return new GlobbingContactUsPage(driver);
	}

	public GlobbingMenuPage clickOnServicesButton() {
		servicesBtn.click();
		return new GlobbingMenuPage(driver);
	}

	public GlobbingBuyForMePage goToBuyForMePage() {
		buyForMeBtn.click();
		return new GlobbingBuyForMePage(driver);
	}

	public GlobbingGetAddressPage goToGetAddressPage() {
		getAddressBtn.click();
		return new GlobbingGetAddressPage(driver);
	}

	public GlobbingTopShopsPage goToTopShopsPage() {
		topShopsBtn.click();
		return new GlobbingTopShopsPage(driver);
	}

	public GlobbingCalculatorPage openCalculator() {
		calculatorIcon.click();
		return new GlobbingCalculatorPage(driver);
	}

}
