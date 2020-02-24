package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVPassengerSupportPage extends TSAGOVTravelPage {

	
	@FindBy (xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade passengerSupportText;
	
	
@FindBy (xpath = "//*[@id=\"sidenav_sublist_4\"]/li[1]/a")
private WebElementFacade civilRightsLink;

@FindBy (xpath ="//*[@id=\"sidenav_sublist_4\"]/li[2]/a")
private WebElementFacade travelRedressLink;


@FindBy (xpath ="//*[@id=\"sidenav_sublist_4\"]/li[3]/a")
private WebElementFacade claimsLink;

	
	public boolean verifyPassengerSupportText() {
		return passengerSupportText.isPresent();
	}
	
	public TSAGOVCivilRightsPage navigateToCivilRights() {
		civilRightsLink.click();
		return this.switchToPage(TSAGOVCivilRightsPage.class);
	}
	
	public TSAGOVTravelRedressPage navigateToTravelRedress() {
		travelRedressLink.click();
		return this.switchToPage(TSAGOVTravelRedressPage.class);
	}
	
	public TSAGOVClaimsPage navigateToClaims() {
		claimsLink.click();
		return this.switchToPage(TSAGOVClaimsPage.class);
	}
}
