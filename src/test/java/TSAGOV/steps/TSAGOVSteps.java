package TSAGOV.steps;

import java.util.concurrent.TimeUnit;

import TSAGOV.pages.TSAGOVAirportAirlinesPage;
import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.TSAGOVChildrenPage;
import TSAGOV.pages.TSAGOVCivilRightsPage;
import TSAGOV.pages.TSAGOVClaimsPage;
import TSAGOV.pages.TSAGOVCulturalPage;
import TSAGOV.pages.TSAGOVDisabilitiesAndMedicalPage;
import TSAGOV.pages.TSAGOVEmergingTechnologyPage;
import TSAGOV.pages.TSAGOVFAQPage;
import TSAGOV.pages.TSAGOVIdentificationPage;
import TSAGOV.pages.TSAGOVLawEnforcementPage;
import TSAGOV.pages.TSAGOVLiquidsRulePage;
import TSAGOV.pages.TSAGOVMemberPage;
import TSAGOV.pages.TSAGOVMilitaryPage;
import TSAGOV.pages.TSAGOVPassengerSupportPage;
import TSAGOV.pages.TSAGOVRealIDPage;
import TSAGOV.pages.TSAGOVSchedulePage;
import TSAGOV.pages.TSAGOVSecurityScreeningPage;
import TSAGOV.pages.TSAGOVSeniorPage;
import TSAGOV.pages.TSAGOVSpecialProceduresPage;
import TSAGOV.pages.TSAGOVTSAPrePage;

