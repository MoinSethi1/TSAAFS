package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVSecurityScreeningPage extends TSAGOVTravelPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade securityScreeningText;
	
	@FindBy (xpath = "//*[@id=\"sidenav_sublist_1\"]/li[2]/a")
	private WebElementFacade identificationLink;
	
	@FindBy (xpath = "//*[@id=\"sidenav_sublist_1\"]/li[3]/a")
	private WebElementFacade liquidsRuleLink;
	
	@FindBy (xpath ="//*[@id=\"sidenav_sublist_1\"]/li[4]/a")
	private WebElementFacade emergingTechnologyLink;
	
	@FindBy (xpath ="//*[@id=\"sidenav_sublist_1\"]/li[5]/a")
	private WebElementFacade realIDLink;
	
	public boolean verifySecurityScreeningText() {
		return securityScreeningText.isPresent();
	}
	
	public TSAGOVIdentificationPage navigateToIdentification() {
		identificationLink.click();
		return this.switchToPage(TSAGOVIdentificationPage.class);
	}
		
		public TSAGOVLiquidsRulePage navigateToLiquidsRule() {
			liquidsRuleLink.click();
			return this.switchToPage(TSAGOVLiquidsRulePage.class);
		}
		
		public TSAGOVEmergingTechnologyPage naviagteToEmergingTechnology() {
			emergingTechnologyLink.click();
			return this.switchToPage(TSAGOVEmergingTechnologyPage.class);
			
		}
		
		public TSAGOVRealIDPage navigateToRealID() {
			realIDLink.click();
			return this.switchToPage(TSAGOVRealIDPage.class);
		}
	}

