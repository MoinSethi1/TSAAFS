package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWharCanIBringHouseholdToolsPage extends TSAGOVWhatCanIBringPage {

	
	@FindBy (xpath = "//*[contains(text(),'Household and tools')]")
	private WebElementFacade householdAndToolsText;
	
public boolean verifyHouseholdAndToolsText() {
		
		return householdAndToolsText.isPresent();
	}
	
}
