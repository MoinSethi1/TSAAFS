package TSAGOV.pages.Home;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVAToZPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade aTozText;

	@FindBy(xpath = "//input[@class='form-text usa-input']")
	private WebElementFacade searchBox;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	@FindBy(xpath = "//input[@class='button js-form-submit form-submit usa-button']")
	private WebElementFacade searchButton;

	public String aToZText() {
		return aTozText.getText();
	}

	public void aTozSerchText(String searchItem) {
		searchBox.type(searchItem);

	}

	public List<WebElementFacade> aTozResultList() {
		searchButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-field-a-z-link']");
		return result;
	}
}
