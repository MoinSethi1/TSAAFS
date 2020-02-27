package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVPASSPage extends TSAGOVIndustryPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")
	private WebElementFacade passText;
	
	
	public String verifyPassText() {
		return passText.getText();
	}
	
}
