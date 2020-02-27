package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTrainingPage extends TSAGOVIndustryPage{
	
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade trainingText;

public String verifyTrainingText() {
	return trainingText.getText();
	
}
}
