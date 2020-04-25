package am.globbing.page.contactus;

public class GlobbingContactUsPageXpaths{
	public static final String CONTACT_US_TXT = "//span[contains(@class,'ver-top-box parcel__txt fs20')]";
	public static final String CONTACT_US_FORM = "//div[@class='contact-us__left ver-top-box']";
	public static final String ARABKIR_BRANCH = "//div[@class='wh-text-name mb--10 fs14'][contains(.,'Arabkir')]";
	public static final String ARABKIR_INFO = "//p[contains(.,'Arabkir')]";
	public static final String HRAZDAN_BRANCH = "//div[@class='wh-text-name mb--10 fs14'][contains(.,'Hrazdan')]";
	public static final String HRAZDAN_INFO = "(//p[contains(.,'Hrazdan')])[1]";
	public static final String YOUTUBE_ICON = "//span[contains(.,'Youtube')]";
	public static final String INSTAGRAM_ICON = "//span[contains(.,'Instagram')]";
	public static final String NAME_INPUT_FIELD = "//div[@class='form-box ver-top-box']/input[@class='fs14' and @name='name']";
	public static final String SUBJECT_INPUT_FIELD = "(//span[@class='select2-selection__placeholder'][contains(.,'Subject')])[1]";
	public static final String EMAIL_INPUT_FIELD = "(//input[@name='email'])[3]";
	public static final String MESSAGE_INPUT_FIELD = "(//input[@name='message'])[1]";
	public static final String SEND_BUTTON = "(//button[@type='submit'])[3]";
	public static final String MESSAGE_IS_SENT = "//h5[text()='Thank you']";
	public static final String CLOSE_MODALE = "(//button[contains(@class,'modal__close sprite')])[3]";
	public static final String SUBJECT_IDEA = "//ul[@class='select2-results__options']/li[1]";
	public static final String INVALID_EMAIL = "//p[contains(.,'Invalid e-mail')]";
	public static final String INVALID_MESSAGE = "//p[contains(.,'Invalid message')]";
	public static final String FAQ_LINK = "//a[@href='https://am.globbing.com/en/faq']";
	public static final String RESTRICTED_ITEMS_LINK = "//a[@href='https://am.globbing.com/en/restricted-items']";
	public static final String TERMS_AND_CONDITIONS_LINK = "//a[@href='https://am.globbing.com/en/terms/']";
	
}
