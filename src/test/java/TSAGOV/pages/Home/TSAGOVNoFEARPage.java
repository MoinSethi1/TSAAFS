package TSAGOV.pages.Home;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVNoFEARPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade noFEARText;

	public String verifyNoFearText() {
		return noFEARText.getText();
	}

}
