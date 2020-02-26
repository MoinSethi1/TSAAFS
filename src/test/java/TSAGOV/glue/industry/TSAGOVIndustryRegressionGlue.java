package TSAGOV.glue.industry;

import TSAGOV.steps.TSAGOVAboutSteps;
import TSAGOV.steps.TSAGOVIndustrySteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVIndustryRegressionGlue {

	
	@Steps
	TSAGOVIndustrySteps user;
	
	@Given("^user wants to access all pages on Industry section$")
	public void user_wants_to_access_all_pages_on_Industry_section() {
	   user.navigateToTSAGOV();
	}


	@When("^user access Industry pages$")
	public void user_access_Industry_pages() {
	    user.navigateToIndustry();
	}

	@Then("^page (.*) under Industry section is accessible$")
	public void page_Industry_under_Industry_section_is_accessible(String pageName) {
	    
		switch(pageName) {
		
		case "Industry":
			assert user.verifyIndustryText();
			break;
			
		case "Cargo Programs":
			user.navigateToIndustry();
			assert user.verifyIndustryText();
			break;
		}
	}

	
	   
	
}
