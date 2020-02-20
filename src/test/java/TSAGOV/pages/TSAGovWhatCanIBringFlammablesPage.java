package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGovWhatCanIBringFlammablesPage extends TSAGOVWhatCanIBringPage{

	@FindBy (xpath = "//*[contains(text(),'Flammables')]")
	private WebElementFacade flammablesText;
	
	
public boolean verifyFlammablesText() {
		
		return flammablesText.isPresent();
	}
}
