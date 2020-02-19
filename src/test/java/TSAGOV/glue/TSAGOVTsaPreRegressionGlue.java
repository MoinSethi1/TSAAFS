package TSAGOV.glue;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;

import TSAGOV.steps.TSAGOVSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.sourceforge.htmlunit.corejs.javascript.ast.ErrorCollector;
import net.thucydides.core.annotations.Steps;



public class TSAGOVTsaPreRegressionGlue {
	
	//@Rule
	//public ErrorCollector error = new ErrorCollector();
	
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
		   
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
	   assert(user.verifyTravelImage());
	   
		user.navigateToTSAPre();   
	   
	}
	


	@Then("^user is directed to TSAPre page$")
	public void user_is_directed_to_TSAPre_page() {
	    
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/precheck");
		assert(user.verifyTsaPreImage());
	}

	@Then("^all pages under TSAPre section are accessible$")
	public void all_pages_under_TSAPre_are_accessible() {
	    
		user.navigateToAirportsAirlines();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/precheck/map");
		assert(user.verifyAirportsAirlinesText());
		
		user.navigateToScedule();
		assert(user.actualUrl()).contentEquals("https://edit.staging.tsa.gov/precheck/schedule");
		assert(user.verifyScheduleText());
		
		user.navigateToFaq();
		assert(user.actualUrl()).contentEquals("https://edit.staging.tsa.gov/precheck/faq");
		assert(user.verifyFaqText());
		
		user.navigateToTrustedTravelerPrograms();
		assert(user.actualUrl()).contentEquals("https://ttp.cbp.dhs.gov/");
		assert(user.verifyTrustedTravelerText());
		
	}
	
	
}
