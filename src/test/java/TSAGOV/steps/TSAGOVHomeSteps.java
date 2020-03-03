package TSAGOV.steps;

import TSAGOV.pages.Home.TSAGOVAToZPage;
import TSAGOV.pages.Home.TSAGOVDHSPage;
import TSAGOV.pages.Home.TSAGOVEmployeePage;
import TSAGOV.pages.Home.TSAGOVFOIAPage;
import TSAGOV.pages.Home.TSAGOVFederalRelayPage;
import TSAGOV.pages.Home.TSAGOVHomePage;
import TSAGOV.pages.Home.TSAGOVNoFEARPage;
import TSAGOV.pages.Home.TSAGOVPrivacyPage;
import TSAGOV.pages.Home.TSAGOVReportFraudWasteAbusePage;
import TSAGOV.pages.Home.TSAGOVSubscribePage;
import TSAGOV.pages.Home.TSAGOVUSAGOVPage;
import TSAGOV.pages.Home.TSAGOVWebMetricsPage;
import TSAGOV.pages.industry.TSAGOVIndustryPage;
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
	public boolean verifyAToZFooterLink() {
		return tSAGOVHomePage.verifyAToZFooterLink();
	}

	@Step
	public TSAGOVAToZPage navigateToAToZFooterLink() {
		return tSAGOVHomePage.navigateToAToZFooterLink();

	}

	@Step
	public boolean verifyDHSLink() {
		return tSAGOVHomePage.verifyDHSLink();
	}

	@Step
	public TSAGOVDHSPage navigateToDHS() {
		return tSAGOVHomePage.navigateToDHS();
	}

	@Step
	public boolean verifyEmployeeFooterLink() {
		return tSAGOVHomePage.verifyEmployeeFooterLink();
	}

	@Step
	public TSAGOVEmployeePage navigateToEmployeeFooterLink() {
		return tSAGOVHomePage.navigateToEmployeeFooterLink();
	}

	@Step
	public boolean verifyFOIALink() {
		return tSAGOVHomePage.verifyFOIALink();
	}

	@Step
	public TSAGOVFOIAPage navigateToFOIALink() {
		return tSAGOVHomePage.navigateToFOIALink();
	}

	@Step
	public boolean verifyFederalRelayLink() {
		return tSAGOVHomePage.verifyFederalRelayLink();
	}

	@Step
	public TSAGOVFederalRelayPage navigateToFederalRelayLink() {
		return tSAGOVHomePage.navigateToFederalRelayLink();
	}

	@Step
	public boolean verifyIndustryLink() {
		return tSAGOVHomePage.verifyIndustryLink();
	}

	@Step
	public TSAGOVIndustryPage navigateToIndustry() {
		return tSAGOVHomePage.navigateToIndustry();
	}

	@Step
	public boolean verifyWebMetricsLink() {
		return tSAGOVHomePage.verifyWebMetricsLink();
	}

	@Step
	public TSAGOVWebMetricsPage navigateToWebMetricsLink() {
		return tSAGOVHomePage.navigateToWebMetricsLink();
	}

	@Step
	public boolean verifyNoFEARLink() {
		return tSAGOVHomePage.verifyNoFEARLink();
	}

	@Step
	public TSAGOVNoFEARPage navigateToNoFEARLink() {
		return tSAGOVHomePage.navigateToNoFEARLink();
	}

	@Step
	public boolean verifyPrivacyLink() {
		return tSAGOVHomePage.verifyPrivacyLink();
	}

	@Step
	public TSAGOVPrivacyPage navigateToPrivacyLink() {
		return tSAGOVHomePage.navigateToPrivacyLink();
	}

	@Step
	public boolean verifyReportFWALink() {
		return tSAGOVHomePage.verifyReportFWALink();
	}

	@Step
	public TSAGOVReportFraudWasteAbusePage navigateToReportFWALink() {
		return tSAGOVHomePage.navigateToReportFWALink();
	}

	@Step
	public boolean verifyUSAGOVLink() {
		return tSAGOVHomePage.verifyUSAGOVLink();
	}

	@Step
	public TSAGOVUSAGOVPage navigateToUSAGOVLink() {
		return tSAGOVHomePage.navigateToUSAGOVLink();
	}

	@Step
	public boolean verifySubscribeButton() {
		return tSAGOVHomePage.verifySubscribeButton();

	}

	@Step
	public TSAGOVSubscribePage NavigateToSubscribe() {
		return tSAGOVHomePage.NavigateToSubscribe();
	}

}
