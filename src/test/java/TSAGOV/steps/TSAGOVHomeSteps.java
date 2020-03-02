package TSAGOV.steps;

import TSAGOV.pages.Home.TSAGOVAToZPage;
import TSAGOV.pages.Home.TSAGOVHomePage;
import net.thucydides.core.annotations.Step;

public class TSAGOVHomeSteps {

	TSAGOVHomePage tSAGOVHomePage;

	/***********************************************
	 * Steps for TSAGOVHomePage
	 ***********************************************/

	@Step
	public void navigateToTSAGOV() {
		tSAGOVHomePage.navigateToTSAGOV();
	}

	@Step
	public boolean verifyTSALogo() {
		return tSAGOVHomePage.verifyTSALogo();
	}

	@Step
	public String actualUrl() {
		return tSAGOVHomePage.actualUrl();
	}

	@Step
	public boolean verifyWCIBLink() {
		return tSAGOVHomePage.verifyWCIBLink();
	}

	@Step
	public boolean verifyATOZIndexLink() {
		return tSAGOVHomePage.verifyATOZIndexLink();
	}

	@Step
	public boolean verifyEmployeeLink() {
		return tSAGOVHomePage.verifyEmployeeLink();
	}

	@Step
	public boolean verifySearchBox() {
		return tSAGOVHomePage.verifySearchBox();
	}

	@Step
	public boolean verifySearchButton() {
		return tSAGOVHomePage.verifySearchButton();
	}

	@Step
	public boolean verifyTravelMenuLink() {
		return tSAGOVHomePage.verifyTravelMenuLink();
	}

	@Step
	public void TravelMenuLink() {
		tSAGOVHomePage.TravelMenuLink();
	}

	@Step
	public boolean verifyMediaMenuLink() {
		return tSAGOVHomePage.verifyMediaMenuLink();

	}

	@Step
	public boolean verifyAboutMenuLink() {
		return tSAGOVHomePage.verifyAboutMenuLink();
	}

	@Step
	public boolean verifyContactLink() {
		return tSAGOVHomePage.verifyContactLink();
	}

	@Step
	public boolean verifyBanner() {
		return tSAGOVHomePage.verifyBanner();
	}

	@Step
	public boolean verifyFooter() {
		return tSAGOVHomePage.verifyFooter();
	}

	@Step
	public boolean verifyHeader() {
		return tSAGOVHomePage.verifyHeader();

	}

	@Step
	public TSAGOVAToZPage navigateToAToZFooterLink() {
		return tSAGOVHomePage.navigateToAToZFooterLink();

	}

	@Step
	public boolean verifyDHSLink() {
		return tSAGOVHomePage.verifyDHSLink();
	}
}
