package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVCargoProgramsPage extends TSAGOVIndustryPage {
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade cargoProgramsText;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[1]/a")
	private WebElementFacade aSACLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[2]/a")
	private WebElementFacade baggageScreeningLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[3]/a")
	private WebElementFacade businessLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[4]/a")
	private WebElementFacade capabilityAcceptanceProcessLink;
		
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[6]/a")
	private WebElementFacade cyberSecurityToolkitLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[7]/a")
	private WebElementFacade firstObserverPlusLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[8]/a")
	private WebElementFacade generalAviationLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[9]/a")
	private WebElementFacade hAZMATLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[10]/a")
	private WebElementFacade iStepLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[11]/a")
	private WebElementFacade innovationTaskForce;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[12]/a")
	private WebElementFacade passLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[13]/a")
	private WebElementFacade reimbursableScreeningLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[14]/a")
	private WebElementFacade screeningPartnershipLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[15]/a")
	private WebElementFacade securityFeesLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[16]/a")
	private WebElementFacade sSILink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[17]/a")
	private WebElementFacade sTSACLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[18]/a")
	private WebElementFacade surfaceTransportationLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[19]/a")
	private WebElementFacade trainingLink;
	
	@FindBy (xpath ="//*[@id=\"block-for-industry-sidebar\"]/nav[1]/ul/li[20]/a")
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

public TSAGOVFirstObserverPlusPage navigateToFirstObserverPlus(){
	firstObserverPlusLink.click();
	return this.switchToPage(TSAGOVFirstObserverPlusPage.class);
}

public TSAGOVGeneralAviationPage navigateToGeneralAviation() {
	generalAviationLink.click();
	return this.switchToPage(TSAGOVGeneralAviationPage.class);
}



}
