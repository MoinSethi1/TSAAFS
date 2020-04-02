package TSAGOV.steps;

import java.util.List;

import TSAGOV.pages.Home.TSAGOVHomePage;
import TSAGOV.pages.about.TSAGOVAboutPage;
import TSAGOV.pages.about.TSAGOVEmployeeStoriesPage;
import TSAGOV.pages.about.TSAGOVJobsAtTSAPage;
import TSAGOV.pages.about.TSAGOVMissionPage;
import TSAGOV.pages.about.TSAGOVOrganizationPage;
import TSAGOV.pages.about.TSAGOVStrategyPage;
import TSAGOV.pages.about.TSAGOVTimelinePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TSAGOVAboutSteps extends ScenarioSteps {

	TSAGOVHomePage tSAGOVHomePage;
	TSAGOVAboutPage tSAGOVAboutPage;
	TSAGOVJobsAtTSAPage tSAGOVJobsAtTSAPage;
	TSAGOVEmployeeStoriesPage tSAGOVEmployeeStoriesPage;
	TSAGOVMissionPage tSAGOVMissionPage;
	TSAGOVStrategyPage tSAGOVStrategyPage;
	TSAGOVOrganizationPage tSAGOVOrganizationPage;
	TSAGOVTimelinePage tSAGOVTimelinePage;

	/***********************************************
	 * Steps for TSAGOVHomePage
	 ***********************************************/

	@Step
	public void navigateToTSAGOV() {
		tSAGOVHomePage.navigateToTSAGOV();
	}

	@Step
	public TSAGOVAboutPage navigateToAbout() {
		return tSAGOVHomePage.navigateToAbout();
	}

	@Step
	public String actualUrl() {
		return tSAGOVHomePage.actualUrl();
	}

	/***********************************************
	 * Steps for TSAGOVAboutPage
	 ***********************************************/

	@Step
	public String verifyAboutText() {
		return tSAGOVAboutPage.verifyAboutText();
	}

	@Step
	public TSAGOVStrategyPage navigateToStratregy() {
		return tSAGOVAboutPage.navigateToStratregy();
	}

	@Step
	public TSAGOVMissionPage navogateToMission() {
		return tSAGOVAboutPage.navogateToMission();
	}

	@Step
	public TSAGOVOrganizationPage navigateToOrganization() {
		return tSAGOVAboutPage.navigateToOrganization();

	}

	@Step
	public TSAGOVTimelinePage navigateToTimeline() {
		return tSAGOVAboutPage.navigateToTimeline();
	}

	@Step
	public TSAGOVEmployeeStoriesPage navigateToEmployeeStories() {
		return tSAGOVAboutPage.navigateToEmployeeStories();
	}

	@Step
	public TSAGOVJobsAtTSAPage navigateToJobsAtTSA() {
		return tSAGOVAboutPage.navigateToJobsAtTSA();
	}

	@Step
	public void aboutMenu() {
		tSAGOVAboutPage.aboutMenu();
	}

	/***********************************************
	 * Steps for TSAGOVJobsAtTSAPage
	 ***********************************************/

	@Step
	public String verifyJobsAtTSAText() {
		return tSAGOVJobsAtTSAPage.verifyJobsAtTSAText();
	}

	/***********************************************
	 * Steps for TSAGOVEmployeeStoriesPage
	 ***********************************************/
	@Step
	public String verifyEmployeeStoriesText() {
		return tSAGOVEmployeeStoriesPage.verifyEmployeeStoriesText();
	}

	@Step
	public void empSerchText(String year, String month, String category) {
		tSAGOVEmployeeStoriesPage.empSerchText(year, month, category);

	}

	@Step
	public List<WebElementFacade> empResultList() {
		return tSAGOVEmployeeStoriesPage.empResultList();
	}

	/***********************************************
	 * Steps for TSAGOVMissionPage
	 ***********************************************/

	@Step
	public String verifyMissionText() {
		return tSAGOVMissionPage.verifyMissionText();
	}

	/***********************************************
	 * Steps for TSAGOVStrategyPage
	 ***********************************************/

	@Step
	public String verifyStrategyText() {
		return tSAGOVStrategyPage.verifyStrategyText();
	}

	/***********************************************
	 * Steps for TSAGOVOrganizationPage
	 ***********************************************/

	@Step
	public String verifyOrganizationText() {
		return tSAGOVOrganizationPage.verifyOrganizationText();
	}

	/***********************************************
	 * Steps for TSAGOVTimelinePage
	 ***********************************************/

	@Step

	public String verifyTimelineText() {
		return tSAGOVTimelinePage.verifyTimelineText();
	}

}
