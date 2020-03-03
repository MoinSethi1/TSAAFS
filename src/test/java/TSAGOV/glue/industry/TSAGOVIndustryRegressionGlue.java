package TSAGOV.glue.industry;

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
		assert user.verifyIndustryText().equals("For Industry");

	}

	@Then("^page (.*) under Industry section is accessible$")
	public void page_Industry_under_Industry_section_is_accessible(String pageName) {

		switch (pageName) {

		case "Cargo Programs":
			user.navigateToCargoPrograms();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/for-industry/cargo-screening-program");
			assert user.verifyCargoProgramsTxet().equals("Cargo Programs");
			break;

		case "ASAC":
			user.navigateToCargoPrograms();
			user.navigateToASAC();
			assert user.verifyaSACText().equals("Aviation Security Advisory Committee");
			break;

		case "Baggage Screening":
			user.navigateToCargoPrograms();
			user.navigateToBaggageScreening();
			assert user.verifybaggageScreeningText().equals("Electronic Baggage Screening Program");
			break;

		case "Business":
			user.navigateToCargoPrograms();
			user.navigateToBusiness();
			assert user.verifyBusinessText().equals("Business Office");
			break;

		case "Capability Acceptance Process":
			user.navigateToCargoPrograms();
			user.navigateToCapabilityAcceptanceProcessLink();
			assert user.verifyCapabilityAcceptanceProcessText().equals("Capability Acceptance Process");
			break;

		case "Cybersecurity Toolkit":
			user.navigateToCargoPrograms();
			user.nvigateToCyberSecurityToolkit();
			assert user.verifyCyberSecurityToolkitText().equals("Surface Transportation Cybersecurity Toolkit");
			break;

		case "First Observer Plus":
			user.navigateToCargoPrograms();
			user.navigateToFirstObserverPlus();
			assert user.verifyFirstObserverPlusText().equals("First Observer Plus™");
			break;

		case "General Aviation":
			user.navigateToCargoPrograms();
			user.navigateToGeneralAviation();
			assert user.verifyGeneralAviationText().equals("General Aviation");
			break;

		case "HAZMAT":
			user.navigateToCargoPrograms();
			user.navigateToHAZMAT();
			assert user.verifyHAZMATText().equals("HAZMAT Endorsement");
			break;

		case "IStep":
			user.navigateToCargoPrograms();
			user.navigateToIStep();
			assert user.verifyIStepText().equals("Intermodal Security Training and Exercise Program");
			break;

		case "Innovation Task Force":
			user.navigateToCargoPrograms();
			user.navigateToInnovationTaskForce();
			assert user.verifyInnovationTaskForceText().equals("Innovation Task Force");
			break;

		case "PASS":
			user.navigateToCargoPrograms();
			user.navigateToPASS();
			assert user.verifyPassText().equals("Public Area Security");
			break;

		case "Reimbursable Screening":
			user.navigateToCargoPrograms();
			user.navigateToReimbursableScreening();
			assert user.verifyReimbursableScreeningText().equals("Reimbursable Screening Services Program");
			break;

		case "Screening Partnership":
			user.navigateToCargoPrograms();
			user.navigateToScreeningPartnership();
			assert user.verifyScreeningPartnershipText().equals("Screening Partnership Program");
			break;

		case "Security Fees":
			user.navigateToCargoPrograms();
			user.navigateToSecurityFees();
			assert user.verifySecurityFeesText().equals("Security Fees");
			break;

		case "SSI":
			user.navigateToCargoPrograms();
			user.navigateToSSI();
			assert user.verifySSIText().equals("Sensitive Security Information");
			break;

		case "STSAC":
			user.navigateToCargoPrograms();
			user.navigateToSTSAC();
			assert user.verifySTSACText().equals("Surface Transportation Security Advisory Committee");
			break;

		case "Surface Transportation":
			user.navigateToCargoPrograms();
			user.navigateToSurfaceTransportation();
			assert user.verifySurfaceTransportationText().equals("Surface Transportation");
			break;

		case "Training":
			user.navigateToCargoPrograms();
			user.navigateToTraining();
			assert user.verifyTrainingText().equals("Training");
			break;

		case "TWIC":
			user.navigateToCargoPrograms();
			user.navigateToTWIC();
			assert user.verifyTWICText().equals("TWIC®");
			break;

		}

	}

}
