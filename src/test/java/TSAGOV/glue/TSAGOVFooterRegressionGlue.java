package TSAGOV.glue;

import TSAGOV.steps.TSAGOVHomeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class TSAGOVFooterRegressionGlue {

	@Steps
	TSAGOVHomeSteps user;

	@Given("^the user navigates to the application$")
	public void the_user_navigates_to_the_application() {
		user.navigateToTSAGOV();
	}

	@Then("^link (.*) in the footer section shall be accessible$")
	public void link_DHS_in_the_footer_section_shall_be_accessible(String linkName) {

		switch (linkName) {
		case "A to Z Index":
			user.navigateToAToZFooterLink();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/a-zindex");
			assert user.aToZText().equals("A - Z Index");
			break;

		case "DHS":
			user.navigateToDHS();
			assert user.actualUrl().equals("https://www.dhs.gov/");
			break;

		case "Employee":
			user.navigateToEmployeeFooterLink();
			assert user.actualUrl().equals("https://hraccess.tsa.dhs.gov/hraccess/employees.html");
			break;

		case "FOIA":
			user.navigateToFOIALink();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/foia");
			assert user.verifyFOIAText().equals("Freedom of Information Act");
			break;

		case "Federal Relay":
			user.navigateToFederalRelayLink();
			assert user.actualUrl().equals("https://www.federalrelay.us/");
			break;

		case "Industry":
			user.navigateToIndustry();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/for-industry");
			assert user.verifyIndustryText().equals("For Industry");
			break;

		case "Metrics":
			user.navigateToWebMetricsLink();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/web-metrics");
			assert user.verifyMetricsText().equals("Web Metrics");
			break;

		case "No FEAR":
			user.navigateToNoFEARLink();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/no-fear-act");
			assert user.verifyNoFearText().equals("No FEAR Act");
			break;

		case "Privacy":
			user.navigateToPrivacyLink();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/privacy-policy");
			assert user.verifyPrivacyText().equals("Privacy Policy");
			break;

		case "Report Fraud Waste Abuse":
			user.navigateToReportFWALink();
			assert user.actualUrl().equals("https://www.oig.dhs.gov/");
			break;

		case "USA.gov":
			user.navigateToUSAGOVLink();
			assert user.actualUrl().equals("https://www.usa.gov/");
			break;

		case "Subscribe":
			user.NavigateToSubscribe();
			assert user.actualUrl().equals("https://public.govdelivery.com/accounts/USDHSTSA/subscriber/new");
			break;

		}
	}
}
