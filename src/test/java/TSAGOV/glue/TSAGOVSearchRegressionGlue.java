package TSAGOV.glue;

import java.util.List;

import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
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

	@When("^user searches on (.*) for (.*)$")
	public void user_enters_Food(String searchPage, String searchItem) throws InterruptedException {
		System.out.println(searchPage);
		System.out.println(searchItem);
		switch (searchPage) {
		case "What Can I Bring":
			user.enterSearchText(searchItem);
			break;

		}

	}

	@Then("^search result is displayed for (.*)$")
	public void search_result_is_displayed(String searchItem) {
		List<WebElementFacade> result = user.searchResultList();
		int listSize = result.size();

		assert listSize > 0;
		assert user.searchResultList().size() > 0;
		System.out.println(searchItem);
		assert (result.get(0).containsText(searchItem) || result.get(0).containsText(searchItem.toLowerCase()));
		// for (int i = 0; i < listSize; i++) {
		// System.out.println(result.get(i).getText());
		// if (result.get(i).containsText("Food") || result.get(i).containsText("food"))
		// {
		// System.out.println("Success Search Text Found!");
		// } else {
		// System.out.println("No luck this time Try Again!");

		// }
	}
}
