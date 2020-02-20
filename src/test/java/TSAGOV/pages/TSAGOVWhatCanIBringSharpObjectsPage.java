package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWhatCanIBringSharpObjectsPage extends TSAGOVWhatCanIBringPage {

	
	@FindBy (xpath = "//*[contains(text(),'Sharp objects')]")
	private WebElementFacade sharpObjectsText;
	
public boolean verifySharpObjectsText() {
		
		return sharpObjectsText.isPresent();
	}
}
