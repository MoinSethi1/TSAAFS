package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVSpecialProceduresPage extends TSAGOVTravelPage {
	
	@FindBy (xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade specialProcedureText;
	
	@FindBy (xpath = "//*[@id=\"sidenav_sublist_2\"]/li[1]/a")
	private WebElementFacade disabilitiesAndMedicalLink;
	
	@FindBy (xpath = "//*[@id='sidenav_sublist_2']/li[2]/a")
	private WebElementFacade militaryLink;
	
	@FindBy (xpath = "//*[@id=\"sidenav_sublist_2\"]/li[3]/a")
	private WebElementFacade childrenLink;
	
	@FindBy (xpath ="//*[@id=\"sidenav_sublist_2\"]/li[4]/a")
	private WebElementFacade seniorLink;
	
	@FindBy (xpath = "//*[@id=\"sidenav_sublist_2\"]/li[5]/a")
	private WebElementFacade lawEnforcementLink;
	
	@FindBy (xpath = "//*[@id=\"sidenav_sublist_2\"]/li[6]/a")
	private WebElementFacade culturalLink;
	

	public boolean verifySpecialProcedureText() {
		return specialProcedureText.isPresent();
		
	}
	
	public TSAGOVDisabilitiesAndMedicalPage navigateToDisabilitiesAndMedical() {
		disabilitiesAndMedicalLink.click();
		return this.switchToPage(TSAGOVDisabilitiesAndMedicalPage.class);
	}
	
	public TSAGOVMilitaryPage navigateToMilitary() {
		militaryLink.click();
		return this.switchToPage(TSAGOVMilitaryPage.class);
	}
	
	public TSAGOVChildrenPage navigateToChildren() {
		childrenLink.click();
		return this.switchToPage(TSAGOVChildrenPage.class);
	}
	
	public TSAGOVSeniorPage navigateToSenior() {
		seniorLink.click();
		return this.switchToPage(TSAGOVSeniorPage.class);
		
		
	}
	
	public TSAGOVLawEnforcementPage navigateToLawEnforcement() {
		lawEnforcementLink.click();
		return this.switchToPage(TSAGOVLawEnforcementPage.class);
	
	}
	
	public TSAGOVCulturalPage navigateToCultural() {
		culturalLink.click();
		return this.switchToPage(TSAGOVCulturalPage.class);
		
	}
}
