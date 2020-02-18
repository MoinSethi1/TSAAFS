package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelPage extends TSAGOVBasePage {

	TSAGOVTravelPage tSAGOVTravelPage;
	
	@FindBy (xpath ="//*[@href='/precheck']")
	private WebElementFacade travelLink;
	
	public TSAGOVTSAPrePage navigateToTSAPre() {
		return tSAGOVTravelPage.navigateToTSAPre();
	}
	
}
