package TSAGOV.steps;

import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.industry.TSAGOVCargoProgramsPage;
import TSAGOV.pages.industry.TSAGOVIndustryPage;
import net.thucydides.core.annotations.Step;

public class TSAGOVIndustrySteps {

	TSAGOVBasePage tSAGOVBasePage;
	TSAGOVIndustryPage tSAGOVIndustryPage;
	TSAGOVCargoProgramsPage tSAGOVCargoProgramsPage;
	
	/***********************************************
	 * Steps for TSAGOVBasePage
	 ***********************************************/
	
@Step
	public void navigateToTSAGOV() {
		tSAGOVBasePage.navigateToTSAGOV();
	}
	
@Step
public TSAGOVIndustryPage navigateToIndustry() {
		return tSAGOVBasePage.navigateToIndustry();
}

@Step
public String actualUrl() {
	return tSAGOVBasePage.actualUrl();
	}



/***********************************************
 * Steps for TSAGOVIndustryPage
 ***********************************************/
@Step
public boolean verifyIndustryText() {
	return tSAGOVIndustryPage.verifyIndustryText();
}

/***********************************************
 * Steps for TSAGOVCargoProgramsPage
 ***********************************************/
@Step
public boolean verifyCargoProgramsTxet() {
	return tSAGOVCargoProgramsPage.verifyCargoProgramsTxet();
}




}
