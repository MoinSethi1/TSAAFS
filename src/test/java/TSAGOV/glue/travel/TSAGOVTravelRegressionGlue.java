package TSAGOV.glue.travel;

import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVTravelRegressionGlue {

	@Steps
	TSAGOVTravelSteps user;

	@Given("^user wants to access all pages on Travel section$")
	public void user_wants_to_access_all_pages_on_Travel_section() {
		user.navigateToTSAGOV();

	}

	@When("^user access Travel page (.*)$")
	public void user_access_Travel_page(String pageName) {

		switch (pageName) {

		case "Travel":
			user.navigateToTSATravel();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel");

			break;

		case "Security Screening":
			user.travelMenu();
			user.navigateToSecurityScreening();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/security-screening");

			break;

		case "What Can I Bring":
			user.travelMenu();
			user.navigateToSecurityScreening();
			// user.securityScreeningExpand();
			user.navigateToWCIB();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/all");

			break;

		case "Identification":
			user.travelMenu();
			user.navigateToSecurityScreening();
			// user.securityScreeningExpand();
			user.navigateToIdentification();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/security-screening/identification");

			break;

		// assert(user.actualUrl()).equals("https://preview.tsa.gov/travel/security-screening/identification");
		// assert(user.verifyIdentificationText());
		// break;

		case "Liquids Rule":
			user.travelMenu();
			user.navigateToSecurityScreening();
			// user.securityScreeningExpand();
			user.navigateToLiquidsRule();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/security-screening/liquids-rule");

			break;

		case "Emerging Technology":
			user.travelMenu();
			user.navigateToSecurityScreening();
			// user.securityScreeningExpand();
			user.naviagteToEmergingTechnology();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/security-screening/emerging-technology");

			break;

		case "REAL ID":
			user.travelMenu();
			user.navigateToSecurityScreening();
			// user.securityScreeningExpand();
			user.navigateToRealID();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/real-id");

			break;

		case "Special Procedures":
			user.travelMenu();
			user.navigateToSpecialProcedures();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/special-procedures");

			break;

		case "Disabilities Medical Conditions":
			user.travelMenu();
			user.navigateToSpecialProcedures();
			// user.specialProceduresExpand();
			user.navigateToDisabilitiesAndMedical();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/special-procedures");

			break;

		case "Military":
			user.travelMenu();
			user.navigateToSpecialProcedures();
			// user.specialProceduresExpand();
			user.navigateToMilitary();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/special-procedures/military-travelers");

			break;

		case "Children":
			user.travelMenu();
			user.navigateToSpecialProcedures();
			// user.specialProceduresExpand();
			user.navigateToChildren();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/special-procedures/traveling-children");

			break;

		case "Seniors":
			user.travelMenu();
			user.navigateToSpecialProcedures();
			// user.specialProceduresExpand();
			user.navigateToSenior();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/screening-passengers-75-and-older");

			break;

		case "Law Enforcement":
			user.travelMenu();
			user.navigateToSpecialProcedures();
			// user.specialProceduresExpand();
			user.navigateToLawEnforcement();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/law-enforcement");

			break;

		case "Cultural":
			user.travelMenu();
			user.navigateToSpecialProcedures();
			// user.specialProceduresExpand();
			user.navigateToCultural();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/special-procedures/cultural");

			break;

		case "TSA PreCheck":
			user.travelMenu();
			user.navigateToTSAPrecheck();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/precheck");

			break;

		case "Airport Airlines":
			user.travelMenu();
			user.navigateToTSAPrecheck();
			// user.tsaPreCheckExpand();
			user.navigateToAirportsAirlines();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/precheck/map");

			break;

		case "Schedule":
			user.travelMenu();
			user.navigateToTSAPrecheck();
			// user.tsaPreCheckExpand();
			user.navigateToScedule();
			assert (user.actualUrl()).contentEquals("https://preview.tsa.gov/precheck/schedule");

			break;

		case "FAQ":
			user.travelMenu();
			user.navigateToTSAPrecheck();
			user.navigateToFaq();
			assert (user.actualUrl()).contentEquals("https://preview.tsa.gov/precheck/faq");

			break;

		case "Trusted Traveler Programs":
			user.travelMenu();
			user.navigateToTSAPrecheck();
			// user.tsaPreCheckExpand();
			user.navigateToTrustedTravelerPrograms();
			assert (user.actualUrl()).contentEquals("https://ttp.cbp.dhs.gov/");
			// assert (user.verifyTrustedTravelerText());
			break;

		case "Passenger Support":
			user.travelMenu();
			user.navigateToPassengerSupport();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/passenger-support");

			break;

		case "Civil Rights":
			user.travelMenu();
			user.navigateToPassengerSupport();
			// user.passengerSupportExpand();
			user.navigateToCivilRights();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/passenger-support/civil-rights");

			break;

		case "Travel Redress":
			user.travelMenu();
			user.navigateToPassengerSupport();
			// user.passengerSupportExpand();
			user.navigateToTravelRedress();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/passenger-support/travel-redress-program");

			break;

		case "Claims":
			user.travelMenu();
			user.navigateToPassengerSupport();
			// user.passengerSupportExpand();
			user.navigateToClaims();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/passenger-support/claims");

			break;

		case "Travel Tips":
			user.travelMenu();
			user.navigateToTravelTips();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/travel-tips");

			break;

		case "Travel Checklist":
			user.travelMenu();
			user.navigateToTravelTips();
			// user.travelTipsExpand();
			user.navigateToTravelChecklist();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/travel-tips/travel-checklist");

			break;

		case "Travel FAQ":
			user.travelMenu();
			user.navigateToTravelFAQ();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/travel/frequently-asked-questions");

			break;

		}

	}

	@Then("^page (.*) under Travel section is accessible$")
	public void page_Travel_under_Travel_section_is_accessible(String pageName) throws InterruptedException {
		switch (pageName) {

		case "Travel":

			assert (user.verifyTravelText().equals("Travel"));
			break;

		case "Security Screening":

			assert (user.verifySecurityScreeningText().equals("Security Screening"));
			break;

		case "What Can I Bring":

			assert (user.verifyWhatCanIBringText().equals("What Can I Bring?"));
			break;

		case "Identification":

			assert user.verifyIdentificationText().equals("Identification");
			break;

		case "Liquids Rule":

			assert user.verifyLiquidsRuleText().equals("Liquids Rule");
			break;

		case "Emerging Technology":

			assert user.verifyEmergingTechnologyText().equals("Emerging Technology");
			break;

		case "REAL ID":

			assert user.verifyRealIDText().equals("REAL ID");
			break;

		case "Special Procedures":

			assert (user.verifySpecialProcedureText().equals("Disabilities and Medical Conditions"));
			break;

		case "Disabilities Medical Conditions":

			assert (user.verifyDisabilitiesAndMedcalText().equals("Disabilities and Medical Conditions"));
			break;

		case "Military":

			assert (user.verifyMilitaryText().equals("Military Travel"));
			break;

		case "Children":

			assert (user.verifyChildrenText().equals("Traveling with Children"));
			break;

		case "Seniors":

			assert (user.verifySeniorText().equals("Screening for Passengers 75 and Older"));
			break;

		case "Law Enforcement":

			assert (user.verifyLawEnforcemenText().equals("Law Enforcement"));
			break;

		case "Cultural":

			assert (user.verifyCulturalText().equals("Screening Travelers and Property"));
			break;

		case "TSA PreCheck":

			assert user.verifyTsaPrecheckText().equals("TSA PreCheck™");
			break;

		case "Airport Airlines":

			assert (user.verifyAirportsAirlinesText().equals("TSA Pre✓® Airports and Airlines"));
			break;

		case "Schedule":

			assert (user.verifyScheduleText().equals("TSA Pre✓® Checkpoint Schedule"));
			break;

		case "FAQ":

			assert (user.verifyFaqText().equals("TSA Pre✓® FAQ"));
			break;

		case "Trusted Traveler Programs":

			assert (user.actualUrl()).equals("https://ttp.cbp.dhs.gov/");
			// assert (user.verifyTrustedTravelerText());
			break;

		case "Passenger Support":

			assert (user.verifyPassengerSupportText().equals("Passenger Support"));
			break;

		case "Civil Rights":

			assert (user.verifyCivilRightsText().equals("Civil Rights"));
			break;

		case "Travel Redress":

			assert (user.verifyTravelRedressText().equals("DHS Traveler Redress Inquiry Program"));
			break;

		case "Claims":

			assert (user.verifyClaimsText().equals("Claims"));
			break;

		case "Travel Tips":

			assert user.verifyTravelTipsText().equals("TSA's Top Travel Tips");
			break;

		case "Travel Checklist":

			assert user.verifyTravelChecklistText().equals("Travel Checklist");
			break;

		case "Travel FAQ":

			assert user.verifyTravelFAQText().equals("Frequently Asked Questions");
			break;

		}

	}
}
