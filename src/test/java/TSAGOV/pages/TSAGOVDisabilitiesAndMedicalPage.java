package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVDisabilitiesAndMedicalPage extends TSAGOVSpecialProceduresPage{

	@FindBy (xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade disabilitiesAndMedicalText;
	
	
	public boolean verifyDisabilitiesAndMedcalText() {
		return disabilitiesAndMedicalText.isPresent();
		
	}
	
}
