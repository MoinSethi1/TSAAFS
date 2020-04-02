package TSAGOV.glue.about;

import TSAGOV.steps.TSAGOVAboutSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVAboutRegressionGlue {

	@Steps
	TSAGOVAboutSteps user;

	@Given("^user wants to access all pages on About section$")
	public void user_wants_to_access_all_pages_on_About_section() {
		user.navigateToTSAGOV();
	}

	@When("^user access About page (.*)$")
	public void user_access_About_page(String pageName) {

		switch (pageName) {

		case "About":
			user.navigateToAbout();
			assert user.actualUrl().equals("https://preview.tsa.gov/about");

			break;

		case "Strategy":
			user.aboutMenu();
			user.navigateToStratregy();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/about/strategy");

			break;

		case "Mission":
			user.aboutMenu();
			user.navogateToMission();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/about/tsa-mission");

			break;

		case "Organization":
			user.aboutMenu();
			user.navigateToOrganization();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/about/tsa-leadership");

			break;

		case "Timeline":
			user.aboutMenu();
			user.navigateToTimeline();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/timeline");

			break;

		case "Employee Stories":
			user.aboutMenu();
			user.navigateToEmployeeStories();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/about/employee-stories");

			break;

		case "Jobs At TSA":
			user.aboutMenu();
			user.navigateToJobsAtTSA();
			assert (user.actualUrl()).equals("https://preview.tsa.gov/about/jobs-at-tsa");

			break;
		}

	}

	@Then("^page (.*) under About section is accessible$")
	public void page_is_accessible(String pageName) {
		switch (pageName) {

		case "About":

			assert (user.verifyAboutText()).equals("About");

			break;

		case "Strategy":

			assert (user.verifyStrategyText().equals("TSA Strategy"));

			break;

		case "Mission":

			assert (user.verifyMissionText().equals("Mission"));
			break;

		case "Organization":

			assert (user.verifyOrganizationText().equals("Leadership and Organization"));
			break;

		case "Timeline":

			assert (user.verifyTimelineText().equals("Transportation Security Timeline"));
			break;

		case "Employee Stories":

			assert (user.verifyEmployeeStoriesText().equals("Employee Stories"));
			break;

		case "Jobs At TSA":

			assert (user.verifyJobsAtTSAText().equals("Jobs at TSA"));
			break;

		}
	}
}
