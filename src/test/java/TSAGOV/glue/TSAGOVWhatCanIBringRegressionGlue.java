package TSAGOV.glue;

import TSAGOV.steps.TSAGOVSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVWhatCanIBringRegressionGlue {
	
	@Steps 
	TSAGOVSteps user;
	

	@Given("^user logged into TSA\\.gov application$")
	public void user_logged_into_TSA_gov_application() throws InterruptedException {
		user.navigateToTSAGOV();
		user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		user.enterPassword("password1");
		user.login();
	    
	}


	@When("^user access What Can I Bring\\? page$")
	public void user_access_What_Can_I_Bring_page() throws InterruptedException {
	    
		user.navigateToWhatCanIBring();
	}

	@Then("^user is directed to correct page$")
	public void user_is_directed_to_correct_page() {
	   
	}

	@Then("^all pages on this section are accessible$")
	public void all_pages_on_this_section_are_accessible() {
	    
	}
	
}
