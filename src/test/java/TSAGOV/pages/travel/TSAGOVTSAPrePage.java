package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTSAPrePage extends TSAGOVTravelPage{
	
@FindBy (xpath ="//*[@id=\"block-mainpagecontent\"]/div/div/div[1]/div/div/div/article/div/div/div[1]")
private WebElementFacade tsaPreImage;

@FindBy (xpath ="//*[@id=\"sidenav_sublist_3\"]/li[1]/a")
private WebElementFacade airportsAirlinesLink;

@FindBy (xpath ="//*[@id=\"sidenav_sublist_3\"]/li[2]/a")
private WebElementFacade scheduleLink;

@FindBy (xpath = "//*[@id=\"sidenav_sublist_3\"]/li[3]/a")
private WebElementFacade faqLink;

@FindBy (xpath ="//*[@id=\"sidenav_sublist_3\"]/li[4]/a")
private WebElementFacade trustedTravelerProgramsPage;



	public boolean verifyTsaPreImage() {
	return tsaPreImage.isPresent();
	
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
	
	}
	

