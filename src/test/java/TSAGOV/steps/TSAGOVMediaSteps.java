package TSAGOV.steps;

import TSAGOV.pages.Home.TSAGOVHomePage;
import TSAGOV.pages.about.TSAGOVAboutPage;
import TSAGOV.pages.media.TSAGOVBlogPage;
import TSAGOV.pages.media.TSAGOVFactsheetsPage;
import TSAGOV.pages.media.TSAGOVMediaPage;
import TSAGOV.pages.media.TSAGOVMediaRoomPage;
import TSAGOV.pages.media.TSAGOVPressReleasesPage;
import TSAGOV.pages.media.TSAGOVSocialMediaPage;
import TSAGOV.pages.media.TSAGOVSpeechesPage;
import TSAGOV.pages.media.TSAGOVStatementsPage;
import TSAGOV.pages.media.TSAGOVTestimonyPage;
import TSAGOV.pages.media.TSAGOVVideoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TSAGOVMediaSteps extends ScenarioSteps {
	
	TSAGOVHomePage tSAGOVHomePage;
	TSAGOVMediaPage tSAGOVMediaPage;
	TSAGOVMediaRoomPage tSAGOVMediaRoomPage;
	TSAGOVPressReleasesPage tSAGOVPressReleasesPage;
	TSAGOVBlogPage tSAGOVBlogPage;
	TSAGOVFactsheetsPage tSAGOVFactsheetsPage;
	TSAGOVSocialMediaPage tSAGOVSocialMediaPage;
	TSAGOVSpeechesPage tSAGOVSpeechesPage;
	TSAGOVStatementsPage tSAGOVStatementsPage;
	TSAGOVTestimonyPage tSAGOVTestimonyPage;
	TSAGOVVideoPage tSAGOVVideoPage;
	
	/***********************************************
	 * Steps for TSAGOVHomePage
	 ***********************************************/
	
@Step
	public void navigateToTSAGOV() {
		tSAGOVHomePage.navigateToTSAGOV();
	}


@Step
public String actualUrl() {
	return tSAGOVHomePage.actualUrl();
	}

@Step	
	public TSAGOVMediaPage navigateToMedia() {
		return tSAGOVHomePage.navigateToMedia();
	}
	
@Step
	public TSAGOVMediaRoomPage navigateToMediaRoom() {
		return tSAGOVHomePage.navigateToMediaRoom();
	}
	

	/***********************************************
	 * Steps for TSAGOVMediaPage
	 ***********************************************/
@Step
	public boolean verifyMediaText() {
		return tSAGOVMediaPage.verifyMediaText();
		}
@Step
	public TSAGOVSocialMediaPage navigateToSocialMedia() {
		return tSAGOVMediaPage.navigateToSocialMedia();
	}
@Step
	public TSAGOVBlogPage navigateToBlog() {
		return tSAGOVMediaPage.navigateToBlog();
	}
@Step
	public TSAGOVVideoPage navigateToVideo() {
		return tSAGOVMediaPage.navigateToVideo();
	}
	
	/***********************************************
	 * Steps for TSAGOVMediaRoomPage
	 ***********************************************/
@Step
	public boolean verifyMediaRoomText() {
		return tSAGOVMediaRoomPage.verifyMediaRoomText();
	}
@Step	
	public TSAGOVPressReleasesPage navigateToPressReleases() {
		return tSAGOVMediaRoomPage.navigateToPressReleases();
	}
@Step
	public TSAGOVTestimonyPage navigateToTestimony() {
		return tSAGOVMediaRoomPage.navigateToTestimony();
	}
@Step
	public TSAGOVSpeechesPage navigateToSpeeches() {
		return tSAGOVMediaRoomPage.navigateToSpeeches();
	}
@Step	
	public TSAGOVStatementsPage navigateTOStatements() {
		return tSAGOVMediaRoomPage.navigateTOStatements();
		
	}
@Step	
	public TSAGOVFactsheetsPage navigateToFactSheets() {
		return tSAGOVMediaRoomPage.navigateToFactSheets();
		
			}
	
		/***********************************************
	 * Steps for TSAGOVPressReleasesPage
	 ***********************************************/
	
@Step	
	public boolean verifyPressReleasesText() {
		return tSAGOVPressReleasesPage.verifyPressReleasesText();
	}
	
	/***********************************************
	 * Steps for TSAGOVBlogPage
	 ***********************************************/
@Step
	public boolean verifyBlogText() {
		return tSAGOVBlogPage.verifyBlogText();
	}
	

	/***********************************************
	 * Steps for TSAGOVFactsheetsPage
	 ***********************************************/
@Step
	public boolean verifyFactsheetsText() {
		return tSAGOVFactsheetsPage.verifyFactsheetsText();
	}
	
	/***********************************************
	 * Steps for TSAGOVSocialMediaPage
	 ***********************************************/
@Step
	public boolean verifySocialMediaText() {
		return tSAGOVSocialMediaPage.verifySocialMediaText();
		}
	
	/***********************************************
	 * Steps for TSAGOVSpeechesPage
	 ***********************************************/
@Step
	public boolean verifySpeechesText() {
		return tSAGOVSpeechesPage.verifySpeechesText();
	}	
	
	/***********************************************
	 * Steps for TSAGOVStatementsPage
	 ***********************************************/
@Step
	public boolean verifyStatementsText() {
		return tSAGOVStatementsPage.verifyStatementsText();
	}
	
	/***********************************************
	 * Steps for TSAGOVTestimonyPage
	 ***********************************************/
@Step
	public boolean verifyTestimonyText() {
		
		return tSAGOVTestimonyPage.verifyTestimonyText();
	}
	
	/***********************************************
	 * Steps for TSAGOVVideoPage
	 ***********************************************/
@Step
	public boolean verifyVideoBanner() {
		return tSAGOVVideoPage.verifyVideoBanner();
	}
	
}
