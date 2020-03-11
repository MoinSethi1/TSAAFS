package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelChecklistPage extends TSAGOVTravelTipsPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")

	private WebElementFacade travelChecklistText;

	public String verifyTravelChecklistText() {
		return travelChecklistText.getText();
	}
}
