package TSAGOV.steps;

import java.util.concurrent.TimeUnit;

import TSAGOV.pages.TSAGOVAirportAirlinesPage;
import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.TSAGOVFAQPage;
import TSAGOV.pages.TSAGOVMemberPage;
import TSAGOV.pages.TSAGOVSchedulePage;
import TSAGOV.pages.TSAGOVTSAPrePage;

import TSAGOV.pages.TSAGOVTravelPage;
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


}
