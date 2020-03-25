package TSAGOV.steps;

import TSAGOV.pages.Home.TSAGOVHomePage;
import TSAGOV.pages.contact.TSAGOVContactPage;
import TSAGOV.pages.contact.TSAGOVCustomerServicePage;
import TSAGOV.pages.contact.TSAGOVLostAndFoundPage;
import TSAGOV.pages.industry.TSAGOVHAZMATPage;
import TSAGOV.pages.industry.TSAGOVTWICPage;
import TSAGOV.pages.media.TSAGOVMediaRoomPage;
import TSAGOV.pages.travel.TSAGOVClaimsPage;
import TSAGOV.pages.travel.TSAGOVIdentificationPage;
import TSAGOV.pages.travel.TSAGOVPassengerSupportPage;
import TSAGOV.pages.travel.TSAGOVTSAPrecheckPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TSAGOVContactSteps extends ScenarioSteps {

	TSAGOVHomePage tSAGOVHomePage;
	TSAGOVContactPage tSAGOVContactPage;
	TSAGOVCustomerServicePage tSAGOVCustomerServicePage;
	TSAGOVLostAndFoundPage tSAGOVLostAndFoundPage;
	TSAGOVTSAPrecheckPage tSAGOVTSAPrecheckPage;
	TSAGOVPassengerSupportPage tSAGOVPassengerSupportPage;
	TSAGOVMediaRoomPage tSAGOVMediaRoomPage;
	TSAGOVTWICPage tSAGOVTWICPage;
	TSAGOVClaimsPage tSAGOVClaimsPage;
	TSAGOVIdentificationPage tSAGOVIdentificationPage;
	TSAGOVHAZMATPage tSAGOVHAZMATPage;

	/***********************************************
	 * Steps for TSAGOVHomePage
	 ***********************************************/

	@Step
	public void navigateToTSAGOV() {
		tSAGOVHomePage.navigateToTSAGOV();
	}

	@Step
	public TSAGOVContactPage navigateToContact() {
		return tSAGOVHomePage.navigateToContact();
	}

	@Step
	public String actualUrl() {
		return tSAGOVHomePage.actualUrl();
	}

	/***********************************************
	 * Steps for TSAGOVContactPage
	 ***********************************************/

	@Step
	public String verifyContactText() {
		return tSAGOVContactPage.verifyContactText();
	}

	@Step
	public TSAGOVCustomerServicePage navigateToCustomerService() {

		return tSAGOVContactPage.navigateToCustomerService();
	}

	@Step
	public TSAGOVLostAndFoundPage navigateToLostAndFound() {
		return tSAGOVContactPage.navigateToLostAndFound();
	}

	@Step
	public TSAGOVTSAPrecheckPage navigateToPrecheck() {
		return tSAGOVContactPage.navigateToPrecheck();
	}

	@Step
	public TSAGOVPassengerSupportPage navigateToPassengerSupport() {
		return tSAGOVContactPage.navigateToPassengerSupport();
	}

	@Step
	public TSAGOVClaimsPage navigateToClaims() {
		return tSAGOVContactPage.navigateToClaims();
	}

	@Step
	public TSAGOVMediaRoomPage navigateToMedia() {
		return tSAGOVContactPage.navigateToMedia();
	}

	@Step
	public TSAGOVTWICPage navigateToTWIC() {
		return tSAGOVContactPage.navigateToTWIC();
	}

	@Step
	public TSAGOVIdentificationPage navigateToIdentification() {
		return tSAGOVContactPage.navigateToIdentification();
	}

	@Step
	public TSAGOVHAZMATPage navigateToHAZMAT() {
		return tSAGOVContactPage.navigateToHAZMAT();
	}

	/***********************************************
	 * Steps for TSAGOVCustomerServicePage
	 ***********************************************/

	@Step
	public String verifyCustomerServiceText() {
		return tSAGOVCustomerServicePage.verifyCustomerServiceText();
	}

	/***********************************************
	 * Steps for TSAGOVLostAndFoundPage
	 ***********************************************/

	@Step
	public String verifyLostAndFoundText() {
		return tSAGOVLostAndFoundPage.verifyLostAndFoundText();
	}

	/***********************************************
	 * Steps for TSAGOVTSAPrecheckPage
	 ***********************************************/

	@Step
	public String verifyTsaPrecheckText() {
		return tSAGOVTSAPrecheckPage.verifyTsaPrecheckText();

	}

	/***********************************************
	 * Steps for TSAGOVPassengerSupportPage
	 ***********************************************/

	@Step
	public String verifyPassengerSupportText() {
		return tSAGOVPassengerSupportPage.verifyPassengerSupportText();
	}

	/***********************************************
	 * Steps for TSAGOVMediaRoomPage
	 ***********************************************/
	@Step
	public String verifyMediaRoomText() {
		return tSAGOVMediaRoomPage.verifyMediaRoomText();
	}

	/***********************************************
	 * Steps for TSAGOVTWICPage
	 ***********************************************/

	@Step
	public String verifyTWICText() {
		return tSAGOVTWICPage.verifyTWICText();
	}

	/***********************************************
	 * Steps for TSAGOVClaimsPage
	 ***********************************************/
	@Step
	public String verifyClaimsText() {
		return tSAGOVClaimsPage.verifyClaimsText();

	}

	/***********************************************
	 * Steps for TSAGOVIdentificationPage
	 ***********************************************/

	@Step
	public String verifyIdentificationText() {
		return tSAGOVIdentificationPage.verifyIdentificationText();
	}

	/***********************************************
	 * Steps for TSAGOVHAZMATPage
	 ***********************************************/
	@Step
	public String verifyHAZMATText() {
		return tSAGOVHAZMATPage.verifyHAZMATText();
	}

}
