package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTrustedTravelerProgramPage extends TSAGOVTSAPrePage {

	
	@FindBy (xpath = "/html/body/go-app/header/go-toolbar/div[2]/div/div/div[2]/a")
	private WebElementFacade trustedTravelerText;
	
	
	public boolean verifyTrustedTravelerText() {
		return trustedTravelerText.isPresent();
	}
}
