package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVEmergingTechnologyPage extends TSAGOVSecurityScreeningPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")
	private WebElementFacade emergingTechnologyText;

	public String verifyEmergingTechnologyText() {
		return emergingTechnologyText.getText();
	}

}
