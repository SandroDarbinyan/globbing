package am.globbing.page.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.base.GlobbingBasePage;
import am.globbing.page.member.GlobbingMemberPage;
import am.globbing.page.member.GlobbingMemberPageXpaths;
import am.globbing.page.register.GlobbingRegisterPage;

public class GlobbingHeaderPage extends GlobbingBasePage {

	public GlobbingHeaderPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingHeaderPageXpaths.LANGUAGE_SWITCHER_XPATH)
	WebElement langSwitcher;

	@FindBy(xpath = GlobbingHeaderPageXpaths.ENGLISH_SWITCHER_XPATH)
	public WebElement engSwitcher;

	@FindBy(xpath = GlobbingHeaderPageXpaths.RUSSIAN_SWITCHER_XPATH)
	public WebElement rusSwitcher;

	@FindBy(xpath = GlobbingHeaderPageXpaths.RUS_LOGIN_BTN)
	public WebElement rusLogin;

	@FindBy(xpath = GlobbingHeaderPageXpaths.LOGIN)
	public WebElement loginWindow;

	@FindBy(xpath = GlobbingHeaderPageXpaths.EMAIL_INPUT_FIELD)
	public WebElement emailField;

	@FindBy(xpath = GlobbingHeaderPageXpaths.PASSWORD_INPUT_FIELD)
	public WebElement passwordField;

	@FindBy(xpath = GlobbingHeaderPageXpaths.LOGIN_BUTTON)
	public WebElement loginBtn;

	@FindBy(xpath = GlobbingHeaderPageXpaths.FORGOTTEN_PASSWORD)
	public WebElement forgottenPassword;

	@FindBy(xpath = GlobbingHeaderPageXpaths.REGISTER_BTN)
	public WebElement register;

	public GlobbingHeaderPage clickOnLanguageSwitcher() {
		langSwitcher.click();
		return new GlobbingHeaderPage(driver);
	}

	public GlobbingHeaderPage contentToEnglish() {
		engSwitcher.click();
		return new GlobbingHeaderPage(driver);
	}

	public GlobbingHeaderPage contentToRussian() {
		rusSwitcher.click();
		return new GlobbingHeaderPage(driver);
	}

	public GlobbingHeaderPage openLoginWindow() {
		loginWindow.click();
		return new GlobbingHeaderPage(driver);
	}

	public GlobbingRegisterPage goToRegisterPage() {
		register.click();
		return new GlobbingRegisterPage(driver);
	}

	public GlobbingHeaderPage fillInEmail(String email) {
		emailField.sendKeys(email);
		return new GlobbingHeaderPage(driver);
	}

	public GlobbingHeaderPage fillInPassword(String password) {
		passwordField.sendKeys(password);
		return new GlobbingHeaderPage(driver);
	}

	public GlobbingBasePage login() {
		loginBtn.click();
		if (isElementPresent(GlobbingMemberPageXpaths.USER_MESSAGES))
			return new GlobbingMemberPage(driver);
		else
			return new GlobbingHeaderPage(driver);

	}

}
