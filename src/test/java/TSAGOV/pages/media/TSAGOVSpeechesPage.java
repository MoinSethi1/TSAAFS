package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVSpeechesPage extends TSAGOVMediaPage {

	
	@FindBy (css ="#block-tsa-gov-pagetitle > h1")
	private WebElementFacade speechesText;
	
	
	public boolean verifySpeechesText() {
		return speechesText.isPresent();
	}
	
}
