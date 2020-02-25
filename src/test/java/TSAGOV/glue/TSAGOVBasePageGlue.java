package TSAGOV.glue;



import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;


public class TSAGOVBasePageGlue {
	
	
	@Steps
	TSAGOVTravelSteps user;
	
	
	
	
	@Given("^the user opens the TSA\\.gov application$")
	public void the_user_opens_the_TSA_gov_application() {
	   System.out.println("open App");
	  user.navigateToTSAGOV();
	   
	}

	
	@When("^user logs into application using credentials$")
	public void user_enters_credentials() throws InterruptedException {
	   // user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
	    //user.enterPassword("password1");
	    //user.login();
	}

	@Then("^user would see the membership information$")
	public void user_would_see_the_membership_information() throws InterruptedException {
		/**
		try {	
				assertTrue(user.verifyMemberText());
		} catch(AssertionError ae) {
			ae.printStackTrace();
		}
		//user.login();
		//assertTrue(user.verifyMemberText());
			
		**/
								
				//assert(user.verifyMemberText());
				
	}

}
