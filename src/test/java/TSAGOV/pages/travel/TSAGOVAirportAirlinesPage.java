package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVAirportAirlinesPage extends TSAGOVTSAPrecheckPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade airportsAirlinesText;

	// {"method":"xpath","selector":"//*[@id='precheck-search-results']/div/ul/li"}

	@FindBy(xpath = "//input[@id=\"edit-precheck-search-box\"]")
	private WebElementFacade airportBox;

	@FindBy(xpath = "//*[@id=\"precheck-search-results\"]/div")
	private WebElementFacade searchBoxResult;

	public String verifyAirportsAirlinesText() {

		return airportsAirlinesText.getText();
	}

	public void airportSerchText(String searchItem) {
		airportBox.type(searchItem);
		searchBoxResult.waitUntilPresent();

	}

	public WebElementFacade airportResultList() {

		WebElementFacade result = findBy("//*[@id=\"precheck-search-results\"]/div/ul/li[1]/a");
		// *[@id="precheck-search-results"]/div/ul/li[1]/a
		return result;
	}

}
