package TSAGOV.glue.travel;

import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVWhatCanIBringRegressionGlue {

	@Steps
	TSAGOVTravelSteps user;

	@Given("^user wants to access all pages on What Can I Bring section$")
	public void user_wants_to_access_all_pages_on_WhatCanIBring_section() throws InterruptedException {
		user.navigateToTSAGOV();

		// user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		// user.enterPassword("password1");
		// user.login();

	}

	@When("^user access What Can I Bring\\? page (.*)$")
	public void user_access_What_Can_I_Bring_page(String pageName) throws InterruptedException {
		user.navigateToWhatCanIBring();
		switch (pageName) {

		case "All":
			user.navigateToAll();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/all");

			break;

		case "Flammables":
			user.navigateToFlammables();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/flammables");

			break;

		case "Firearms":
			user.navigateToFirearms();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/firearms");

			break;

		case "Food":
			user.navigateToFood();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/food");

			break;

		case "Household Tools":
			user.navigateToHouseholdTools();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/household-and-tools");

			break;

		case "Medical":
			user.navigateToMedical();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/medical");

			break;

		case "Sharp Objects":
			user.navigateToSharpObjects();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/sharp-objects");

			break;

		case "Sporting Camping":
			user.navigateToSportingCamping();
			assert (user.actualUrl()).equals(
					"https://preview.tsa.gov/travel/security-screening/whatcanibring/sporting-and-camping");

			break;

		case "Miscellaneous":
			user.navigateToMiscellaneous();
			assert (user.actualUrl())
					.equals("https://preview.tsa.gov/travel/security-screening/whatcanibring/miscellaneous");

			break;

		}
	}

	@Then("^page (.*) on What can I bring section is accessible$")
	public void all_sections_on_this_page_are_accessible(String pageName) {

		switch (pageName) {

		case "All":

			assert (user.verifyWhatCanIBringText().equals("What Can I Bring?"));
			break;

		case "Flammables":

			assert (user.verifyFlammablesText());
			break;

		case "Firearms":

			assert (user.verifyFirearmsText());
			break;

		case "Food":

			assert (user.verifyFoodText());
			break;

		case "Household Tools":

			assert (user.verifyHouseholdAndToolsText());
			break;

		case "Medical":

			assert (user.verifyMedicalText());
			break;

		case "Sharp Objects":

			assert (user.verifySharpObjectsText());
			break;

		case "Sporting Camping":

			assert (user.verifySportingCampingText());
			break;

		case "Miscellaneous":

			assert (user.verifyMiscellaneousText());
			break;

		}

	}

}
