package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTravelTipsPage extends TSAGOVTravelPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	
	private WebElementFacade travelTipsText;
	
	@FindBy (xpath ="//*[@id=\"sidenav_sublist_5\"]/li/a")
	private WebElementFacade travelChecklistLink;
	
	@FindBy (css ="#block-travel-sidebar > nav.max-tablet-hidden > ul > li:nth-child(5) > div > button")
	private WebElementFacade travelTipsExpand;
	
	
	public boolean verifyTravelTipsText() {
		return travelTipsText.isPresent();
	}
	
	public TSAGOVTravelChecklistPage navigateToTravelChecklist() {
		travelChecklistLink.click();
		return this.switchToPage(TSAGOVTravelChecklistPage.class);
	}
	
	public void travelTipsExpand() {
		travelTipsExpand.click();
	}
}
