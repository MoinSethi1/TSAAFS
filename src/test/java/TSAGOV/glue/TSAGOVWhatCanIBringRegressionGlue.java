package TSAGOV.glue;

import org.assertj.core.api.SoftAssertions;


import TSAGOV.steps.TSAGOVSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class TSAGOVWhatCanIBringRegressionGlue {
	
	

	SoftAssertions assertion = new SoftAssertions();
	
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
		Thread.sleep(1000);
	}

	@Then("^user is directed to What Can I Bring page$")
	public void user_is_directed_to_correct_page() throws InterruptedException {
		assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/traveler-information/traveling-food-or-gifts");
		assertion.assertThat(user.verifyWhatCanIBringText()).isTrue();
		assertion.assertAll();
		
		   
	}

	@Then("^all pages on this section are accessible$")
	public void all_pages_on_this_section_are_accessible() {
	   user.navigateToAll();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/all");
	   assertion.assertThat(user.verifyWhatCanIBringText()).isTrue();
	   
	   	   
	   user.navigateToFlammables();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/flammables");
	   assertion.assertThat(user.verifyFlammablesText()).isTrue();
	     
	   
	   user.navigateToFirearms();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/firearms");
	   assertion.assertThat(user.verifyFirearmsText()).isTrue();
	   
	   
	   user.navigateToFood();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/food");
	   assertion.assertThat(user.verifyFoodText()).isTrue();
	   
	   user.navigateToHouseholdTools();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/household-and-tools");
	   //assertion.assertThat(user.verifyHouseholdAndToolsText()).isTrue();
	   
	   user.navigateToMedical();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/medical");
	   assertion.assertThat(user.verifyMedicalText()).isTrue();
	   
	   user.navigateToSharpObjects();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/sharp-objects");
	   assertion.assertThat(user.verifySharpObjectsText()).isTrue();
	   
	   user.navigateToSportingCamping();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/sporting-and-camping");
	   assertion.assertThat(user.verifySportingCampingText()).isTrue();
	   
	   user.navigateToMiscellaneous();
	   assertion.assertThat(user.actualUrl()).isEqualTo("https://edit.staging.tsa.gov//travel/security-screening/whatcanibring/miscellaneous");
	   assertion.assertThat(user.verifyMiscellaneousText()).isTrue();
	   System.out.println(assertion.assertThat(user.verifyMiscellaneousText()).isTrue());
	   	   
	  assertion.assertAll();
	}
	
}
