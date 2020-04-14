package am.globbing.page.youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.contactus.GlobbingContactUsPage;

public class GlobbingYoutubePage extends GlobbingContactUsPage{

	public GlobbingYoutubePage(WebDriver driver) {
		super(driver);
			}
	
	@FindBy(xpath = GlobbingYoutubePageXpaths.CHANNEL_NAME)
	public WebElement channelName;

}
