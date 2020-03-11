package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVAirportAirlinesPage extends TSAGOVTSAPrecheckPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade airportsAirlinesText;

	@FindBy(xpath = "//input[@id=\"edit-precheck-search-box\"]")
	private WebElementFacade airportBox;

	public String verifyAirportsAirlinesText() {

		return airportsAirlinesText.getText();
	}

	public void airportSerchText(String searchItem) {
		airportBox.type(searchItem);

	}

	public WebElementFacade airportResultList() {

		WebElementFacade result = findBy("//*[@id='precheck-search-results']/div/ul/li");
		return result;
	}

}
