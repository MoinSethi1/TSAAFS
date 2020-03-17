package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVFactsheetsPage extends TSAGOVMediaPage {

	@FindBy(css = "#block-tsa-gov-pagetitle > h1")
	private WebElementFacade factsheetsText;

	public String verifyFactsheetsText() {
		return factsheetsText.getText();
	}

}
