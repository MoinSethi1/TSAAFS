package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVCivilRightsPage extends TSAGOVPassengerSupportPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade civilRightsText;

	public String verifyCivilRightsText() {
		return civilRightsText.getText();
	}
}
