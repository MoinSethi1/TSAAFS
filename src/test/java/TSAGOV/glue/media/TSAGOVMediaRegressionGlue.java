package TSAGOV.glue.media;

import TSAGOV.steps.TSAGOVMediaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVMediaRegressionGlue {

	@Steps
	TSAGOVMediaSteps user;

	@Given("^user wants to access all pages on Media section$")
	public void user_wants_to_access_all_pages_on_Media_section() {

		user.navigateToTSAGOV();
	}

	@When("^user access Media pages$")
	public void user_access_Media_pages() {

	}

	// @When("^empty method test$")
	// public void empty_method_test() {

	// }

	@Then("^page (.*) under Media section is accessible$")
	public void page_Media_under_Media_section_is_accessible(String pageName) {

		switch (pageName) {

		case "Media":
			user.navigateToMedia();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news");
			assert (user.verifyMediaText().equals("Media"));
			break;

		case "Media Room":
			user.navigateToMediaRoom();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press");
			assert user.verifyMediaRoomText().equals("Media Room");
			break;

		case "Press Releases":
			user.navigateToMediaRoom();
			user.navigateToPressReleases();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/releases");
			assert user.verifyPressReleasesText().equals("Press Releases");
			break;

		case "Testimony":
			user.navigateToMediaRoom();
			user.navigateToTestimony();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/testimony");
			assert user.verifyTestimonyText().equals("Testimony");
			break;

		case "Speeches":
			user.navigateToMediaRoom();
			user.navigateToSpeeches();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/speeches");
			assert user.verifySpeechesText().equals("Speeches");
			break;

		case "Statements":
			user.navigateToMediaRoom();
			user.navigateTOStatements();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/statements");
			assert user.verifyStatementsText().equals("Statements");
			break;

		case "Factsheets":
			user.navigateToMediaRoom();
			user.navigateToFactSheets();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/factsheets");
			assert user.verifyFactsheetsText().equals("Factsheets");
			break;

		case "Social Media":
			user.navigateToMediaRoom();
			user.navigateToSocialMedia();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/social_media");
			assert user.verifySocialMediaText().equals("Social Media");
			break;

		case "Blog":
			user.navigateToMediaRoom();
			user.navigateToBlog();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/blog");
			assert user.verifyBlogText().equals("Blog");
			break;

		case "Videos":
			user.navigateToMediaRoom();
			user.navigateToVideo();

			assert user.verifyVideoBanner();
			break;
		}

	}
}
