package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWhatCanIBringFirearmsPage extends TSAGOVWhatCanIBringPage{

	
	@FindBy (xpath = "//*[contains(text(),'Firearms')]")
	private WebElementFacade firearmsText;
	
	
public boolean verifyFirearmsText() {
		
		return firearmsText.isPresent();
	}
}
