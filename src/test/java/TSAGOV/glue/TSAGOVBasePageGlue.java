package TSAGOV.glue;


import static org.junit.Assert.assertTrue;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.steps.TSAGOVSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


public class TSAGOVBasePageGlue {
	
	SoftAssertions assertion = new SoftAssertions();
	
	@Steps
	TSAGOVSteps user;
	
	
	
	@Given("^the user opens the TSA\\.gov application$")
	public void the_user_opens_the_TSA_gov_application() {
	   System.out.println("open App");
	   user.navigateToTSAGOV();
	   
	}

	
	@When("^user logs into application using credentials$")
	public void user_enters_credentials() throws InterruptedException {
	    user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
	    user.enterPassword("password1");
	    user.login();
	}

	@Then("^user would see the membership information$")
	public void user_would_see_the_membership_information() throws InterruptedException {
		/**
		try {	
				assertTrue(user.verifyMemberText());
		} catch(AssertionError ae) {
			ae.printStackTrace();
		}
		user.login();
		assertTrue(user.verifyMemberText());
			
		**/
								
				assertion.assertThat(user.verifyMemberText()).isTrue();
				assertion.assertAll();		
	  
	}

}