import TSAGOV.pages.TSAGOVTravelPage;
import TSAGOV.pages.TSAGOVTravelRedressPage;
import TSAGOV.pages.TSAGOVTrustedTravelerProgramPage;
import TSAGOV.pages.TSAGOVWharCanIBringHouseholdToolsPage;
import TSAGOV.pages.TSAGOVWhatCanIBringAllItemsPage;
import TSAGOV.pages.TSAGOVWhatCanIBringFirearmsPage;
import TSAGOV.pages.TSAGOVWhatCanIBringFoodPage;
import TSAGOV.pages.TSAGOVWhatCanIBringMedicalPage;
import TSAGOV.pages.TSAGOVWhatCanIBringMiscellaneousPage;
import TSAGOV.pages.TSAGOVWhatCanIBringPage;
import TSAGOV.pages.TSAGOVWhatCanIBringSharpObjectsPage;
import TSAGOV.pages.TSAGOVWhatCanIBringSportingCampingPage;
import TSAGOV.pages.TSAGovWhatCanIBringFlammablesPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class TSAGOVSteps extends ScenarioSteps {

	TSAGOVBasePage tSAGOVBasePage;
	
	//TSAGOV.pages.
	TSAGOVWhatCanIBringPage tSAGOVWhatCanIBringPage;
	TSAGovWhatCanIBringFlammablesPage tSAGovWhatCanIBringFlammablesPage;
	TSAGOVWhatCanIBringMiscellaneousPage tSAGOVWhatCanIBringMiscellaneousPage;
	TSAGOVWhatCanIBringFirearmsPage  tSAGOVWhatCanIBringFirearmsPage;
	TSAGOVWhatCanIBringFoodPage tSAGOVWhatCanIBringFoodPage;
	TSAGOVWharCanIBringHouseholdToolsPage tSAGOVWharCanIBringHouseholdToolsPage;
	TSAGOVWhatCanIBringMedicalPage tSAGOVWhatCanIBringMedicalPage;
	TSAGOVWhatCanIBringSharpObjectsPage tSAGOVWhatCanIBringSharpObjectsPage;
	TSAGOVWhatCanIBringSportingCampingPage tSAGOVWhatCanIBringSportingCampingPage;
	TSAGOVTravelPage tSAGOVTravelPage;
	TSAGOVTSAPrePage tSAGovTsaPrePage;
	TSAGOVAirportAirlinesPage tSAGovAirportsAirlinesPage;
	TSAGOVSchedulePage tSAGOVSchedulePage;
	TSAGOVFAQPage tSAGOVFAQPage;
	TSAGOVTrustedTravelerProgramPage tSAGOVTrustedTravelerProgramPage;
	TSAGOVSpecialProceduresPage tSAGOVSpecialProceduresPage;
	TSAGOVDisabilitiesAndMedicalPage tSAGOVDisabilitiesAndMedicalPage;
	TSAGOVMilitaryPage tSAGOVMilitaryPage;
	TSAGOVChildrenPage tSAGOVChildrenPage;
	TSAGOVSeniorPage tSAGOVSeniorPage;
	TSAGOVLawEnforcementPage tSAGOVLawEnforcementPage;
	TSAGOVCulturalPage tSAGOVCulturalPage;
	TSAGOVPassengerSupportPage tSAGOVPassengerSupportPage;
	TSAGOVCivilRightsPage tSAGOVCivilRightsPage;
	TSAGOVTravelRedressPage tSAGOVTravelRedressPage;
	TSAGOVClaimsPage tSAGOVClaimsPage;
	TSAGOVSecurityScreeningPage tSAGOVSecurityScreeningPage;
	TSAGOVIdentificationPage tSAGOVIdentificationPage;
	TSAGOVLiquidsRulePage tSAGOVLiquidsRulePage;
	TSAGOVEmergingTechnologyPage  tSAGOVEmergingTechnologyPage;
	TSAGOVRealIDPage tSAGOVRealIDPage;
	
	
	
	
	/***********************************************
	 * Steps for TSAGOVBasePage
	 ***********************************************/
	
@Step
	public void navigateToTSAGOV() {
		tSAGOVBasePage.navigateToTSAGOV();
	}

@Step
	public boolean verifyMemberText() {
		
		return tSAGOVBasePage.verifyMemberText();
		}

@Step
	public void enterUsername(String username) {
		tSAGOVBasePage.enterUsername(username);
	}
	
@Step
	public void enterPassword(String password)  {
		tSAGOVBasePage.enterPassword(password);
		
	}

@Step
public TSAGOVMemberPage login() throws InterruptedException {
	
	return tSAGOVBasePage.login();
}

@Step
	public void navigateToWhatCanIBring() throws InterruptedException {
		 tSAGOVBasePage.navigateToWhatCanIBring();
}

@Step
public TSAGOVTravelPage navigateToTSATravel() {
	
	return tSAGOVBasePage.navigateToTSATravel();
			
	
}

@Step
public boolean verifyExpectedText(WebElementFacade expectedText) {
	return expectedText.isPresent();
}


@Step
public String actualUrl() {

	
	return (getDriver().getCurrentUrl());
	
}


@Step
public void waitForPageload() throws InterruptedException {
	
	getDriver().manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
}


/***********************************************
 * Steps for TSAGOVWhatCanIBringPage
 ***********************************************/

@Step
public boolean verifyWhatCanIBringText() {
	return tSAGOVWhatCanIBringPage.verifyWhatCanIBringText();

}

@Step
public TSAGOVWhatCanIBringAllItemsPage navigateToAll() {
	
	return tSAGOVWhatCanIBringPage.navigateToAll();
	
}

@Step
public TSAGovWhatCanIBringFlammablesPage navigateToFlammables() {
	
	return tSAGOVWhatCanIBringPage.navigateToFlammables();
	
}

@Step
public TSAGOVWhatCanIBringFirearmsPage navigateToFirearms() {
	
	return tSAGOVWhatCanIBringPage.navigateToFirearms();
		
}

@Step
public TSAGOVWhatCanIBringFoodPage navigateToFood() {
	
	return tSAGOVWhatCanIBringPage.navigateToFood();
}


	
@Step
public TSAGOVWharCanIBringHouseholdToolsPage navigateToHouseholdTools() {
	
	return tSAGOVWhatCanIBringPage.navigateToHouseholdTools();
		
}


@Step
public TSAGOVWhatCanIBringMedicalPage navigateToMedical() {
	
	return tSAGOVWhatCanIBringPage.navigateToMedical();
}


@Step
public TSAGOVWhatCanIBringSharpObjectsPage navigateToSharpObjects() {

return tSAGOVWhatCanIBringPage.navigateToSharpObjects();
}


@Step
public TSAGOVWhatCanIBringSportingCampingPage navigateToSportingCamping() {
	
	return tSAGOVWhatCanIBringPage.navigateToSportingCamping();
			
}

@Step
public TSAGOVWhatCanIBringMiscellaneousPage navigateToMiscellaneous() {
	
	return tSAGOVWhatCanIBringPage.navigateToMiscellaneous();
	
}

/***********************************************
 * Steps for TSAGOVWhatCanIBringPageFlammables
 ***********************************************/


@Step
public boolean verifyFlammablesText() {
	
	return tSAGovWhatCanIBringFlammablesPage.verifyFlammablesText();
}

/***********************************************
 * Steps for TSAGOVWhatCanIBringPageFirearms
 ***********************************************/

@Step
public boolean verifyFirearmsText() {
	
	return tSAGOVWhatCanIBringFirearmsPage.verifyFirearmsText();
}


/***********************************************
 * Steps for TSAGOVWhatCanIBringPageFood
 ***********************************************/

@Step
public boolean verifyFoodText() {
	
	return tSAGOVWhatCanIBringFoodPage.verifyFoodText();
}


/**************************************************
 * Steps for TSAGOVWhatCanIBringPageHouseholdAndTools
 **************************************************/

@Step
public boolean verifyHouseholdAndToolsText() {
	
	return tSAGOVWharCanIBringHouseholdToolsPage.verifyHouseholdAndToolsText();
}


/**************************************************
 * Steps for TSAGOVWhatCanIBringPageMedical
 **************************************************/


@Step
public boolean verifyMedicalText() {
	
	return tSAGOVWhatCanIBringMedicalPage.verifyMedicalText();
}

/**************************************************
 * Steps for TSAGOVWhatCanIBringPageSharpObjects
 **************************************************/


@Step
public boolean verifySharpObjectsText() {
	
	return tSAGOVWhatCanIBringSharpObjectsPage.verifySharpObjectsText();
}


/***********************************************
 * Steps for TSAGOVWhatCanIBringPageSportingCamping
 ***********************************************/

@Step
public boolean verifySportingCampingText() {
	
	return tSAGOVWhatCanIBringSportingCampingPage.verifySportingCampingText();
}

/***********************************************
 * Steps for TSAGOVWhatCanIBringPageMiscellaneous
 ***********************************************/

@Step
public boolean verifyMiscellaneousText() {
	
	return tSAGOVWhatCanIBringMiscellaneousPage.verifyMiscellaneousText();
}


/***********************************************
 * Steps for TSAGOVTravelPage
 ***********************************************/
@Step

public TSAGOVTSAPrePage navigateToTSAPre() {

	return tSAGOVTravelPage.navigateToTSAPre();
	}

@Step

public boolean verifyTravelImage() {
	return tSAGOVTravelPage.verifyTravelImage();
}

@Step
public TSAGOVSpecialProceduresPage navigateToSpecialProcedures() {
	
	return tSAGOVTravelPage.navigateToSpecialProcedures();
}

public TSAGOVPassengerSupportPage navigateToPassengerSupport() {
	return tSAGOVTravelPage.navigateToPassengerSupport();
}
@Step

public TSAGOVSecurityScreeningPage navigateToSecurityScreening() {
	return tSAGOVTravelPage.navigateToSecurityScreening();
}

/***********************************************
 * Steps for TSAGOVTSAPrePage
 ***********************************************/

@Step
public boolean verifyTsaPreImage() {
	return tSAGovTsaPrePage.verifyTsaPreImage();
	
	}

@Step
public TSAGOVAirportAirlinesPage navigateToAirportsAirlines() {
	 return tSAGovTsaPrePage.navigateToAirportsAirlines();
	
}

@Step

public TSAGOVSchedulePage navigateToScedule() {
	return tSAGovTsaPrePage.navigateToScedule();
		
}

@Step
public TSAGOVFAQPage navigateToFaq() {
	
	return tSAGovTsaPrePage.navigateToFaq();
}

@Step
public TSAGOVTrustedTravelerProgramPage navigateToTrustedTravelerPrograms() {
	return tSAGovTsaPrePage.navigateToTrustedTravelerPrograms();
}

/***********************************************
 * Steps for TSAGOVAirportsAirlinesPage
 ***********************************************/

@Step
public boolean verifyAirportsAirlinesText() {
	
	return tSAGovAirportsAirlinesPage.verifyAirportsAirlinesText();
}

/***********************************************
 * Steps for TSAGOVASchedulePage
 ***********************************************/


@Step
public boolean verifyScheduleText() {
	return tSAGOVSchedulePage.verifyScheduleText();
	
}


/***********************************************
 * Steps for TSAGOVAFAQPage
 ***********************************************/

@Step
public boolean verifyFaqText() {
	return tSAGOVFAQPage.verifyFaqText();
}


/***********************************************
 * Steps for TSAGOVATrustedTravelerProgramsPage
 ***********************************************/

@Step

public boolean verifyTrustedTravelerText() {
	return tSAGOVTrustedTravelerProgramPage.verifyTrustedTravelerText();
}

/***********************************************
 * Steps for TSAGOVTSpecialProcedurePage
 ***********************************************/

public boolean verifySpecialProcedureText() {
	return tSAGOVSpecialProceduresPage.verifySpecialProcedureText();
	
}

@Step
public TSAGOVDisabilitiesAndMedicalPage navigateToDisabilitiesAndMedical() {
	
	return tSAGOVSpecialProceduresPage.navigateToDisabilitiesAndMedical();
}

@Step
public TSAGOVMilitaryPage navigateToMilitary() {
	return tSAGOVSpecialProceduresPage.navigateToMilitary();
}

@Step
public TSAGOVChildrenPage navigateToChildren() {
	return tSAGOVSpecialProceduresPage.navigateToChildren();
}

@Step
public TSAGOVSeniorPage navigateToSenior() {
	return tSAGOVSpecialProceduresPage.navigateToSenior();
}

@Step
public TSAGOVLawEnforcementPage navigateToLawEnforcement() {
	return tSAGOVSpecialProceduresPage.navigateToLawEnforcement();

}

@Step
public TSAGOVCulturalPage navigateToCultural() {
	return tSAGOVSpecialProceduresPage.navigateToCultural();
	
}

/***********************************************
 * Steps for TSAGOVTDisabilitiesAndMediaclPage
 ***********************************************/
@Step
public boolean verifyDisabilitiesAndMedcalText() {
	return tSAGOVDisabilitiesAndMedicalPage.verifyDisabilitiesAndMedcalText();
	
}


/***********************************************
 * Steps for TSAGOVTMilitaryPage
 ***********************************************/
@Step
public boolean verifyMilitaryText() {
	return tSAGOVMilitaryPage.verifyMilitaryText();
}

/***********************************************
 * Steps for TSAGOVTChildrenPage
 ***********************************************/

@Step
public boolean verifyChildrenText() {
	return tSAGOVChildrenPage.verifyChildrenText();
}

/***********************************************
 * Steps for TSAGOVTSeniorPage
 ***********************************************/

@Step
public boolean verifySeniorText() {
	return tSAGOVSeniorPage.verifySeniorText();
}

/***********************************************
 * Steps for TSAGOVLawEnforcementPage
 ***********************************************/

@Step
public boolean verifyLawEnforcemenText() {
	return tSAGOVLawEnforcementPage.verifyLawEnforcemenText();
	
}

/***********************************************
 * Steps for TSAGOVCulturalPage
 ***********************************************/

@Step

public boolean verifyCulturalText() {
	return tSAGOVCulturalPage.verifyCulturalText();
}

/***********************************************
 * Steps for TSAGOVPassengerSupportPage
 ***********************************************/

@Step
public boolean verifyPassengerSupportText() {
	return tSAGOVPassengerSupportPage.verifyPassengerSupportText();
}

@Step
public TSAGOVCivilRightsPage navigateToCivilRights() {
		return tSAGOVPassengerSupportPage.navigateToCivilRights();
}

@Step
public TSAGOVTravelRedressPage navigateToTravelRedress() {
	return tSAGOVPassengerSupportPage.navigateToTravelRedress();
}

@Step
public TSAGOVClaimsPage navigateToClaims() {
	return tSAGOVPassengerSupportPage.navigateToClaims();
}

/***********************************************
 * Steps for TSAGOVCivilRightsPage
 ***********************************************/

@Step
public boolean verifyCivilRightsText() {
	return tSAGOVCivilRightsPage.verifyCivilRightsText();
}


/***********************************************
 * Steps for TSAGOVTravelRedressPage
 ***********************************************/


@Step
public boolean verifyTravelRedressText() {
	return tSAGOVTravelRedressPage.verifyTravelRedressText();
}

/***********************************************
 * Steps for TSAGOVClaimsPage
 ***********************************************/

@Step
public boolean verifyClaimsText() {
	return tSAGOVClaimsPage.verifyClaimsText();
}

/***********************************************
 * Steps for TSAGOVSecurityScreeningPage
 ***********************************************/
@Step
public boolean verifySecurityScreeningText() {
	return tSAGOVSecurityScreeningPage.verifySecurityScreeningText();
}

@Step
public TSAGOVIdentificationPage navigateToIdentification() {
	return tSAGOVSecurityScreeningPage.navigateToIdentification();
}

@Step

public TSAGOVLiquidsRulePage navigateToLiquidsRule() {
	return tSAGOVSecurityScreeningPage.navigateToLiquidsRule();
}


@Step
public TSAGOVEmergingTechnologyPage naviagteToEmergingTechnology() {
	return tSAGOVSecurityScreeningPage.naviagteToEmergingTechnology();
}

@Step 
public TSAGOVRealIDPage navigateToRealID() {
	return tSAGOVSecurityScreeningPage.navigateToRealID();
}

/***********************************************
 * Steps for TSAGOVIdentificationPage
 ***********************************************/

@Step
public boolean verifyIdentificationText() {
	return tSAGOVIdentificationPage.verifyIdentificationText();
}

/***********************************************
 * Steps for TSAGOVLiquidsRulePage
 ***********************************************/

@Step
public boolean verifyLiquidsRuleText() {
	return tSAGOVLiquidsRulePage.verifyLiquidsRuleText();
}

/***********************************************
 * Steps for TSAGOVEmergingTechnologyPage
 ***********************************************/

@Step

public boolean verifyEmergingTechnologyText() {
		return tSAGOVEmergingTechnologyPage.verifyEmergingTechnologyText();
}

/***********************************************
 * Steps for TSAGOVRealIDPage
 ***********************************************/

@Step
public boolean verifyRealIDText() {
	return tSAGOVRealIDPage.verifyRealIDText();
}

}
