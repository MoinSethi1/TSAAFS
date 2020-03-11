package TSAGOV.pages.travel;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://edit.staging.tsa.gov/travel")

public class TSAGOVTravelPage extends TSAGOVHomePage {

	@FindBy(css = "#block-travel-sidebar > nav.max-tablet-hidden > ul > li:nth-child(3) > div > a")
	private WebElementFacade tsaPrecheckLink;

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade travelText;

	@FindBy(xpath = "//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[2]/div/a")
	private WebElementFacade specialProcedureLink;

	@FindBy(xpath = "//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[4]/div/a")
	private WebElementFacade passangerSupportLink;

	@FindBy(xpath = "//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[1]/div/a")
	private WebElementFacade securityScreeningLink;

	@FindBy(xpath = "//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[6]/a")
	private WebElementFacade travelFAQLink;

	@FindBy(xpath = "//*[@id=\"block-travel-sidebar\"]/nav[1]/ul/li[5]/div/a")
	private WebElementFacade travelTipsLink;

	public TSAGOVTSAPrecheckPage navigateToTSAPrecheck() {
		tsaPrecheckLink.click();
		return this.switchToPage(TSAGOVTSAPrecheckPage.class);
	}

	public String verifyTravelText() {
		return travelText.getText();
	}

	public TSAGOVSpecialProceduresPage navigateToSpecialProcedures() {
		specialProcedureLink.click();
		return this.switchToPage(TSAGOVSpecialProceduresPage.class);
	}

	public TSAGOVPassengerSupportPage navigateToPassengerSupport() {
		passangerSupportLink.click();
		return this.switchToPage(TSAGOVPassengerSupportPage.class);
	}

	public TSAGOVSecurityScreeningPage navigateToSecurityScreening() {
		securityScreeningLink.click();
		return this.switchToPage(TSAGOVSecurityScreeningPage.class);
	}

	public TSAGOVTravelFAQPage navigateToTravelFAQ() {
		travelFAQLink.click();
		return this.switchToPage(TSAGOVTravelFAQPage.class);
	}

	public TSAGOVTravelTipsPage navigateToTravelTips() {
		travelTipsLink.click();
		return this.switchToPage(TSAGOVTravelTipsPage.class);
	}
}
