package TSAGOV.steps;

import java.util.concurrent.TimeUnit;
import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.TSAGOVMemberPage;
import TSAGOV.pages.TSAGOVTSAPrePage;
import TSAGOV.pages.TSAGOVTravelPage;
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
	TSAGOVTravelPage tSAGOVTravelPage;
	
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
public boolean verifyFlammablesText() {
	
	return tSAGOVWhatCanIBringPage.verifyFlammablesText();
}

@Step
public TSAGOVWhatCanIBringFirearmsPage navigateToFirearms() {
	
	return tSAGOVWhatCanIBringPage.navigateToFirearms();
		
}

@Step
public boolean verifyFirearmsText() {
	
	return tSAGOVWhatCanIBringPage.verifyFirearmsText();
}

@Step
public TSAGOVWhatCanIBringFoodPage navigateToFood() {
	
	return tSAGOVWhatCanIBringPage.navigateToFood();
}

@Step
public boolean verifyFoodText() {
	
	return tSAGOVWhatCanIBringPage.verifyFoodText();
}
	
@Step
public TSAGOVWharCanIBringHouseholdToolsPage navigateToHouseholdTools() {
	
	return tSAGOVWhatCanIBringPage.navigateToHouseholdTools();
		
}

@Step
public boolean verifyHouseholdAndToolsText() {
	
	return tSAGOVWhatCanIBringPage.verifyHouseholdAndToolsText();
}

@Step
public TSAGOVWhatCanIBringMedicalPage navigateToMedical() {
	
	return tSAGOVWhatCanIBringPage.navigateToMedical();
}

@Step
public boolean verifyMedicalText() {
	
	return tSAGOVWhatCanIBringPage.verifyMedicalText();
}

@Step
public TSAGOVWhatCanIBringSharpObjectsPage navigateToSharpObjects() {

return tSAGOVWhatCanIBringPage.navigateToSharpObjects();
}


@Step
public boolean verifySharpObjectsText() {
	
	return tSAGOVWhatCanIBringPage.verifySharpObjectsText();
}
@Step
public TSAGOVWhatCanIBringSportingCampingPage navigateToSportingCamping() {
	
	return tSAGOVWhatCanIBringPage.navigateToSportingCamping();
			
}

@Step
public boolean verifySportingCampingText() {
	
	return tSAGOVWhatCanIBringPage.verifySportingCampingText();
}
	
@Step
public TSAGOVWhatCanIBringMiscellaneousPage navigateToMiscellaneous() {
	
	return tSAGOVWhatCanIBringPage.navigateToMiscellaneous();
	
}

@Step
public boolean verifyMiscellaneousText() {
	
	return tSAGOVWhatCanIBringPage.verifyMiscellaneousText();
}


/***********************************************
 * Steps for TSAGOVTravelPage
 ***********************************************/
@Step

public TSAGOVTSAPrePage navigateToTSAPre() {

	return tSAGOVTravelPage.navigateToTSAPre();
	}
}
