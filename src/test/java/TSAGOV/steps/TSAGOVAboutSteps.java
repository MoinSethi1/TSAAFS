package TSAGOV.steps;

import TSAGOV.pages.TSAGOVBasePage;
import TSAGOV.pages.about.TSAGOVAboutPage;
import TSAGOV.pages.about.TSAGOVEmployeeStoriesPage;
import TSAGOV.pages.about.TSAGOVJobsAtTSAPage;
import TSAGOV.pages.about.TSAGOVMissionPage;
import TSAGOV.pages.about.TSAGOVOrganizationPage;
import TSAGOV.pages.about.TSAGOVStrategyPage;
import TSAGOV.pages.about.TSAGOVTimelinePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class TSAGOVAboutSteps extends ScenarioSteps {
	
	
	TSAGOVBasePage tSAGOVBasePage;
	TSAGOVAboutPage tSAGOVAboutPage;
	TSAGOVJobsAtTSAPage tSAGOVJobsAtTSAPage;
	TSAGOVEmployeeStoriesPage tSAGOVEmployeeStoriesPage;
	TSAGOVMissionPage tSAGOVMissionPage;
	TSAGOVStrategyPage tSAGOVStrategyPage;
	TSAGOVOrganizationPage tSAGOVOrganizationPage;
	TSAGOVTimelinePage tSAGOVTimelinePage;

	/***********************************************
	 * Steps for TSAGOVBasePage
	 ***********************************************/
	
@Step
	public void navigateToTSAGOV() {
		tSAGOVBasePage.navigateToTSAGOV();
	}

@Step
public TSAGOVAboutPage navigateToAbout() {
		return tSAGOVBasePage.navigateToAbout();
	}

@Step
public String actualUrl() {
	return tSAGOVBasePage.actualUrl();
	}

/***********************************************
 * Steps for TSAGOVAboutPage
 ***********************************************/

@Step
public boolean verifyAboutText() {
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

/***********************************************
 * Steps for TSAGOVJobsAtTSAPage
 ***********************************************/


@Step
public boolean verifyJobsAtTSAText(){
	return tSAGOVJobsAtTSAPage.verifyJobsAtTSAText();
}


/***********************************************
 * Steps for TSAGOVEmployeeStoriesPage
 ***********************************************/
@Step
public boolean verifyEmployeeStoriesText() {
	return tSAGOVEmployeeStoriesPage.verifyEmployeeStoriesText();
}



/***********************************************
 * Steps for TSAGOVMissionPage
 ***********************************************/

@Step
public boolean verifyMissionText() {
	return tSAGOVMissionPage.verifyMissionText();
}


/***********************************************
 * Steps for TSAGOVStrategyPage
 ***********************************************/

@Step
public boolean verifyStrategyText() {
	return tSAGOVStrategyPage.verifyStrategyText();
}

/***********************************************
 * Steps for TSAGOVOrganizationPage
 ***********************************************/

@Step
public boolean verifyOrganizationText() {
	return tSAGOVOrganizationPage.verifyOrganizationText();
		}

/***********************************************
 * Steps for TSAGOVTimelinePage
 ***********************************************/

@Step

public boolean verifyTimelineText() {
	return tSAGOVTimelinePage.verifyTimelineText();
}

}
