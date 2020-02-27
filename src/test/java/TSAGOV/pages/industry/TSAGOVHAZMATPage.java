package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVHAZMATPage extends TSAGOVIndustryPage{

	
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade hAZMATText;
	
	public String verifyHAZMATText() {
		return hAZMATText.getText();
	}
}
