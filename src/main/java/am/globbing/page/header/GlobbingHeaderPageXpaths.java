package am.globbing.page.header;

public class GlobbingHeaderPageXpaths {
	public static final String LANGUAGE_SWITCHER_XPATH = "//div[contains(@class,'languages__title pr trans-opacity sprite-a pos-abs-vertical-a')]";
	public static final String ENGLISH_SWITCHER_XPATH = "//a[contains(.,'EN')]";
	public static final String RUSSIAN_SWITCHER_XPATH = "//a[contains(.,'RU')]";
	public static final String RUS_LOGIN_BTN = "//button[contains(@class,'login txt--orange')]";
	public static final String LOGIN = "//button[@class='ver-top-box btn fs14 txt__login txt--orange']";
	public static final String FORGOTTEN_PASSWORD = "//a[contains(@class,'txt--orange fs12 forget__txt dib')]";
	public static final String REGISTER_BTN = "//a[contains(@class,'fs14 btn btn--orange btn--orange__reg')]";
	public static final String LOGIN_BUTTON =  "(//button[@type='submit'])[1]";
	public static final String EMAIL_INPUT_FIELD = "(//input[contains(@placeholder,'Email')])[1]";
	public static final String PASSWORD_INPUT_FIELD = "//input[contains(@type,'password')]";
	public static final String PASSWORD_ERROR_MESSAGE = "//p[@class='error-txt fs12 form-error-text form-error-password']";
	
}
