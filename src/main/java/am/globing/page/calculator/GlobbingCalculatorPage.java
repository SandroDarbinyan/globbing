package am.globing.page.calculator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.globbing.page.menu.GlobbingMenuPage;

public class GlobbingCalculatorPage extends GlobbingMenuPage {

	public GlobbingCalculatorPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = GlobbingCalculatorPageXpaths.WEIGHT_INPUT_FIELD)
	public WebElement weight;

	@FindBy(xpath = GlobbingCalculatorPageXpaths.PRICE_VALUE)
	public WebElement price;

	@FindBy(xpath = GlobbingCalculatorPageXpaths.CLOSE_WINDOW)
	public WebElement close;

	@FindBy(xpath = GlobbingCalculatorPageXpaths.COUNTRY_INPUT_FIELD)
	public WebElement countries;

	@FindBy(xpath = GlobbingCalculatorPageXpaths.RUSSIA_BTN)
	public WebElement russia;

	@FindBy(xpath = GlobbingCalculatorPageXpaths.INPUT_COUNTRY)
	public WebElement inputCountry;

	public GlobbingCalculatorPage fillInWeight(String value) {
		weight.clear();
		weight.sendKeys(value);
		return new GlobbingCalculatorPage(driver);
	}

	public GlobbingCalculatorPage openCountries() {
		countries.click();
		return new GlobbingCalculatorPage(driver);
	}

	public GlobbingCalculatorPage selectCountry(String country) {
		inputCountry.sendKeys(country);
		inputCountry.sendKeys(Keys.ENTER);
		return new GlobbingCalculatorPage(driver);
	}

	public GlobbingCalculatorPage closeCalculator() {
		close.click();
		return new GlobbingCalculatorPage(driver);
	}

}
