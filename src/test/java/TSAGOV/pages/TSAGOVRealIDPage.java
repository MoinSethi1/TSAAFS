package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVRealIDPage extends TSAGOVSecurityScreeningPage {

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade realIDText;
	
	
	public boolean verifyRealIDText() {
		return realIDText.isPresent();
	}
	
}