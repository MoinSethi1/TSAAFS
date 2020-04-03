package TSAGOV.pages.travel;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://preview.tsa.gov/travel")

public class TSAGOVTravelPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"basic-nav-section-1\"]/a[4]/li/span")
	private WebElementFacade tsaPrecheckLink;

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade travelText;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-1\"]/a[3]/li/span")
	private WebElementFacade specialProcedureLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-1\"]/a[5]/li/span")
	private WebElementFacade passangerSupportLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-1\"]/a[2]/li")
	private WebElementFacade securityScreeningLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-1\"]/a[7]/li/span")

	private WebElementFacade travelFAQLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-1\"]/a[6]/li/span")
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
