package TSAGOV.pages.travel;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVFAQPage extends TSAGOVTSAPrecheckPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade faqText;

	@FindBy(xpath = "//input[@id='edit-combine']")
	private WebElementFacade searchBox;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	@FindBy(xpath = "//input[@class='button js-form-submit form-submit usa-button']")
	private WebElementFacade searchButton;

	public boolean verifyFaqText() {
		return faqText.isPresent();
	}

	public void prefaqSerchText(String searchItem) {
		searchBox.type(searchItem);

	}

	public List<WebElementFacade> prefaqResultList() {
		searchButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-field-faq-category']");
		return result;
	}

}
