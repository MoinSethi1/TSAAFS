package TSAGOV.glue.travel;

import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVPassengerSupportRegressionGlue {

	@Steps
	TSAGOVTravelSteps user;
	
	@Given("^user wants to access all pages on Passenger Support section$")
	public void user_logged_into_the_application() throws InterruptedException {
		
		user.navigateToTSAGOV();
		//user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		//user.enterPassword("password1");
		//user.login();
		
		user.navigateToTSATravel();	   
		  
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
		   assert(user.verifyTravelImage()); 
	}


	@When("^user access Passenger Support page$")
	public void user_access_Passenger_Support_page() {
	    user.navigateToPassengerSupport();
	    
	}

	@Then("^user is directed to Passenger Support page$")
	public void user_is_directed_to_Passenger_Support_page() {
	    
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support");
	    assert(user.verifyPassengerSupportText());
	}

	@Then("^page (.*) under Passenger Support is accessible$")
	public void page_Civil_Rights_under_Passenger_Support_is_accessible_using_locator(String pageName) {
		
		switch(pageName) {
		
		case "Civil Rights":
		user.navigateToCivilRights();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support/civil-rights");
		assert(user.verifyCivilRightsText());
		break;
		
		case "Travel Redress":
			user.navigateToTravelRedress();
			assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support/travel-redress-program");
			assert(user.verifyTravelRedressText());
			break;
			
		case "Claims":
			user.navigateToClaims();
			assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support/claims");
			assert(user.verifyClaimsText());
			break;
		
			
		}
	
}

}