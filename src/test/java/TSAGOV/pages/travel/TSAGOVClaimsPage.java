package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVClaimsPage extends TSAGOVPassengerSupportPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade claimsText;

	public String verifyClaimsText() {
		return claimsText.getText();

	}

}
