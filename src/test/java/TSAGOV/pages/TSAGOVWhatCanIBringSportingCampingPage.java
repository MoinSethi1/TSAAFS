package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWhatCanIBringSportingCampingPage extends TSAGOVWhatCanIBringPage{

	
	@FindBy (xpath = "//*[contains(text(),'Sporting and camping')]")
	private WebElementFacade sportingAndCampingText;
	
public boolean verifySportingCampingText() {
		
		return sportingAndCampingText.isPresent();
	}
}
