package TSAGOV.glue;

import TSAGOV.steps.TSAGOVSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVSecurityScreeningRegressionGlue {
	
	@Steps
	TSAGOVSteps user;
	
	@Given("^user wants to access all pages on Security Screening section$")
	public void user_logged_into_the_application() throws InterruptedException {
		
		user.navigateToTSAGOV();
		user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		user.enterPassword("password1");
		user.login();
		
		user.navigateToTSATravel();	   
		  
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
		   assert(user.verifyTravelImage()); 
	}
	
	
	@When("^user access Security Screening page$")
	public void user_access_Security_Screening_page() {
		user.navigateToSecurityScreening();
		
	}


	@Then("^user is directed to Security Screening page$")
	public void user_is_directed_to_Security_Screening_page() {
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening");
		assert(user.verifySecurityScreeningText());
	}
	
	@Then("^page (.*) under Security Screening is accessible$")
	public void page_Real_ID_under_Security_Screening_is_accessible(String pageName) {
	   switch(pageName) {
	   case "Identification":
		   user.navigateToIdentification();
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/identification");
		   assert(user.verifyIdentificationText());
		   break;
		   
	   case "Liquids Rule":
		   user.navigateToLiquidsRule();
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/liquids-rule");
		   assert user.verifyLiquidsRuleText();
		   break;
		   
	   case "Emerging Technology":
		   user.naviagteToEmergingTechnology();
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/emerging-technology");
		   assert user.verifyEmergingTechnologyText();
		   break;
		   
	   case "REAL ID":
	   user.navigateToRealID();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/real-id");
	   assert user.verifyRealIDText();
	   break;
	   
	   }
	
}
}
