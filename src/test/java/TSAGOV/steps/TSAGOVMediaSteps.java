package TSAGOV.steps;

import java.util.List;

import TSAGOV.pages.Home.TSAGOVHomePage;
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
import net.serenitybdd.core.pages.WebElementFacade;
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
	public String verifyMediaText() {
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
	public String verifyMediaRoomText() {
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
	public String verifyPressReleasesText() {
		return tSAGOVPressReleasesPage.verifyPressReleasesText();
	}

	@Step
	public void pressReleaseSerchText(String year, String month, String pressReleases, String topic) {
		tSAGOVPressReleasesPage.pressReleaseSerchText(year, month, pressReleases, topic);

	}

	public List<WebElementFacade> pressReleasefaqResultList() {
		return tSAGOVPressReleasesPage.pressReleasefaqResultList();
	}

	/***********************************************
	 * Steps for TSAGOVBlogPage
	 ***********************************************/
	@Step
	public String verifyBlogText() {
		return tSAGOVBlogPage.verifyBlogText();
	}

	@Step
	public void enterSearchText(String searchItem, String year) {
		tSAGOVBlogPage.enterSearchText(searchItem, year);
	}

	@Step
	public List<WebElementFacade> searchResultList() {

		return tSAGOVBlogPage.searchResultList();
	}

	/***********************************************
	 * Steps for TSAGOVFactsheetsPage
	 ***********************************************/
	@Step
	public String verifyFactsheetsText() {
		return tSAGOVFactsheetsPage.verifyFactsheetsText();
	}

	/***********************************************
	 * Steps for TSAGOVSocialMediaPage
	 ***********************************************/
	@Step
	public String verifySocialMediaText() {
		return tSAGOVSocialMediaPage.verifySocialMediaText();
	}

	/***********************************************
	 * Steps for TSAGOVSpeechesPage
	 ***********************************************/
	@Step
	public String verifySpeechesText() {
		return tSAGOVSpeechesPage.verifySpeechesText();
	}

	@Step
	public void speechesSerchText(String year, String month) {
		tSAGOVSpeechesPage.speechesSerchText(year, month);

	}

	@Step
	public List<WebElementFacade> speechesResultList() {
		return tSAGOVSpeechesPage.speechesResultList();
	}

	/***********************************************
	 * Steps for TSAGOVStatementsPage
	 ***********************************************/
	@Step
	public String verifyStatementsText() {
		return tSAGOVStatementsPage.verifyStatementsText();
	}

	/***********************************************
	 * Steps for TSAGOVTestimonyPage
	 ***********************************************/
	@Step
	public String verifyTestimonyText() {

		return tSAGOVTestimonyPage.verifyTestimonyText();
	}

	@Step
	public void testimonySerchText(String year, String month) {
		tSAGOVTestimonyPage.testimonySerchText(year, month);
	}

	@Step
	public List<WebElementFacade> testimonyResultList() {

		return tSAGOVTestimonyPage.testimonyResultList();
	}

	/***********************************************
	 * Steps for TSAGOVVideoPage
	 ***********************************************/
	@Step
	public boolean verifyVideoBanner() {
		return tSAGOVVideoPage.verifyVideoBanner();
	}

}
