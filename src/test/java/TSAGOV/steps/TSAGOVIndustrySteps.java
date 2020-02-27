package TSAGOV.steps;

import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.industry.TSAGOVASACPage;
import TSAGOV.pages.industry.TSAGOVBaggageScreeningPage;
import TSAGOV.pages.industry.TSAGOVBusinessPage;
import TSAGOV.pages.industry.TSAGOVCapabilityAcceptanceProcessPage;
import TSAGOV.pages.industry.TSAGOVCargoProgramsPage;
import TSAGOV.pages.industry.TSAGOVCyberSecurityToolkitPage;
import TSAGOV.pages.industry.TSAGOVFirstObserverPlusPage;
import TSAGOV.pages.industry.TSAGOVGeneralAviationPage;
import TSAGOV.pages.industry.TSAGOVIndustryPage;
import net.thucydides.core.annotations.Step;


public class TSAGOVIndustrySteps {

	TSAGOVBasePage tSAGOVBasePage;
	TSAGOVIndustryPage tSAGOVIndustryPage;
	TSAGOVCargoProgramsPage tSAGOVCargoProgramsPage;
	TSAGOVASACPage tSAGOVASACPage;
	TSAGOVBaggageScreeningPage tSAGOVBaggageScreeningPage;
	TSAGOVBusinessPage tSAGOVBusinessPage;
	TSAGOVCapabilityAcceptanceProcessPage tSAGOVCapabilityAcceptanceProcessPage;
	TSAGOVCyberSecurityToolkitPage tSAGOVCyberSecurityToolkitPage;
	TSAGOVFirstObserverPlusPage tSAGOVFirstObserverPlusPage;
	TSAGOVGeneralAviationPage tSAGOVGeneralAviationPage;
	
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
public String verifyIndustryText() {
	return tSAGOVIndustryPage.verifyIndustryText();
}

@Step
public TSAGOVCargoProgramsPage navigateToCargoPrograms() {
	return tSAGOVIndustryPage.navigateToCargoPrograms();
}

/***********************************************
 * Steps for TSAGOVCargoProgramsPage
 ***********************************************/
@Step
public String verifyCargoProgramsTxet() {
	return tSAGOVCargoProgramsPage.verifyCargoProgramsTxet();
}

@Step
public TSAGOVASACPage navigateToASAC() {
	return tSAGOVCargoProgramsPage.navigateToASAC();
}

@Step
public TSAGOVBaggageScreeningPage navigateToBaggageScreening() {
	return tSAGOVCargoProgramsPage.navigateToBaggageScreening();
}

@Step
public TSAGOVBusinessPage navigateToBusiness() {
	return tSAGOVCargoProgramsPage.navigateToBusiness();
}

@Step
public TSAGOVCapabilityAcceptanceProcessPage navigateToCapabilityAcceptanceProcessLink() {
	return tSAGOVCargoProgramsPage.navigateToCapabilityAcceptanceProcessLink();
}

@Step
public TSAGOVCyberSecurityToolkitPage nvigateToCyberSecurityToolkit() {
	return tSAGOVCargoProgramsPage.nvigateToCyberSecurityToolkit();
}

@Step
public TSAGOVFirstObserverPlusPage navigateToFirstObserverPlus(){
	return tSAGOVCargoProgramsPage.navigateToFirstObserverPlus();
}

@Step
public TSAGOVGeneralAviationPage navigateToGeneralAviation() {
	return tSAGOVCargoProgramsPage.navigateToGeneralAviation();
}

/***********************************************
 * Steps for TSAGOVASACPage
 ***********************************************/
@Step
public String verifyaSACText() {
	return tSAGOVASACPage.verifyaSACText();
}

/***********************************************
 * Steps for TSAGOVBaggageScreeningPage
 ***********************************************/
@Step
public String verifybaggageScreeningText() {
	return tSAGOVBaggageScreeningPage.verifybaggageScreeningText();
}

/***********************************************
 * Steps for TSAGOVBusinessPage
 ***********************************************/
@Step
public String verifyBusinessText() {
	return tSAGOVBusinessPage.verifyBusinessText();
}

/***********************************************
 * Steps for TSAGOVCapabilityAcceptanceProcessPage
 ***********************************************/
@Step
public String verifyCapabilityAcceptanceProcessText() {
	return tSAGOVCapabilityAcceptanceProcessPage.verifyCapabilityAcceptanceProcessText();
}

/***********************************************
 * Steps for TSAGOVCyberSecurityToolkitPage
 ***********************************************/
@Step
public String verifyCyberSecurityToolkitText() {
	return tSAGOVCyberSecurityToolkitPage.verifyCyberSecurityToolkitText();
}
/***********************************************
 * Steps for TSAGOVFirstObserverPlusPage
 ***********************************************/
@Step
public String verifyFirstObserverPlusText() {
	return tSAGOVFirstObserverPlusPage.verifyFirstObserverPlusText();
}

/***********************************************
 * Steps for TSAGOVGeneralAviationPage
 ***********************************************/
@Step
public String verifyGeneralAviationText() {
	return tSAGOVGeneralAviationPage.verifyGeneralAviationText();
}

}
