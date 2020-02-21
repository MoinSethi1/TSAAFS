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

@Then("^page (.*) under Special Procesdure is accessible$")
public void all_pages_under_Special_Procesdure_are_accessible(String pageName) {
	
	
	switch(pageName) {
	
	case "Disabilities Medical Conditions":
	user.navigateToDisabilitiesAndMedical();
	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures");
	assert(user.verifyDisabilitiesAndMedcalText());
    break;
    
	case "Military":
		user.navigateToMilitary();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures/military-travelers");
		assert(user.verifyMilitaryText());
		break;
		
	case "Children":
		user.navigateToChildren();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures/traveling-children");
		assert(user.verifyChildrenText());
		break;
		
	case "Seniors":
		user.navigateToSenior();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/screening-passengers-75-and-older");
		assert(user.verifySeniorText());
		break;
		
	case "Law Enforcement":
		user.navigateToLawEnforcement();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/law-enforcement");
		assert(user.verifyLawEnforcemenText());
		break;
		
	case "Cultural":
		user.navigateToCultural();
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures/cultural");
		assert(user.verifyCulturalText());
		break;
    
	}
}
	
	
}
