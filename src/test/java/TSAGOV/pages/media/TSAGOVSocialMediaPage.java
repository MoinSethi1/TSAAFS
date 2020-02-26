package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVSocialMediaPage extends TSAGOVMediaPage {

	
	@FindBy (css ="#block-tsa-gov-pagetitle > h1")
	private WebElementFacade socialMediaText;
	
	public boolean verifySocialMediaText() {
	return socialMediaText.isPresent();
	}
	
}
