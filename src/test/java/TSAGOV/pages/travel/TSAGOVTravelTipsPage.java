package TSAGOV.pages.travel;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelTipsPage extends TSAGOVTravelPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")

	private WebElementFacade travelTipsText;

	@FindBy(xpath = "//*[@id=\"sidenav_sublist_5\"]/li/a")
	private WebElementFacade travelChecklistLink;

	@FindBy(css = "#block-travel-sidebar > nav.max-tablet-hidden > ul > li:nth-child(5) > div > button")
	private WebElementFacade travelTipsExpand;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	@FindBy(xpath = "//input[@class='form-text usa-input']")
	private WebElementFacade searchBox;

	@FindBy(xpath = "//input[@class='button js-form-submit form-submit usa-button']")
	private WebElementFacade searchButton;

	public boolean verifyTravelTipsText() {
		return travelTipsText.isPresent();
	}

	public TSAGOVTravelChecklistPage navigateToTravelChecklist() {
		travelChecklistLink.click();
		return this.switchToPage(TSAGOVTravelChecklistPage.class);
	}

	public void travelTipsExpand() {
		travelTipsExpand.click();
	}

	public void travelTipsSerchText(String searchItem) {
		searchBox.type(searchItem);

	}

	public List<WebElementFacade> travelTipsResultList() {
		searchButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-row']");
		return result;
	}
}
