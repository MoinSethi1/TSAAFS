package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelRedressPage extends TSAGOVPassengerSupportPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")
	private WebElementFacade travelRedressText;

	public String verifyTravelRedressText() {
		return travelRedressText.getText();
	}
}
