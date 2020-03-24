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

	@When("^user access Media page (.*)$")
	public void user_access_Media_pages(String pageName) {
		switch (pageName) {

		case "Media":
			user.navigateToMedia();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news");

			break;

		case "Media Room":
			user.navigateToMediaRoom();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press");

			break;

		case "Press Releases":
			user.navigateToMediaRoom();
			user.navigateToPressReleases();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/releases");

			break;

		case "Testimony":
			user.navigateToMediaRoom();
			user.navigateToTestimony();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/testimony");

			break;

		case "Speeches":
			user.navigateToMediaRoom();
			user.navigateToSpeeches();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/speeches");

			break;

		case "Statements":
			user.navigateToMediaRoom();
			user.navigateTOStatements();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/statements");

			break;

		case "Factsheets":
			user.navigateToMediaRoom();
			user.navigateToFactSheets();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/factsheets");

			break;

		case "Social Media":
			user.navigateToMediaRoom();
			user.navigateToSocialMedia();
			assert (user.actualUrl()).equals("https://edit.staging.tsa.gov/news/social_media");

			break;

		case "Blog":
			user.navigateToMediaRoom();
			user.navigateToBlog();
			assert user.actualUrl().equals("https://edit.staging.tsa.gov/blog");

			break;

		case "Videos":
			user.navigateToMediaRoom();
			user.navigateToVideo();
			assert user.actualUrl().contains("https://edit.staging.tsa.gov/videos");

			break;
		}
	}

	@Then("^page (.*) under Media section is accessible$")
	public void page_Media_under_Media_section_is_accessible(String pageName) {

		switch (pageName) {

		case "Media":

			assert (user.verifyMediaText().equals("Media"));
			break;

		case "Media Room":

			assert user.verifyMediaRoomText().equals("Media Room");
			break;

		case "Press Releases":

			assert user.verifyPressReleasesText().equals("Press Releases");
			break;

		case "Testimony":

			assert user.verifyTestimonyText().equals("Testimony");
			break;

		case "Speeches":

			assert user.verifySpeechesText().equals("Speeches");
			break;

		case "Statements":

			assert user.verifyStatementsText().equals("Statements");
			break;

		case "Factsheets":

			assert user.verifyFactsheetsText().equals("Factsheets");
			break;

		case "Social Media":

			assert user.verifySocialMediaText().equals("Social Media");
			break;

		case "Blog":

			assert user.verifyBlogText().equals("Blog");
			break;

		case "Videos":

			assert user.verifyVideoBanner();
			break;
		}

	}
}
