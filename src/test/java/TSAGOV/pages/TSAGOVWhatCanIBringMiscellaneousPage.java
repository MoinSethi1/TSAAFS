package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWhatCanIBringMiscellaneousPage extends TSAGOVBasePage{

	
	@FindBy (xpath = "//*[contains(text(),'Miscellaneous')]")
	private WebElementFacade miscellaneousText;
	
	
public boolean verifyMiscellaneousText() {
		
		return miscellaneousText.isPresent();
	}
}
