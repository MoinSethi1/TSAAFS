package TSAGOV.pages.about;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVAboutPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade aboutText;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-3\"]/a[2]/li/span")
	private WebElementFacade strategyLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-3\"]/a[3]/li/span")
	private WebElementFacade missionLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-3\"]/a[4]/li/span")
	private WebElementFacade organizationLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-3\"]/a[5]/li")
	private WebElementFacade timelineLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-3\"]/a[6]/li/span")
	private WebElementFacade employeeStoriesLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-3\"]/a[7]/li")
	private WebElementFacade jobsAtTSALink;

	public String verifyAboutText() {
		return aboutText.getText();
	}

	public TSAGOVStrategyPage navigateToStratregy() {
		strategyLink.click();
		return this.switchToPage(TSAGOVStrategyPage.class);
	}

	public TSAGOVMissionPage navogateToMission() {
		missionLink.click();
		return this.switchToPage(TSAGOVMissionPage.class);
	}

	public TSAGOVOrganizationPage navigateToOrganization() {
		organizationLink.click();
		return this.switchToPage(TSAGOVOrganizationPage.class);
	}

	public TSAGOVTimelinePage navigateToTimeline() {
		timelineLink.click();
		return this.switchToPage(TSAGOVTimelinePage.class);
	}

	public TSAGOVEmployeeStoriesPage navigateToEmployeeStories() {
		employeeStoriesLink.click();
		return this.switchToPage(TSAGOVEmployeeStoriesPage.class);
	}

	public TSAGOVJobsAtTSAPage navigateToJobsAtTSA() {
		jobsAtTSALink.click();
		return this.switchToPage(TSAGOVJobsAtTSAPage.class);
	}

}
