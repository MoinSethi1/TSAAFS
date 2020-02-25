package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelFAQPage extends TSAGOVTravelPage{
	
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade travelFAQText;
	
	public boolean verifyTravelFAQText() {
		return travelFAQText.isPresent();
	}
	

}
