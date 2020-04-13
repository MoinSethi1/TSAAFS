package TSAGOV.glue.contact;

import TSAGOV.steps.TSAGOVContactSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVContactRegressionGlue {

	@Steps
	TSAGOVContactSteps user;

	@Given("^user wants to access all pages on Contact section$")
	public void user_wants_to_access_all_pages_on_Contact_section() {
		user.navigateToTSAGOV();
	}

	@When("^user access Contact page (.*)$")
	public void user_access_Contact_page_Contact(String pageName) {
		user.navigateToContact();
		switch (pageName) {
		case "Contact":

			assert user.actualUrl().equals("https://preview.tsa.gov/contact");
			break;

		case "Customer Service":
			user.navigateToCustomerService();
			assert user.actualUrl().equals("https://preview.tsa.gov/contact/customer-service");
			break;

		case "Lost & Found":
			user.navigateToLostAndFound();
			assert user.actualUrl().equals("https://preview.tsa.gov/contact/lost-and-found");
			break;

		case "TSA PreCheck":
			user.navigateToPrecheck();
			assert user.actualUrl().equals("https://preview.tsa.gov/precheck");
			break;

		case "Passenger Support":
			user.navigateToPassengerSupport();
			assert user.actualUrl().equals("https://preview.tsa.gov/travel/passenger-support");
			break;

		case "Media":
			user.navigateToMedia();
			assert user.actualUrl().equals("https://preview.tsa.gov/news/press");
			break;

		case "TWIC":
			user.navigateToTWIC();
			assert user.actualUrl().equals("https://preview.tsa.gov/for-industry/twic");
			break;

		case "Claims":
			user.navigateToClaims();
			assert user.actualUrl().equals("https://preview.tsa.gov/travel/passenger-support/claims");
			break;

		case "Identification":

			user.navigateToIdentification();

			assert user.actualUrl().equals("https://preview.tsa.gov/travel/security-screening/identification");
			break;

		case "HAZMAT":
			user.navigateToHAZMAT();
			assert user.actualUrl().equals("https://preview.tsa.gov/for-industry/hazmat-endorsement");
			break;

		}
	}

	@Then("^page (.*) under Contact section is accessible$")
	public void page_Contact_under_Contact_section_is_accessible(String pageName) {
		switch (pageName) {
		case "Contact":
			assert user.verifyContactText().equals("Contact");
			break;

		case "Customer Service":
			assert user.verifyCustomerServiceText().equals("Customer Service");
			break;

		case "Lost & Found":
			assert user.verifyContactText().equals("Lost & Found");
			break;

		case "TSA PreCheck":
			assert user.verifyTsaPrecheckText().equals("TSA PreCheck™");
			break;

		case "Passenger Support":
			assert user.verifyPassengerSupportText().equals("Passenger Support");
			break;

		case "Media":
			assert user.verifyMediaRoomText().equals("Media Room");
			break;

		case "TWIC":
			assert user.verifyTWICText().equals("TWIC®");
			break;

		case "Claims":
			assert user.verifyClaimsText().equals("Claims");
			break;

		case "Identification":

			assert user.verifyIdentificationText().equals("Identification");
			break;

		case "HAZMAT":
			assert user.verifyHAZMATText().equals("HAZMAT Endorsement");
			break;

		}

	}

}
