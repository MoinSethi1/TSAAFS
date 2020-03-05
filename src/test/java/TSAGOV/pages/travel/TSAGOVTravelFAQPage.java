package TSAGOV.pages.travel;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelFAQPage extends TSAGOVTravelPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade travelFAQText;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	@FindBy(xpath = "//input[@class='form-text usa-input']")
	private WebElementFacade searchBox;

	@FindBy(xpath = "//input[@class='button js-form-submit form-submit usa-button']")
	private WebElementFacade searchButton;

	public boolean verifyTravelFAQText() {
		return travelFAQText.isPresent();
	}

	public void faqSerchText(String searchItem) {
		searchBox.type(searchItem);

	}

	public List<WebElementFacade> faqResultList() {
		searchButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-field-faq-category']");
		return result;
	}

}
