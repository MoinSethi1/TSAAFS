package TSAGOV.pages.Home;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVAToZPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade aTozText;

	public String aToZText() {
		return aTozText.getText();
	}
}
