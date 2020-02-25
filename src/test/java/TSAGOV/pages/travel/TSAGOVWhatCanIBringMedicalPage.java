package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWhatCanIBringMedicalPage extends TSAGOVWhatCanIBringPage{

	@FindBy (xpath = "//*[contains(text(),'Medical')]")
	private WebElementFacade medicalText;
	
public boolean verifyMedicalText() {
		
		return medicalText.isPresent();
	}
}
