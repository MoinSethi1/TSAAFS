package TSAGOV.pages.about;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVOrganizationPage extends TSAGOVAboutPage {

	
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade organizationText;
	
	
	public String verifyOrganizationText() {
		return organizationText.getText();
			}
	
}
