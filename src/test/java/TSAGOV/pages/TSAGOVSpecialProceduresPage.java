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
}
