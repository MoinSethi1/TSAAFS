package TSAGOV.glue;

import TSAGOV.steps.TSAGOVHomeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class TSAGOVHomePageRegressionGlue {

	@Steps
	TSAGOVHomeSteps user;

	@Given("^the user navigates to TSA\\.gov application$")
	public void the_user_navigates_to_TSA_gov_application() {
		user.navigateToTSAGOV();
	}

	@Then("^user would see (.*) section on the page$")
	public void user_would_see_section_on_the_page(String sectionName) {
		switch (sectionName) {
		case "Header":
			assert user.verifyHeader();
			assert user.verifyTSALogo();
			assert user.verifyWCIBLink();
			assert user.verifyATOZIndexLink();
			assert user.verifyEmployeeLink();
			assert user.verifySearchBox();
			assert user.verifySearchButton();
			assert user.verifyTravelMenuLink();
			assert user.verifyAboutMenuLink();
			assert user.verifyContactLink();
			assert user.verifyMediaMenuLink();
			break;

		case "Main Content":
			assert user.verifyBanner();
			break;

		case "Footer":
			assert user.verifyFooter();
			user.navigateToAToZFooterLink();
			assert user.verifyDHSLink();
			break;

		}

	}

}
