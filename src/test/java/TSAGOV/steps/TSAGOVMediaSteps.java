package TSAGOV.steps;

import TSAGOV.pages.TSAGOVBasePage;
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
	
	TSAGOVBasePage tSAGOVBasePage;
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
	 * Steps for TSAGOVBasePage
	 ***********************************************/
	
@Step
	public void navigateToTSAGOV() {
		tSAGOVBasePage.navigateToTSAGOV();
	}


@Step
public String actualUrl() {
	return tSAGOVBasePage.actualUrl();
	}

	
	public TSAGOVMediaPage navigateToMedia() {
		return tSAGOVBasePage.navigateToMedia();
	}
	
	public TSAGOVMediaRoomPage navigateToMediaRoom() {
		return tSAGOVBasePage.navigateToMediaRoom();
	}
	

	/***********************************************
	 * Steps for TSAGOVMediaPage
	 ***********************************************/
	
	public boolean verifyMediaText() {
		return tSAGOVMediaPage.verifyMediaText();
		}
	
	public TSAGOVSocialMediaPage navigateToSocialMedia() {
		return tSAGOVMediaPage.navigateToSocialMedia();
	}
	
	public TSAGOVBlogPage navigateToBlog() {
		return tSAGOVMediaPage.navigateToBlog();
	}
	
	public TSAGOVVideoPage navigateToVideo() {
		return tSAGOVMediaPage.navigateToVideo();
	}
	
	/***********************************************
	 * Steps for TSAGOVMediaRoomPage
	 ***********************************************/
	
	public boolean verifyMediaRoomText() {
		return tSAGOVMediaRoomPage.verifyMediaRoomText();
	}
	
	public TSAGOVPressReleasesPage navigateToPressReleases() {
		return tSAGOVMediaRoomPage.navigateToPressReleases();
	}
	
	public TSAGOVTestimonyPage navigateToTestimony() {
		return tSAGOVMediaRoomPage.navigateToTestimony();
	}
	
	public TSAGOVSpeechesPage navigateToSpeeches() {
		return tSAGOVMediaRoomPage.navigateToSpeeches();
	}
	
	public TSAGOVStatementsPage navigateTOStatements() {
		return tSAGOVMediaRoomPage.navigateTOStatements();
		
	}
	
	public TSAGOVFactsheetsPage navigateToFactSheets() {
		return tSAGOVMediaRoomPage.navigateToFactSheets();
		
			}
	
		/***********************************************
	 * Steps for TSAGOVPressReleasesPage
	 ***********************************************/
	
	
	public boolean verifyPressReleasesText() {
		return tSAGOVPressReleasesPage.verifyPressReleasesText();
	}
	
	/***********************************************
	 * Steps for TSAGOVBlogPage
	 ***********************************************/
	
	public boolean verifyBlogText() {
		return tSAGOVBlogPage.verifyBlogText();
	}
	

	/***********************************************
	 * Steps for TSAGOVFactsheetsPage
	 ***********************************************/
	
	public boolean verifyFactsheetsText() {
		return tSAGOVFactsheetsPage.verifyFactsheetsText();
	}
	
	/***********************************************
	 * Steps for TSAGOVSocialMediaPage
	 ***********************************************/
	
	public boolean verifySocialMediaText() {
		return tSAGOVSocialMediaPage.verifySocialMediaText();
		}
	
	/***********************************************
	 * Steps for TSAGOVSpeechesPage
	 ***********************************************/
	
	public boolean verifySpeechesText() {
		return tSAGOVSpeechesPage.verifySpeechesText();
	}	
	
	/***********************************************
	 * Steps for TSAGOVStatementsPage
	 ***********************************************/
	public boolean verifyStatementsText() {
		return tSAGOVStatementsPage.verifyStatementsText();
	}
	
	/***********************************************
	 * Steps for TSAGOVTestimonyPage
	 ***********************************************/
	
	public boolean verifyTestimonyText() {
		
		return tSAGOVTestimonyPage.verifyTestimonyText();
	}
	
	/***********************************************
	 * Steps for TSAGOVVideoPage
	 ***********************************************/
	
	public boolean verifyVideoBanner() {
		return tSAGOVVideoPage.verifyVideoBanner();
	}
	
}
