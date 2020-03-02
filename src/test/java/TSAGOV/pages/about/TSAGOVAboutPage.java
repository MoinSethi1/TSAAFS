package TSAGOV.pages.about;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVAboutPage extends TSAGOVHomePage {

	@FindBy (xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade aboutText;
	
	@FindBy (xpath = "//*[@id=\"block-about-sidebar\"]/nav[1]/ul/li[1]/a")
	private WebElementFacade strategyLink;
	
	@FindBy (xpath ="//*[@id=\"block-about-sidebar\"]/nav[1]/ul/li[2]/a")
	private WebElementFacade missionLink;
	
	@FindBy (xpath ="//*[@id=\"block-about-sidebar\"]/nav[1]/ul/li[3]/a")
	private WebElementFacade organizationLink;
	
	@FindBy (xpath = "//*[@id=\"block-about-sidebar\"]/nav[1]/ul/li[4]/a")
	private WebElementFacade timelineLink;
	
	@FindBy (xpath ="//*[@id=\"block-about-sidebar\"]/nav[1]/ul/li[5]/a")
	private WebElementFacade employeeStoriesLink;
	
	@FindBy (xpath ="//*[@id=\"block-about-sidebar\"]/nav[1]/ul/li[6]/a")
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
