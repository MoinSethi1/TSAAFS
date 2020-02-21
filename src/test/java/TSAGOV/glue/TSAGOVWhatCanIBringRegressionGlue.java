package TSAGOV.glue;

import org.assertj.core.api.SoftAssertions;


import TSAGOV.steps.TSAGOVSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class TSAGOVWhatCanIBringRegressionGlue {
	
	
	
	@Steps 
	TSAGOVSteps user;
	
	
	@Given("^user wants to access all pages on What Can I Bring section$")
	public void user_wants_to_access_all_pages_on_WhatCanIBring_section() throws InterruptedException {
		user.navigateToTSAGOV();
		user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
		user.enterPassword("password1");
		user.login();
	    
	}


	@When("^user access What Can I Bring\\? page$")
	public void user_access_What_Can_I_Bring_page() throws InterruptedException {
	    
		user.navigateToWhatCanIBring();
		Thread.sleep(1000);
	}

	@Then("^user is directed to What Can I Bring page$")
	public void user_is_directed_to_correct_page() throws InterruptedException {
		assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/all");
		assert(user.verifyWhatCanIBringText());
			
		   
	}

	@Then("^page (.*) on What can I bring section is accessible$")
	public void all_sections_on_this_page_are_accessible(String pageName) {
		
		switch (pageName) {
		
		case "All":		
	   user.navigateToAll();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/all");
	   assert(user.verifyWhatCanIBringText());
	   break;
	   
		case "Flammables":	
	   user.navigateToFlammables();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/flammables");
	   assert(user.verifyFlammablesText());
	     break;
	     
	     
		case "Firearms":
	   user.navigateToFirearms();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/firearms");
	   assert(user.verifyFirearmsText());
	   break;
	   
	   case "Food":	   
	   user.navigateToFood();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/food");
	   assert(user.verifyFoodText());
	   break;
	   
	   case "Household Tools":
	   user.navigateToHouseholdTools();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/household-and-tools");
	   assert(user.verifyHouseholdAndToolsText());
	   break;
	   
	   case "Medical":
	   user.navigateToMedical();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/medical");
	   assert(user.verifyMedicalText());
	   break;
	   
	   case "Sharp Objects":
	   user.navigateToSharpObjects();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/sharp-objects");
	   assert(user.verifySharpObjectsText());
	   break;
	   
	   case "Sporting Camping":
	   user.navigateToSportingCamping();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/sporting-and-camping");
	   assert(user.verifySportingCampingText());
	   break;
	   
	   case "Miscellaneous":   
	   user.navigateToMiscellaneous();
	   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/miscellaneous");
	  assert(user.verifyMiscellaneousText());
	  break;
	   
		} 	   
	 
	}
	
}
