package TSAGOV.glue.travel;

import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVTravelTipsRegressionGlue {

	
	@Steps 
	TSAGOVTravelSteps user;
	
	@Given("^user wants to access all pages on Travel Tips section$")
	public void user_wants_to_access_all_pages_on_Travel_Tips_section() {
		user.navigateToTSAGOV();
		//user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		//user.enterPassword("password1");
		//user.login();
		
		user.navigateToTSATravel();	   
		  
		  assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
		   assert(user.verifyTravelImage()); 
	    	}


	@When("^user access Travel Tips page$")
	public void user_access_Travel_Tips_page() {
	    user.navigateToTravelTips();
	}

	@Then("^user is directed to Travel Tips page$")
	public void user_is_directed_to_Travel_Tips_page() {
	    assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/travel-tips");
	    assert user.verifyTravelTipsText();
	}

	@Then("^page (.*) on Travel Tips section is accessible$")
	public void page_Travel_Checklist_on_Travel_Tips_section_is_accessible(String pageName) {
	    switch(pageName) {
	    
	    case "Travel Checklist":
	    	user.navigateToTravelChecklist();
	    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/travel-tips/travel-checklist");
	    	assert user.verifyTravelChecklistText();
	    	break;
	    	
	    }
	}

}
