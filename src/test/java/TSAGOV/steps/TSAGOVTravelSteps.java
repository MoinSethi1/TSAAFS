package TSAGOV.steps;

import java.util.concurrent.TimeUnit;

import TSAGOV.pages.Home.TSAGOVHomePage;
import TSAGOV.pages.travel.TSAGOVAirportAirlinesPage;
import TSAGOV.pages.travel.TSAGOVChildrenPage;
import TSAGOV.pages.travel.TSAGOVCivilRightsPage;
import TSAGOV.pages.travel.TSAGOVClaimsPage;
import TSAGOV.pages.travel.TSAGOVCulturalPage;
import TSAGOV.pages.travel.TSAGOVDisabilitiesAndMedicalPage;
import TSAGOV.pages.travel.TSAGOVEmergingTechnologyPage;
import TSAGOV.pages.travel.TSAGOVFAQPage;
import TSAGOV.pages.travel.TSAGOVIdentificationPage;
import TSAGOV.pages.travel.TSAGOVLawEnforcementPage;
import TSAGOV.pages.travel.TSAGOVLiquidsRulePage;
import TSAGOV.pages.travel.TSAGOVMilitaryPage;
import TSAGOV.pages.travel.TSAGOVPassengerSupportPage;
import TSAGOV.pages.travel.TSAGOVRealIDPage;
import TSAGOV.pages.travel.TSAGOVSchedulePage;
import TSAGOV.pages.travel.TSAGOVSecurityScreeningPage;
import TSAGOV.pages.travel.TSAGOVSeniorPage;
import TSAGOV.pages.travel.TSAGOVSpecialProceduresPage;
import TSAGOV.pages.travel.TSAGOVTSAPrecheckPage;
import TSAGOV.pages.travel.TSAGOVTravelChecklistPage;
import TSAGOV.pages.travel.TSAGOVTravelFAQPage;
import TSAGOV.pages.travel.TSAGOVTravelPage;
import TSAGOV.pages.travel.TSAGOVTravelRedressPage;
import TSAGOV.pages.travel.TSAGOVTravelTipsPage;
import TSAGOV.pages.travel.TSAGOVTrustedTravelerProgramPage;
import TSAGOV.pages.travel.TSAGOVWharCanIBringHouseholdToolsPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringAllItemsPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringFirearmsPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringFoodPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringMedicalPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringMiscellaneousPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringSharpObjectsPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringSportingCampingPage;
import TSAGOV.pages.travel.TSAGovWhatCanIBringFlammablesPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TSAGOVTravelSteps extends ScenarioSteps {

	TSAGOVHomePage tSAGOVHomePage;
	TSAGOVWhatCanIBringPage tSAGOVWhatCanIBringPage;
	TSAGovWhatCanIBringFlammablesPage tSAGovWhatCanIBringFlammablesPage;
	TSAGOVWhatCanIBringMiscellaneousPage tSAGOVWhatCanIBringMiscellaneousPage;
	TSAGOVWhatCanIBringFirearmsPage tSAGOVWhatCanIBringFirearmsPage;
	TSAGOVWhatCanIBringFoodPage tSAGOVWhatCanIBringFoodPage;
	TSAGOVWharCanIBringHouseholdToolsPage tSAGOVWharCanIBringHouseholdToolsPage;
	TSAGOVWhatCanIBringMedicalPage tSAGOVWhatCanIBringMedicalPage;
	TSAGOVWhatCanIBringSharpObjectsPage tSAGOVWhatCanIBringSharpObjectsPage;
	TSAGOVWhatCanIBringSportingCampingPage tSAGOVWhatCanIBringSportingCampingPage;
	TSAGOVTravelPage tSAGOVTravelPage;
	TSAGOVTSAPrecheckPage tSAGovTsaPrePage;
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
	TSAGOVEmergingTechnologyPage tSAGOVEmergingTechnologyPage;
	TSAGOVRealIDPage tSAGOVRealIDPage;
	TSAGOVTravelFAQPage tSAGOVTravelFAQPage;
	TSAGOVTravelTipsPage tSAGOVTravelTipsPage;
	TSAGOVTravelChecklistPage tSAGOVTravelChecklistPage;

	/***********************************************
	 * Steps for TSAGOVHomePage
	 ***********************************************/

	@Step
	public void navigateToTSAGOV() {
		tSAGOVHomePage.navigateToTSAGOV();
	}

	@Step
	public void navigateToWhatCanIBring() throws InterruptedException {
		tSAGOVHomePage.navigateToWhatCanIBring();
	}

	@Step
	public TSAGOVTravelPage navigateToTSATravel() {

		return tSAGOVHomePage.navigateToTSATravel();

	}

	@Step
	public boolean verifyExpectedText(WebElementFacade expectedText) {
		return expectedText.isPresent();
	}

	@Step
	public String actualUrl() {

		return tSAGOVHomePage.actualUrl();
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

	public TSAGOVTSAPrecheckPage navigateToTSAPrecheck() {

		return tSAGOVTravelPage.navigateToTSAPrecheck();
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

	@Step
	public TSAGOVTravelFAQPage navigateToTravelFAQ() {
		return tSAGOVTravelPage.navigateToTravelFAQ();
	}

	@Step
	public TSAGOVTravelTipsPage navigateToTravelTips() {
		return tSAGOVTravelPage.navigateToTravelTips();
	}

	/***********************************************
	 * Steps for TSAGOVTSAPreCheckPage
	 ***********************************************/

	@Step
	public String verifyTsaPrecheckText() {
		return tSAGovTsaPrePage.verifyTsaPrecheckText();

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

	@Step
	public void tsaPreCheckExpand() {
		tSAGovTsaPrePage.tsaPreCheckExpand();
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

	@Step
	public void specialProceduresExpand() {
		tSAGOVSpecialProceduresPage.specialProceduresExpand();
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

	@Step
	public void passengerSupportExpand() {
		tSAGOVPassengerSupportPage.passengerSupportExpand();
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

	@Step
	public void securityScreeningExpand() {
		tSAGOVSecurityScreeningPage.securityScreeningExpand();
	}

	@Step
	public TSAGOVWhatCanIBringPage navigateToWCIB() {
		return tSAGOVSecurityScreeningPage.navigateToWCIB();
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

	/***********************************************
	 * Steps for TSAGOVTravelFAQPage
	 ***********************************************/
	@Step
	public boolean verifyTravelFAQText() {
		return tSAGOVTravelFAQPage.verifyTravelFAQText();
	}

	/***********************************************
	 * Steps for TSAGOVTravelTipsPage
	 ***********************************************/
	@Step
	public boolean verifyTravelTipsText() {
		return tSAGOVTravelTipsPage.verifyTravelTipsText();
	}

	@Step
	public TSAGOVTravelChecklistPage navigateToTravelChecklist() {
		return tSAGOVTravelTipsPage.navigateToTravelChecklist();
	}

	@Step
	public void travelTipsExpand() {
		tSAGOVTravelTipsPage.travelTipsExpand();
	}

	/***********************************************
	 * Steps for TSAGOVTravelChecklistPage
	 ***********************************************/

	@Step
	public boolean verifyTravelChecklistText() {
		return tSAGOVTravelChecklistPage.verifyTravelChecklistText();
	}
}
