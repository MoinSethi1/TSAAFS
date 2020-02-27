package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVReimbursableScreeningPage extends TSAGOVIndustryPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")
	private WebElementFacade reimbursableScreeningText;
	
	public String verifyReimbursableScreeningText() {
		return reimbursableScreeningText.getText();
	}
}
