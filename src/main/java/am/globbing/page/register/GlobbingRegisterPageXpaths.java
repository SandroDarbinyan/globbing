package am.globbing.page.register;

public class GlobbingRegisterPageXpaths {
	public static final String EMAIL_FIELD = "//input[@placeholder='Your Email*']";
	public static final String PASSWORD_FIELD = "//input[@placeholder='Password*']";
	public static final String CONFIRM_PASSWORD_FIELD = "//input[contains(@placeholder,'Re-enter Password*')]";
	public static final String PHONE_NUMBER_FIELD = "//input[contains(@name,'phone_number')]";
	public static final String TERMS_CHECKBOX = "//label[contains(.,'I accept')]";
	public static final String REG_SUBMIT = "//button[@class='btn btn--orange btn--shadow width--full fs18 btn--big']";
	public static final String ERROR_MESSAGE = "//p[contains(.,'Passwords are not the same')]";
}
