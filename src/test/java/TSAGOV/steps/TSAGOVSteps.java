package TSAGOV.steps;

import java.util.concurrent.TimeUnit;
import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.TSAGOVMemberPage;
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
	TSAGOV.pages.TSAGOVWhatCanIBringPage TSAGOVWhatCanIBringPage;
	
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
	return TSAGOVWhatCanIBringPage.verifyWhatCanIBringText();

}

@Step
public TSAGOVWhatCanIBringAllItemsPage navigateToAll() {
	
	return TSAGOVWhatCanIBringPage.navigateToAll();
	
}

@Step
public TSAGovWhatCanIBringFlammablesPage navigateToFlammables() {
	
	return TSAGOVWhatCanIBringPage.navigateToFlammables();
	
}

@Step
public boolean verifyFlammablesText() {
	
	return TSAGOVWhatCanIBringPage.verifyFlammablesText();
}

@Step
public TSAGOVWhatCanIBringFirearmsPage navigateToFirearms() {
	
	return TSAGOVWhatCanIBringPage.navigateToFirearms();
		
}

@Step
public boolean verifyFirearmsText() {
	
	return TSAGOVWhatCanIBringPage.verifyFirearmsText();
}

@Step
public TSAGOVWhatCanIBringFoodPage navigateToFood() {
	
	return TSAGOVWhatCanIBringPage.navigateToFood();
}

@Step
public boolean verifyFoodText() {
	
	return TSAGOVWhatCanIBringPage.verifyFoodText();
}
	
@Step
public TSAGOVWharCanIBringHouseholdToolsPage navigateToHouseholdTools() {
	
	return TSAGOVWhatCanIBringPage.navigateToHouseholdTools();
		
}

@Step
public boolean verifyHouseholdAndToolsText() {
	
	return TSAGOVWhatCanIBringPage.verifyHouseholdAndToolsText();
}

@Step
public TSAGOVWhatCanIBringMedicalPage navigateToMedical() {
	
	return TSAGOVWhatCanIBringPage.navigateToMedical();
}

@Step
public boolean verifyMedicalText() {
	
	return TSAGOVWhatCanIBringPage.verifyMedicalText();
}

@Step
public TSAGOVWhatCanIBringSharpObjectsPage navigateToSharpObjects() {

return TSAGOVWhatCanIBringPage.navigateToSharpObjects();
}


@Step
public boolean verifySharpObjectsText() {
	
	return TSAGOVWhatCanIBringPage.verifySharpObjectsText();
}
@Step
public TSAGOVWhatCanIBringSportingCampingPage navigateToSportingCamping() {
	
	return TSAGOVWhatCanIBringPage.navigateToSportingCamping();
			
}

@Step
public boolean verifySportingCampingText() {
	
	return TSAGOVWhatCanIBringPage.verifySportingCampingText();
}
	
@Step
public TSAGOVWhatCanIBringMiscellaneousPage navigateToMiscellaneous() {
	
	return TSAGOVWhatCanIBringPage.navigateToMiscellaneous();
	
}

@Step
public boolean verifyMiscellaneousText() {
	
	return TSAGOVWhatCanIBringPage.verifyMiscellaneousText();
}


}
