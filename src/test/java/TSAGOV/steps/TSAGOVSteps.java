package TSAGOV.steps;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;

import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.TSAGOVMemberPage;
import TSAGOV.pages.TSAGOVWhatCanIBringPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TSAGOVSteps extends ScenarioSteps {

	TSAGOVBasePage tSAGOVBasePage;
	
	/***********************************************
	 * Steps for TSAGOVBasePage
	 ***********************************************/
	
@Step
	public void navigateToTSAGOV() {
		tSAGOVBasePage.navigateToTSAGOV();;
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
}
