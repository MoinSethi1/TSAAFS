package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTSAPrecheckPage extends TSAGOVTravelPage{
	
@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
private WebElementFacade tsaPrecheckText;

@FindBy (xpath ="//a[@href='/precheck/map']")
private WebElementFacade airportsAirlinesLink;

@FindBy (xpath ="//*[@id=\"sidenav_sublist_3\"]/li[2]/a")
private WebElementFacade scheduleLink;

@FindBy (xpath = "//*[@id=\"sidenav_sublist_3\"]/li[3]/a")
private WebElementFacade faqLink;

@FindBy (xpath ="//*[@id=\"sidenav_sublist_3\"]/li[4]/a")
private WebElementFacade trustedTravelerProgramsPage;

@FindBy (css ="#block-travel-sidebar > nav.max-tablet-hidden > ul > li:nth-child(3) > div > button")
private WebElementFacade tsaPreCheckExpand;


	public String verifyTsaPrecheckText() {
	return tsaPrecheckText.getText();
	
	}
	
	public TSAGOVAirportAirlinesPage navigateToAirportsAirlines() {
		airportsAirlinesLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVAirportAirlinesPage.class);
		
	}

	public TSAGOVSchedulePage navigateToScedule() {
		scheduleLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVSchedulePage.class);
		
		}
	
	public TSAGOVFAQPage navigateToFaq() {
		
		faqLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVFAQPage.class);
	}
	
	public TSAGOVTrustedTravelerProgramPage navigateToTrustedTravelerPrograms() {
		trustedTravelerProgramsPage.click();
		return this.switchToPage(TSAGOVTrustedTravelerProgramPage.class);
	}
	
	public void tsaPreCheckExpand() {
		tsaPreCheckExpand.click();
	}
	
	}
	

