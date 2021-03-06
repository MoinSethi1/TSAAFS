package TSAGOV.pages.travel;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWhatCanIBringMiscellaneousPage extends TSAGOVHomePage{

	
	@FindBy (xpath = "//*[contains(text(),'Miscellaneous')]")
	private WebElementFacade miscellaneousText;
	
	
public boolean verifyMiscellaneousText() {
		
		return miscellaneousText.isPresent();
	}
}
