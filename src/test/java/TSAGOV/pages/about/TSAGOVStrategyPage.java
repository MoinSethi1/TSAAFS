package TSAGOV.pages.about;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVStrategyPage extends TSAGOVAboutPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade strategyText;
	
	public String verifyStrategyText() {
		return strategyText.getText();
	}
	
}
