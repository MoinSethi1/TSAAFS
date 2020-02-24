package TSAGOV.glue;

import TSAGOV.steps.TSAGOVSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVTravelFAQRegressionGlue {

	@Steps
	TSAGOVSteps user;
	
	@Given("^user wants to access FAQ section$")
	public void user_wants_to_access_FAQ_section() throws InterruptedException {
		user.navigateToTSAGOV();
		user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		user.enterPassword("password1");
		user.login();
		
		user.navigateToTSATravel();	   
		  
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
		   assert(user.verifyTravelImage());
	}


	@When("^user access FAQ page$")
	public void user_access_FAQ_page() {
	   user.navigateToTravelFAQ();
	}

	@Then("^user is directed to FAQ page$")
	public void user_is_directed_to_FAQ_page() {
	    assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/frequently-asked-questions");
	    assert user.verifyTravelFAQText();
	}
}
