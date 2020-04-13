package am.globbing.page.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.base.GlobbingBasePage;
import am.globbing.page.header.GlobbingHeaderPage;
import am.globbing.page.member.GlobbingMemberPage;
import am.globbing.page.member.GlobbingMemberPageXpaths;

public class GlobbingRegisterPage extends GlobbingHeaderPage {

	public GlobbingRegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingRegisterPageXpaths.EMAIL_FIELD)
	public WebElement emailField;
	
	@FindBy(xpath = GlobbingRegisterPageXpaths.PASSWORD_FIELD)
	public WebElement passwordField;
	
	@FindBy(xpath = GlobbingRegisterPageXpaths.CONFIRM_PASSWORD_FIELD)
	public WebElement confirmPasswordField;
	
	@FindBy(xpath = GlobbingRegisterPageXpaths.PHONE_NUMBER_FIELD)
	public WebElement phoneNumberField;
	
	@FindBy(xpath = GlobbingRegisterPageXpaths.TERMS_CHECKBOX)
	public WebElement termsCheckbox;
	
	@FindBy(xpath = GlobbingRegisterPageXpaths.REG_SUBMIT)
	public WebElement registerBtn;
	
	@FindBy(xpath = GlobbingRegisterPageXpaths.ERROR_MESSAGE)
	public WebElement errorMessage;
	
		
	public GlobbingRegisterPage fillInEmail(String email) {
		emailField.sendKeys(email);
		return new GlobbingRegisterPage(driver);
	}
	
	public GlobbingRegisterPage fillInPassword(String password) {
		 passwordField.sendKeys(password);
		return new GlobbingRegisterPage(driver);
	}
	
	public GlobbingRegisterPage reEnterPassword(String password) {
		confirmPasswordField.sendKeys(password);
		return new GlobbingRegisterPage(driver);
	}
	
	public GlobbingRegisterPage fillInPhoneNumber(String phoneNumber) {
		phoneNumberField.sendKeys(phoneNumber);
		return new GlobbingRegisterPage(driver);
	}
	
	public GlobbingRegisterPage acceptTerms() {
		termsCheckbox.click();
		return new GlobbingRegisterPage(driver);
	}
	
	public GlobbingBasePage register() {
		registerBtn.click();
		if(isElementPresent(GlobbingMemberPageXpaths.VERIFICATION_MESSAGE)) return new GlobbingMemberPage(driver);
		else return new GlobbingRegisterPage(driver);
	}
	
	
	
	

}
