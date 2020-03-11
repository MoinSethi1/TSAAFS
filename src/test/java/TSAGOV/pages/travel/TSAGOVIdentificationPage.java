package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVIdentificationPage extends TSAGOVSecurityScreeningPage {

	@FindBy(xpath = "//*[@id='block-tsa-gov-pagetitle']/h1/span")
	private WebElementFacade identificationText;

	public String verifyIdentificationText() {
		return identificationText.getText();
	}
}
