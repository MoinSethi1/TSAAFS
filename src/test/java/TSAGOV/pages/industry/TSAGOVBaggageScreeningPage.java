package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVBaggageScreeningPage extends TSAGOVIndustryPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade baggageScreeningText;
		
	public String verifybaggageScreeningText() {
		return baggageScreeningText.getText();
	}
	
	
}
