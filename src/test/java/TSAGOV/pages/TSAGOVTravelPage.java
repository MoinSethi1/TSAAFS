package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://edit.staging.tsa.gov/travel")

public class TSAGOVTravelPage extends TSAGOVBasePage {

	
	
	@FindBy (xpath ="//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[3]/div/a")
	private WebElementFacade tsaPreLink;
	
	@FindBy (xpath ="//*[@id=\"block-mainpagecontent\"]/div/div[2]/div/div/div/div/p[1]/a/img")
	private WebElementFacade travelImage;
	
	@FindBy (xpath ="//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[2]/div/a")
	private WebElementFacade specialProcedureLink;
	
	@FindBy (xpath ="//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[4]/div/a")
	private WebElementFacade passangerSupportLink;
	
	
	public TSAGOVTSAPrePage navigateToTSAPre() {
		tsaPreLink.click();
		return this.switchToPage(TSAGOVTSAPrePage.class);
	}
	
	public boolean verifyTravelImage() {
		return travelImage.isPresent();
	}
	
	public TSAGOVSpecialProceduresPage navigateToSpecialProcedures() {
		specialProcedureLink.click();
		return this.switchToPage(TSAGOVSpecialProceduresPage.class);
	}
	
	public TSAGOVPassengerSupportPage navigateToPassengerSupport() {
		passangerSupportLink.click();
		return this.switchToPage(TSAGOVPassengerSupportPage.class);
	}
	
}
