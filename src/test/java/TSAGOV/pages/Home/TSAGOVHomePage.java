package TSAGOV.pages.Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import TSAGOV.pages.about.TSAGOVAboutPage;
import TSAGOV.pages.industry.TSAGOVIndustryPage;
import TSAGOV.pages.media.TSAGOVMediaPage;
import TSAGOV.pages.media.TSAGOVMediaRoomPage;
import TSAGOV.pages.travel.TSAGOVTravelPage;
import TSAGOV.pages.travel.TSAGOVWhatCanIBringPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/")
public class TSAGOVHomePage extends PageObject {

	@FindBy(xpath = "//a[@href ='/travel/security-screening/whatcanibring/all']")
	private WebElementFacade whatCanIBringLink;

	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/div/nav/ul[2]/li[1]/button/span")
	private WebElementFacade travelMenu;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-1\"]/a[1]/li/span")
	private WebElementFacade travelLink;

	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/div/nav/ul[2]/li[3]/button/span")
	private WebElementFacade aboutMenu;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-3\"]/a[1]/li")
	private WebElementFacade aboutLink;

	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/div/nav/ul[2]/li[2]/button/span")
	private WebElementFacade mediaMenu;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-2\"]/a[1]/li/span")
	private WebElementFacade mediaLink;

	@FindBy(xpath = "//*[@id=\"basic-nav-section-2\"]/a[2]/li/span")
	private WebElementFacade mediaRoomLink;

	@FindBy(xpath = "/html/body/div[2]/div/footer/div[1]/div/div[1]/nav/div/div[2]/ul/li[3]/a")
	private WebElementFacade industryLink;

	@FindBy(xpath = "/html/body/div[2]/div/header")
	private WebElementFacade header;

	@FindBy(id = "block-tsa-gov-sitebranding")
	private WebElementFacade tSALogo;

	@FindBy(xpath = "//a[@href='/travel/security-screening/whatcanibring/all']")
	private WebElementFacade wCIBLink;

	@FindBy(xpath = "//a[@href='/a-zindex']")
	private WebElementFacade aToZIndexLink;

	@FindBy(xpath = "//a[@href='https://hraccess.tsa.dhs.gov/hraccess/employees.html']")
	private WebElementFacade employeeLink;

	@FindBy(id = "search-field-small")
	private WebElementFacade searchBox;

	@FindBy(xpath = "//*[@class = 'usa-button']")
	private WebElementFacade searchButton;

	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/nav/ul[2]/li[1]/button/span")
	// @FindBy(xpath = "//*[@class='usa-accordion__button usa-nav__link']")
	private WebElementFacade travelMenuLink;

	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/nav/ul[2]/li[2]/button/span")
	private WebElementFacade mediaMenuLink;

	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/nav/ul[2]/li[3]/button/span")
	private WebElementFacade aboutMenuLink;

	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/nav/ul[2]/li[4]/a/span")
	private WebElementFacade contactLink;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/div/div[1]/div/div/div[1]/div/div/div/div/ul/li/section/div")
	private WebElementFacade banner;

	@FindBy(xpath = "/html/body/div[2]/div/footer/div[1]/div")
	private WebElementFacade footer;

	@FindBy(css = "body > div.dialog-off-canvas-main-canvas > div > footer > div.usa-footer__primary-section > div > div.tablet\\:grid-col-8.grid-col-12 > nav > div > div:nth-child(1) > ul > li:nth-child(1) > a")
	private WebElementFacade aToZFooterLink;

	@FindBy(xpath = "//a[@href='https://www.dhs.gov/']")
	private WebElementFacade dhsLink;

	@FindBy(xpath = "/html/body/div[2]/div/footer/div[1]/div/div[1]/nav/div/div[1]/ul/li[3]/a")
	private WebElementFacade employeeFooterLink;

	@FindBy(xpath = "//a[@href ='/foia']")
	private WebElementFacade FOIALink;

	@FindBy(xpath = "//a[@href='https://www.federalrelay.us/']")
	private WebElementFacade federalRelayLink;

	@FindBy(xpath = "//a[@href='/web-metrics']")
	private WebElementFacade webMetricsLink;

	@FindBy(xpath = "//a[@href='/no-fear-act']")
	private WebElementFacade noFEARLink;

	@FindBy(xpath = "//a[@href='/privacy-policy']")
	private WebElementFacade privacyLink;

	@FindBy(xpath = "//a[@href= 'https://www.oig.dhs.gov/']")
	private WebElementFacade reportFWALink;

	@FindBy(xpath = "//a[@href='https://www.usa.gov/']")
	private WebElementFacade usaGovLink;

	@FindBy(xpath = "//a[@href='https://public.govdelivery.com/accounts/USDHSTSA/subscriber/new']")
	private WebElementFacade subscribeButton;

	public void navigateToTSAGOV() {
		this.openAt("https://edit.staging.tsa.gov");
	}

	public TSAGOVWhatCanIBringPage navigateToWhatCanIBring() throws InterruptedException {
		whatCanIBringLink.waitUntilClickable().click();
		Thread.sleep(1000);
		return this.switchToPage(TSAGOVWhatCanIBringPage.class);

	}

	public TSAGOVTravelPage navigateToTSATravel() {

		travelMenu.waitUntilClickable().click();
		travelLink.waitUntilClickable().click();

		return this.switchToPage(TSAGOVTravelPage.class);
	}

	public TSAGOVMediaPage navigateToMedia() {
		mediaMenu.click();
		mediaLink.click();
		return this.switchToPage(TSAGOVMediaPage.class);
	}

	public TSAGOVMediaRoomPage navigateToMediaRoom() {
		mediaMenu.click();
		mediaRoomLink.click();
		return this.switchToPage(TSAGOVMediaRoomPage.class);
	}

	public String actualUrl() {

		WebDriver driver = getDriver();
		return (driver.getCurrentUrl());
	}

	public void waitForPageload() throws InterruptedException {

		getDriver().manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	}

	public TSAGOVAboutPage navigateToAbout() {
		aboutMenu.click();
		aboutLink.click();
		return this.switchToPage(TSAGOVAboutPage.class);

	}

	public boolean verifyIndustryLink() {
		return industryLink.isPresent();
	}

	public TSAGOVIndustryPage navigateToIndustry() {
		industryLink.click();
		return this.switchToPage(TSAGOVIndustryPage.class);
	}

	public boolean verifyTSALogo() {
		return tSALogo.isPresent();
	}

	public boolean verifyWCIBLink() {
		return wCIBLink.isPresent();
	}

	public boolean verifyATOZIndexLink() {
		return aToZIndexLink.isPresent();
	}

	public boolean verifyEmployeeLink() {
		return employeeLink.isPresent();
	}

	public boolean verifySearchBox() {
		return searchBox.isPresent();

	}

	public boolean verifySearchButton() {
		return searchButton.isPresent();
	}

	public boolean verifyTravelMenuLink() {

		return travelMenuLink.isPresent();
	}

	public void TravelMenuLink() {
		travelMenuLink.click();
	}

	public boolean verifyMediaMenuLink() {
		return mediaMenuLink.isPresent();

	}

	public boolean verifyAboutMenuLink() {
		return aboutMenuLink.isPresent();
	}

	public boolean verifyContactLink() {
		return contactLink.isPresent();
	}

	public boolean verifyBanner() {
		return banner.isPresent();
	}

	public boolean verifyHeader() {
		return header.isPresent();

	}

	public boolean verifyFooter() {
		return footer.isPresent();
	}

	public TSAGOVAToZPage navigateToAToZFooterLink() {
		aToZFooterLink.click();
		return this.switchToPage(TSAGOVAToZPage.class);
	}

	public boolean verifyAToZFooterLink() {
		return aToZFooterLink.isPresent();
	}

	public boolean verifyDHSLink() {
		return dhsLink.isPresent();
	}

	public TSAGOVDHSPage navigateToDHS() {
		dhsLink.click();
		return this.switchToPage(TSAGOVDHSPage.class);
	}

	public boolean verifyEmployeeFooterLink() {
		return employeeFooterLink.isPresent();
	}

	public TSAGOVEmployeePage navigateToEmployeeFooterLink() {
		employeeFooterLink.click();
		return this.switchToPage(TSAGOVEmployeePage.class);
	}

	public boolean verifyFOIALink() {
		return FOIALink.isPresent();
	}

	public TSAGOVFOIAPage navigateToFOIALink() {
		FOIALink.click();
		return this.switchToPage(TSAGOVFOIAPage.class);
	}

	public boolean verifyFederalRelayLink() {
		return federalRelayLink.isPresent();
	}

	public TSAGOVFederalRelayPage navigateToFederalRelayLink() {
		federalRelayLink.click();
		return this.switchToPage(TSAGOVFederalRelayPage.class);
	}

	public boolean verifyWebMetricsLink() {
		return webMetricsLink.isPresent();
	}

	public TSAGOVWebMetricsPage navigateToWebMetricsLink() {
		webMetricsLink.click();
		return this.switchToPage(TSAGOVWebMetricsPage.class);
	}

	public boolean verifyNoFEARLink() {
		return noFEARLink.isPresent();
	}

	public TSAGOVNoFEARPage navigateToNoFEARLink() {
		noFEARLink.click();
		return this.switchToPage(TSAGOVNoFEARPage.class);
	}

	public boolean verifyPrivacyLink() {
		return privacyLink.isPresent();
	}

	public TSAGOVPrivacyPage navigateToPrivacyLink() {
		privacyLink.click();
		return this.switchToPage(TSAGOVPrivacyPage.class);
	}

	public boolean verifyReportFWALink() {
		return privacyLink.isPresent();
	}

	public TSAGOVReportFraudWasteAbusePage navigateToReportFWALink() {
		reportFWALink.click();
		return this.switchToPage(TSAGOVReportFraudWasteAbusePage.class);
	}

	public boolean verifyUSAGOVLink() {
		return usaGovLink.isPresent();
	}

	public TSAGOVUSAGOVPage navigateToUSAGOVLink() {
		usaGovLink.click();
		return this.switchToPage(TSAGOVUSAGOVPage.class);
	}

	public boolean verifySubscribeButton() {
		return subscribeButton.isPresent();

	}

	public TSAGOVSubscribePage NavigateToSubscribe() {
		subscribeButton.click();
		return this.switchToPage(TSAGOVSubscribePage.class);
	}
}
