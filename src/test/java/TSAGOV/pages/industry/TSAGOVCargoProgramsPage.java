package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVCargoProgramsPage extends TSAGOVIndustryPage {
	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade cargoProgramsText;

	@FindBy(xpath = "//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[1]/a")
	private WebElementFacade aSACLink;

	@FindBy(xpath = "//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[2]/a")
	private WebElementFacade baggageScreeningLink;

	@FindBy(xpath = "//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[3]/a")
	private WebElementFacade businessLink;

	@FindBy(xpath = "//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[4]/a")
	private WebElementFacade capabilityAcceptanceProcessLink;

	@FindBy(xpath = "//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[6]/a")
	private WebElementFacade cyberSecurityToolkitLink;

	@FindBy(xpath = "//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[7]/a")
	private WebElementFacade firstObserverPlusLink;

	@FindBy(xpath = "//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[8]/a")
	private WebElementFacade generalAviationLink;

	@FindBy(xpath = "//a[@href='/for-industry/hazmat-endorsement']")
	private WebElementFacade hAZMATLink;

	@FindBy(xpath = "//a[@href ='/for-industry/intermodal-security-training-and-exercise-program']")
	private WebElementFacade iStepLink;

	@FindBy(xpath = "//a[@href='/itf']")
	private WebElementFacade innovationTaskForceLink;

	@FindBy(xpath = "//a[@href='/for-industry/public-area-security']")
	private WebElementFacade passLink;

	@FindBy(xpath = "//a[@href='/for-industry/reimbursable-screening-services-program']")
	private WebElementFacade reimbursableScreeningLink;

	@FindBy(xpath = "//a[@href='/for-industry/screening-partnerships']")
	private WebElementFacade screeningPartnershipLink;

	@FindBy(xpath = "//a[@href='/for-industry/security-fees']")
	private WebElementFacade securityFeesLink;

	@FindBy(xpath = "//a[@href='/for-industry/sensitive-security-information']")
	private WebElementFacade sSILink;

	@FindBy(xpath = "//a[@href='/for-industry/surface-transportation-security']")
	private WebElementFacade sTSACLink;

	@FindBy(xpath = "//a[@href='/for-industry/surface-transportation']")
	private WebElementFacade surfaceTransportationLink;

	@FindBy(xpath = "//a[@href='/for-industry/training']")
	private WebElementFacade trainingLink;

	@FindBy(xpath = "//a[@href='/for-industry/twic']")
	private WebElementFacade tWICLink;

	public String verifyCargoProgramsTxet() {
		System.out.println(cargoProgramsText.getText());
		return cargoProgramsText.getText();

	}

	public TSAGOVASACPage navigateToASAC() {
		aSACLink.click();
		return this.switchToPage(TSAGOVASACPage.class);
	}

	public TSAGOVBaggageScreeningPage navigateToBaggageScreening() {
		baggageScreeningLink.click();

		return this.switchToPage(TSAGOVBaggageScreeningPage.class);
	}

	public TSAGOVBusinessPage navigateToBusiness() {
		businessLink.click();
		return this.switchToPage(TSAGOVBusinessPage.class);
	}

	public TSAGOVCapabilityAcceptanceProcessPage navigateToCapabilityAcceptanceProcessLink() {
		capabilityAcceptanceProcessLink.click();
		return this.switchToPage(TSAGOVCapabilityAcceptanceProcessPage.class);
	}

	public TSAGOVCyberSecurityToolkitPage nvigateToCyberSecurityToolkit() {
		cyberSecurityToolkitLink.click();
		return this.switchToPage(TSAGOVCyberSecurityToolkitPage.class);
	}

	public TSAGOVFirstObserverPlusPage navigateToFirstObserverPlus() {
		firstObserverPlusLink.click();
		return this.switchToPage(TSAGOVFirstObserverPlusPage.class);
	}

	public TSAGOVGeneralAviationPage navigateToGeneralAviation() {
		generalAviationLink.click();
		return this.switchToPage(TSAGOVGeneralAviationPage.class);
	}

	public TSAGOVHAZMATPage navigateToHAZMAT() {
		hAZMATLink.click();
		return this.switchToPage(TSAGOVHAZMATPage.class);

	}

	public TSAGOVIStepPage navigateToIStep() {
		iStepLink.click();
		return this.switchToPage(TSAGOVIStepPage.class);
	}

	public TSAGOVInnovationTaskForcePage navigateToInnovationTaskForce() {
		innovationTaskForceLink.click();
		return this.switchToPage(TSAGOVInnovationTaskForcePage.class);
	}

	public TSAGOVPASSPage navigateToPASS() {
		passLink.click();
		return this.switchToPage(TSAGOVPASSPage.class);

	}

	public TSAGOVReimbursableScreeningPage navigateToReimbursableScreening() {
		reimbursableScreeningLink.click();
		return this.switchToPage(TSAGOVReimbursableScreeningPage.class);
	}

	public TSAGOVScreeningPartnershipPage navigateToScreeningPartnership() {
		screeningPartnershipLink.click();
		return this.switchToPage(TSAGOVScreeningPartnershipPage.class);

	}

	public TSAGOVSecurityFeesPage navigateToSecurityFees() {
		securityFeesLink.click();
		return this.switchToPage(TSAGOVSecurityFeesPage.class);
	}

	public TSAGOVSSIPage navigateToSSI() {
		sSILink.click();
		return this.switchToPage(TSAGOVSSIPage.class);
	}

	public TSAGOVSTSACPage navigateToSTSAC() {
		sTSACLink.click();
		return this.switchToPage(TSAGOVSTSACPage.class);
	}

	public TSAGOVSurfaceTransportationPage navigateToSurfaceTransportation() {
		surfaceTransportationLink.click();

		return this.switchToPage(TSAGOVSurfaceTransportationPage.class);
	}

	public TSAGOVTrainingPage navigateToTraining() {
		trainingLink.click();

		return this.switchToPage(TSAGOVTrainingPage.class);

	}

	public TSAGOVTWICPage navigateToTWIC() {
		tWICLink.click();
		return this.switchToPage(TSAGOVTWICPage.class);
	}

}
