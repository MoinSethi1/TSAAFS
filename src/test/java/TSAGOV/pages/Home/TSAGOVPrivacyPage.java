package TSAGOV.pages.Home;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVPrivacyPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")
	private WebElementFacade privacyText;

	public String verifyPrivacyText() {
		return privacyText.getText();
	}
}
