package TSAGOV.pages.about;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVMissionPage extends TSAGOVAboutPage{

	
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")
	private WebElementFacade missionText;
	
	
	public String verifyMissionText() {
		return missionText.getText();
	}
}
