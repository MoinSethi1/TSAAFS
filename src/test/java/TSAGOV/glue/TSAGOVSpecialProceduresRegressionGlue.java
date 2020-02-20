package TSAGOV.glue;

import TSAGOV.steps.TSAGOVSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class TSAGOVSpecialProceduresRegressionGlue {

@Steps 
TSAGOVSteps user;
	
@Given("^user wants to access all pages under Special Procedure section$")
public void user_wants_to_access_all_pages_under_Special_Procedure_section() throws InterruptedException {
	user.navigateToTSAGOV();
	user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
	user.enterPassword("password1");
	user.login();
	
	user.navigateToTSATravel();	   
	  
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
	   assert(user.verifyTravelImage()); 
	
	
}


@When("^user access Special Procedure page$")
public void user_access_Special_Procedure_page() {
	user.navigateToSpecialProcedures();
    
}

@Then("^user is directed to Special Procedure page$")
public void user_is_directed_to_Special_Procedure_page() {
	
    assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures");
	assert(user.verifySpecialProcedureText());
}

@Then("^all pages under Special Procesdure are accessible$")
public void all_pages_under_Special_Procesdure_are_accessible() {
	
	user.navigateToDisabilitiesAndMedical();
	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures");
	assert(user.verifyDisabilitiesAndMedcalText());
  
}
	
	
}
