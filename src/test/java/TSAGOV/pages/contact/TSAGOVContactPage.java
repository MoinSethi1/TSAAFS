package TSAGOV.pages.contact;

import TSAGOV.pages.Home.TSAGOVHomePage;
import TSAGOV.pages.industry.TSAGOVHAZMATPage;
import TSAGOV.pages.industry.TSAGOVTWICPage;
import TSAGOV.pages.media.TSAGOVMediaRoomPage;
import TSAGOV.pages.travel.TSAGOVClaimsPage;
import TSAGOV.pages.travel.TSAGOVIdentificationPage;
import TSAGOV.pages.travel.TSAGOVPassengerSupportPage;
import TSAGOV.pages.travel.TSAGOVTSAPrecheckPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVContactPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade contactText;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[1]/div[1]/div/div[2]/a")
	private WebElementFacade customerServiceLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[2]/div[1]/div/div[2]/a")
	private WebElementFacade lostAndFoundLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[3]/div[1]/div/div[2]/a")
	private WebElementFacade TSAPrecheckLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[1]/div[2]/div/div[2]/a")
	private WebElementFacade passengerSupportLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[1]/div[3]/div/div[2]/a")
	private WebElementFacade claimsLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[2]/div[2]/div/div[2]/a")
	private WebElementFacade mediaLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[3]/div[2]/div/div[2]/a")
	// *[@id="block-mainpagecontent"]/div/section/div/div[3]/div[2]/div/div[2]/a
	private WebElementFacade TWICLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[2]/div[3]/div/div[2]/a")
	private WebElementFacade identificationLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/section/div/div[3]/div[3]/div/div[2]/a")
	private WebElementFacade HAZMATLink;

	public String verifyContactText() {
		return contactText.getText();
	}

	public TSAGOVCustomerServicePage navigateToCustomerService() {
		customerServiceLink.click();
		return this.switchToPage(TSAGOVCustomerServicePage.class);
	}

	public TSAGOVLostAndFoundPage navigateToLostAndFound() {
		lostAndFoundLink.click();
		return this.switchToPage(TSAGOVLostAndFoundPage.class);
	}

	public TSAGOVTSAPrecheckPage navigateToPrecheck() {
		TSAPrecheckLink.click();
		return this.switchToPage(TSAGOVTSAPrecheckPage.class);
	}

	public TSAGOVPassengerSupportPage navigateToPassengerSupport() {
		passengerSupportLink.click();
		return this.switchToPage(TSAGOVPassengerSupportPage.class);
	}

	public TSAGOVClaimsPage navigateToClaims() {
		claimsLink.click();
		return this.switchToPage(TSAGOVClaimsPage.class);
	}

	public TSAGOVMediaRoomPage navigateToMedia() {
		mediaLink.click();
		return this.switchToPage(TSAGOVMediaRoomPage.class);
	}

	public TSAGOVTWICPage navigateToTWIC() {
		TWICLink.click();
		return this.switchToPage(TSAGOVTWICPage.class);
	}

	public TSAGOVIdentificationPage navigateToIdentification() {
		identificationLink.click();
		return this.switchToPage(TSAGOVIdentificationPage.class);
	}

	public TSAGOVHAZMATPage navigateToHAZMAT() {
		HAZMATLink.click();
		return this.switchToPage(TSAGOVHAZMATPage.class);
	}
}
