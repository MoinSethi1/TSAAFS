package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWhatCanIBringFoodPage extends TSAGOVWhatCanIBringPage {

	
	@FindBy (xpath = "//*[contains(text(),'Food')]")
	private WebElementFacade foodText;
	
public boolean verifyFoodText() {
		
		return foodText.isPresent();
	}
}
