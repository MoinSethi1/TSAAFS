package TSAGOV.pages.contact;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVLostAndFoundPage extends TSAGOVContactPage {
	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade lostAndFoundText;

	public String verifyLostAndFoundText() {
		return lostAndFoundText.getText();
	}

}
