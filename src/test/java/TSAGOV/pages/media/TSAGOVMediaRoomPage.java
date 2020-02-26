package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVMediaRoomPage extends TSAGOVMediaPage {

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade mediaRoomText;
	
	//@FindBy (xpath ="//*[@id=\"//*[@id=\"block-media-sidebar\"]/nav[1]/ul/li[1]/div/button")
			//private WebElementFacade mediaRoomExpand;
	
	@FindBy (css ="#block-media-sidebar > nav.max-tablet-hidden > ul > li:nth-child(1) > div > button")
	private WebElementFacade mediaRoomExpand;
	
	@FindBy (xpath ="//*[@id=\"sidenav_sublist_1\"]/li[1]/a")
	private WebElementFacade pressReleasesLink;
	
	@FindBy (css ="#sidenav_sublist_1 > li:nth-child(2) > a")
	private WebElementFacade testimonyLink;
	
	@FindBy (css ="#sidenav_sublist_1 > li:nth-child(3) > a")
	private WebElementFacade speechesLink;
	
	@FindBy (css ="#sidenav_sublist_1 > li:nth-child(4) > a")
	private WebElementFacade statementsLink;
	
	@FindBy (css ="#sidenav_sublist_1 > li:nth-child(5) > a")
	private WebElementFacade factsheetsLink;
	
	public boolean verifyMediaRoomText() {
		return mediaRoomText.isPresent();
	}
	
	public TSAGOVPressReleasesPage navigateToPressReleases() {
		mediaRoomExpand.waitUntilEnabled().click();
		pressReleasesLink.click();
		return this.switchToPage(TSAGOVPressReleasesPage.class);
	}
	
	
	public TSAGOVTestimonyPage navigateToTestimony() {
		mediaRoomExpand.waitUntilEnabled().click();
		testimonyLink.click();
		return this.switchToPage(TSAGOVTestimonyPage.class);
	}
	
	public TSAGOVSpeechesPage navigateToSpeeches() {
		mediaRoomExpand.waitUntilEnabled().click();
		speechesLink.click();
		return this.switchToPage(TSAGOVSpeechesPage.class);
	}
	
	public TSAGOVStatementsPage navigateTOStatements() {
		mediaRoomExpand.waitUntilEnabled().click();
		statementsLink.click();
		return this.switchToPage(TSAGOVStatementsPage.class);
		
	}
	
	public TSAGOVFactsheetsPage navigateToFactSheets() {
		mediaRoomExpand.waitUntilEnabled().click();
		factsheetsLink.click();
		return this.switchToPage(TSAGOVFactsheetsPage.class);
		
			}
}
