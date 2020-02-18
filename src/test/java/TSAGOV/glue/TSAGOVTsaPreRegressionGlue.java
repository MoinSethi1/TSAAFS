package TSAGOV.glue;

import TSAGOV.steps.TSAGOVSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class TSAGOVTsaPreRegressionGlue {
	
		
	@Steps 
	TSAGOVSteps user;
	
	
	@Given("^user wants to access all pages on TSAPre section$")
	public void user_wants_to_access_all_pages_on_TSAPre_section() throws InterruptedException {
		user.navigateToTSAGOV();
		user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		user.enterPassword("password1");
		user.login();
	    
	}
	    
	

	@When("^user access TSAPre page$")
	public void user_access_TSAPre_page() {
	   user.navigateToTSATravel(); 
	}


	@Then("^user is directed to TSAPre page$")
	public void user_is_directed_to_TSAPre_page() {
	    
	}

	@Then("^all pages under TSAPre are accessible$")
	public void all_pages_under_TSAPre_are_accessible() {
	    
	}
	
	
}
