package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelTipsPage extends TSAGOVTravelPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	
	private WebElementFacade travelTipsText;
	
	@FindBy (xpath ="//*[@id=\"sidenav_sublist_5\"]/li/a")
	private WebElementFacade travelChecklistLink;
	
	public boolean verifyTravelTipsText() {
		return travelTipsText.isPresent();
	}
	
	public TSAGOVTravelChecklistPage navigateToTravelChecklist() {
		travelChecklistLink.click();
		return this.switchToPage(TSAGOVTravelChecklistPage.class);
	}
	
}
