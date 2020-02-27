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
import TSAGOV.pages.industry.TSAGOVHAZMATPage;
import TSAGOV.pages.industry.TSAGOVIStepPage;
import TSAGOV.pages.industry.TSAGOVIndustryPage;
import TSAGOV.pages.industry.TSAGOVInnovationTaskForcePage;
import TSAGOV.pages.industry.TSAGOVPASSPage;
import TSAGOV.pages.industry.TSAGOVReimbursableScreeningPage;
import TSAGOV.pages.industry.TSAGOVSSIPage;
import TSAGOV.pages.industry.TSAGOVSTSACPage;
import TSAGOV.pages.industry.TSAGOVScreeningPartnershipPage;
import TSAGOV.pages.industry.TSAGOVSecurityFeesPage;
import TSAGOV.pages.industry.TSAGOVSurfaceTransportationPage;
import TSAGOV.pages.industry.TSAGOVTWICPage;
import TSAGOV.pages.industry.TSAGOVTrainingPage;
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
	TSAGOVHAZMATPage tSAGOVHAZMATPage;
	TSAGOVIStepPage tSAGOVIStepPage;
	TSAGOVInnovationTaskForcePage tSAGOVInnovationTaskForcePage;
	TSAGOVPASSPage tSAGOVPASSPage;
	TSAGOVReimbursableScreeningPage tSAGOVReimbursableScreeningPage;
	TSAGOVScreeningPartnershipPage tSAGOVScreeningPartnershipPage;
	TSAGOVSecurityFeesPage tSAGOVSecurityFeesPage;
	TSAGOVSSIPage tSAGOVSSIPage;
	TSAGOVSTSACPage tSAGOVSTSACPage;
	TSAGOVSurfaceTransportationPage tSAGOVSurfaceTransportationPage;
	TSAGOVTrainingPage tSAGOVTrainingPage;
	TSAGOVTWICPage tSAGOVTWICPage;
	
	
	
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

@Step
public TSAGOVHAZMATPage navigateToHAZMAT() {
	return tSAGOVCargoProgramsPage.navigateToHAZMAT();
	
}

@Step
public TSAGOVIStepPage navigateToIStep() {
	return tSAGOVCargoProgramsPage.navigateToIStep();
}


@Step
public TSAGOVInnovationTaskForcePage navigateToInnovationTaskForce() {
	return tSAGOVCargoProgramsPage.navigateToInnovationTaskForce();
}

@Step
public TSAGOVPASSPage navigateToPASS() {
	return tSAGOVCargoProgramsPage.navigateToPASS();

}

@Step
public TSAGOVReimbursableScreeningPage navigateToReimbursableScreening() {
	return tSAGOVCargoProgramsPage.navigateToReimbursableScreening();
}

@Step
public TSAGOVScreeningPartnershipPage navigateToScreeningPartnership() {
	return tSAGOVCargoProgramsPage.navigateToScreeningPartnership();
	
}

@Step
public TSAGOVSecurityFeesPage navigateToSecurityFees() {
	return tSAGOVCargoProgramsPage.navigateToSecurityFees();
}

@Step
public TSAGOVSSIPage navigateToSSI() {
	return tSAGOVCargoProgramsPage.navigateToSSI();
}

@Step
public TSAGOVSTSACPage navigateToSTSAC() {
	return tSAGOVCargoProgramsPage.navigateToSTSAC();
}

public TSAGOVSurfaceTransportationPage navigateToSurfaceTransportation() {
	return tSAGOVCargoProgramsPage.navigateToSurfaceTransportation();
}

@Step
public TSAGOVTrainingPage navigateToTraining() {
	return tSAGOVCargoProgramsPage.navigateToTraining();
	
}

@Step
public TSAGOVTWICPage navigateToTWIC() {
	return tSAGOVCargoProgramsPage.navigateToTWIC();
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

/***********************************************
 * Steps for TSAGOVHAZMATPage
 ***********************************************/

@Step
public String verifyHAZMATText() {
	return tSAGOVHAZMATPage.verifyHAZMATText();
}

/***********************************************
 * Steps for TSAGOVIStepPage
 ***********************************************/
@Step
public String verifyIStepText() {
	return tSAGOVIStepPage.verifyIStepText();
}

/***********************************************
 * Steps for TSAGOVInnovationTaskForcePage
 ***********************************************/
@Step
public String verifyInnovationTaskForceText() {
	return	tSAGOVInnovationTaskForcePage.verifyInnovationTaskForceText();
	}

/***********************************************
 * Steps for TSAGOVPASSPage
 ***********************************************/

@Step
public String verifyPassText() {
	return tSAGOVPASSPage.verifyPassText();
}

/***********************************************
 * Steps for TSAGOVReimbursableScreeningPage
 ***********************************************/

@Step
public String verifyReimbursableScreeningText() {
	return tSAGOVReimbursableScreeningPage.verifyReimbursableScreeningText();
}

/***********************************************
 * Steps for TSAGOVScreeningPartnershipPage
 ***********************************************/
@Step
public String verifyScreeningPartnershipText() {
	return  tSAGOVScreeningPartnershipPage.verifyScreeningPartnershipText();
}

/***********************************************
 * Steps for TSAGOVSecurityFeesPage
 ***********************************************/

@Step
public String verifySecurityFeesText() {
	return tSAGOVSecurityFeesPage.verifySecurityFeesText();
}

/***********************************************
 * Steps for TSAGOVSSIPage
 ***********************************************/

@Step public String verifySSIText() {
	return tSAGOVSSIPage.verifySSIText();
}


/***********************************************
 * Steps for TSAGOVSTSACPage
 ***********************************************/

@Step
public String verifySTSACText() {
	return tSAGOVSTSACPage.verifySTSACText();
}


/***********************************************
 * Steps for TSAGOVSurfaceTransportationPage
 ***********************************************/
@Step
public String verifySurfaceTransportationText() {
	return tSAGOVSurfaceTransportationPage.verifySurfaceTransportationText();
}


/***********************************************
 * Steps for TSAGOVTrainingPage
 ***********************************************/

@Step
public String verifyTrainingText() {
	return tSAGOVTrainingPage.verifyTrainingText();
	
}

/***********************************************
 * Steps for TSAGOVTWICPage
 ***********************************************/
@Step
public String verifyTWICText() {
	return tSAGOVTWICPage.verifyTWICText();
}

}
