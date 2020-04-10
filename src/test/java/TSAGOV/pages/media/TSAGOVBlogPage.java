package TSAGOV.pages.media;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVBlogPage extends TSAGOVMediaPage {

	@FindBy(css = "#block-tsa-gov-pagetitle > h1")
	private WebElementFacade blogText;

	@FindBy(xpath = "//*[@id=\"edit-search\"]]")
	private WebElementFacade searchBox;

	@FindBy(xpath = "//*[@id=\"edit-submit-blog\"]")
	private WebElementFacade searchButton;

	@FindBy(xpath = "//*[@id=\"edit-year\"]")
	private WebElementFacade yearSelect;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	public String verifyBlogText() {
		return blogText.getText();
	}

	public void enterSearchText(String searchItem, String year) {
		searchBox.type(searchItem);
		yearSelect.selectByVisibleText(year);

	}

	public List<WebElementFacade> searchResultList() {

		searchButton.click();
		spinner.waitUntilNotVisible();

		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-nothing']");

		return result;
	}
}
