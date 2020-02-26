package TSAGOV.pages;


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
public class TSAGOVBasePage extends PageObject {
	
	@FindBy(xpath = "//*[contains(text(), 'Member for')]")
	private WebElementFacade memberText;
	
	@FindBy(id = "edit-name")
	private WebElementFacade usernameBox;
	
	@FindBy(id="edit-pass")
	private WebElementFacade passwordBox;
	
	@FindBy(id="edit-submit")
	private WebElementFacade loginBtn;
	
	@FindBy (xpath = "//a[@href ='/travel/security-screening/whatcanibring/all']")
	private WebElementFacade whatCanIBringLink;
	
	@FindBy (xpath = "/html/body/div/div/header/nav/div/nav/ul[2]/li[1]/button/span")
	private WebElementFacade travelMenu;
	
	@FindBy (xpath ="//*[@id=\"basic-nav-section-1\"]/a[1]/li/span")
	private WebElementFacade travelLink;	
	
	@FindBy (xpath = "/html/body/div/div/header/nav/div/nav/ul[2]/li[3]/button/span")
	private WebElementFacade aboutMenu;
	
	@FindBy (xpath = "//*[@id=\"basic-nav-section-3\"]/a[1]/li")
	private WebElementFacade aboutLink;
	
	@FindBy (xpath ="/html/body/div/div/header/nav/div/nav/ul[2]/li[2]/button/span")
	private WebElementFacade mediaMenu;
	
	@FindBy (xpath ="//*[@id=\"basic-nav-section-2\"]/a[1]/li/span")
	private WebElementFacade mediaLink;
	
	@FindBy (xpath ="//*[@id=\"basic-nav-section-2\"]/a[2]/li/span")
	private WebElementFacade mediaRoomLink;
	
	@FindBy (xpath = "/html/body/div[2]/footer/div[1]/div/div[1]/nav/div/div[2]/ul/li[3]/a")
	private WebElementFacade industryLink;
		
	public void navigateToTSAGOV() {
		this.openAt("https://edit.staging.tsa.gov");
	}

	public boolean verifyMemberText() {
		
		return(memberText.isPresent() );
		}

	public void enterUsername(String username) {
		usernameBox.type(username);
	}
	
	public void enterPassword(String password)  {
		passwordBox.type(password);
		
	}
	
	public TSAGOVMemberPage login() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(1000);
		return this.switchToPage(TSAGOVMemberPage.class);
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

	public WebElementFacade expectedText() {
		return (memberText);
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
	
	public TSAGOVIndustryPage navigateToIndustry() {
		industryLink.click();
		return this.switchToPage(TSAGOVIndustryPage.class);
	}

	
}
	
	

;