package TSAGOV.glue.travel;


import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class TSAGOVTsaPreRegressionGlue {
	
	//@Rule
	//public ErrorCollector error = new ErrorCollector();
	
	@Steps 
	TSAGOVTravelSteps user;
	
	
	@Given("^user wants to access all pages on TSAPre section$")
	public void user_wants_to_access_all_pages_on_TSAPre_section() throws InterruptedException {
		user.navigateToTSAGOV();
		//user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		//user.enterPassword("password1");
		//user.login();
		
		user.navigateToTSATravel();	   
		  
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
		   assert(user.verifyTravelImage());
		
	    
	}
	    
	

	@When("^user access TSAPre page$")
	public void user_access_TSAPre_page() {
		
	   	   
		user.navigateToTSAPrecheck();   
	   
	}
	


	@Then("^user is directed to TSAPre page$")
	public void user_is_directed_to_TSAPre_page() {
	    
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/precheck");
		assert user.verifyTsaPrecheckText().equals("TSA PreCheck™");
	}

	@Then("^page (.*) under TSAPre section is accessible$")
	public void all_pages_under_TSAPre_are_accessible(String pageName) {
	    
		switch(pageName) {
		
		case "Airport Airlines ":
		user.navigateToAirportsAirlines();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/precheck/map");
		assert(user.verifyAirportsAirlinesText());
		break;
		
		case "Schedule":
		user.navigateToScedule();
		assert(user.actualUrl()).contentEquals("https://edit.staging.tsa.gov/precheck/schedule");
		assert(user.verifyScheduleText());
		break;
		
		case "FAQ":
		user.navigateToFaq();
		assert(user.actualUrl()).contentEquals("https://edit.staging.tsa.gov/precheck/faq");
		assert(user.verifyFaqText());
		break;
		
		case "Trusted Traveler Programs":
		user.navigateToTrustedTravelerPrograms();
		assert(user.actualUrl()).contentEquals("https://ttp.cbp.dhs.gov/");
		assert(user.verifyTrustedTravelerText());
		break;
		
		}
	}
	
	
}
