package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVRealIDPage extends TSAGOVSecurityScreeningPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade realIDText;

	public String verifyRealIDText() {
		return realIDText.getText();
	}

}
