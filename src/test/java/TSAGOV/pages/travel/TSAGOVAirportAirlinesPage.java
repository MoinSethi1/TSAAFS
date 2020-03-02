package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVAirportAirlinesPage extends TSAGOVTSAPrecheckPage{

@FindBy (xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")	
private WebElementFacade airportsAirlinesText;

public boolean verifyAirportsAirlinesText() {
	
	return airportsAirlinesText.isPresent();
}


}
