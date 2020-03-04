package TSAGOV.glue;

import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVSearchRegressionGlue {

	@Steps
	TSAGOVTravelSteps user;

	@Given("^user wants to perform search operation$")
	public void user_wants_to_perform_search_operation() {
		user.navigateToTSAGOV();
	}

	@When("^user access (.*) page$")
	public void user_access_What_Can_I_Bring_page(String searchPage) throws InterruptedException {
		switch (searchPage) {
		case "What Can I Bring":

			user.navigateToWhatCanIBring();
			break;
		}
	}

	@When("^user searches for (.*)$")
	public void user_enters_Food(String searchItem) throws InterruptedException {
		user.enterSearchText(searchItem);
		user.waitForPageload();
	}

	@Then("^search result is displayed$")
	public void search_result_is_displayed() {
		user.searchResultList();
	}

}
