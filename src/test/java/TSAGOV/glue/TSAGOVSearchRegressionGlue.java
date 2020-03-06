package TSAGOV.glue;

import java.util.List;

import TSAGOV.steps.TSAGOVAboutSteps;
import TSAGOV.steps.TSAGOVHomeSteps;
import TSAGOV.steps.TSAGOVMediaSteps;
import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

public class TSAGOVSearchRegressionGlue {

	@Steps
	TSAGOVTravelSteps userT;
	@Steps
	TSAGOVMediaSteps userM;
	@Steps
	TSAGOVAboutSteps userA;
	@Steps
	TSAGOVHomeSteps userH;

	@Given("^user wants to perform search operation$")
	public void user_wants_to_perform_search_operation() {

	}

	@When("^user access the (.*) page$")
	public void user_access_What_Can_I_Bring_page(String searchPage) throws InterruptedException {
		switch (searchPage) {
		case "What Can I Bring":
			userT.navigateToTSAGOV();
			userT.navigateToWhatCanIBring();
			break;
		case "Blog":
			userM.navigateToTSAGOV();
			userM.navigateToMediaRoom();
			userM.navigateToBlog();
			break;

		case "Testimony":
			userM.navigateToTSAGOV();
			userM.navigateToMediaRoom();
			userM.navigateToTestimony();
			break;

		case "Speeches":
			userM.navigateToTSAGOV();
			userM.navigateToMediaRoom();
			userM.navigateToSpeeches();
			break;

		case "Employee Stories":
			userA.navigateToTSAGOV();
			userA.navigateToAbout();
			userA.navigateToEmployeeStories();
			break;

		case "FAQ":
			userT.navigateToTSAGOV();
			userT.navigateToTSATravel();
			userT.navigateToTravelFAQ();
			break;

		case "TSA Pre FAQ":
			userT.navigateToTSAGOV();
			userT.navigateToTSATravel();
			userT.tsaPreCheckExpand();
			userT.navigateToFaq();
			break;

		case "Press Releases":
			userM.navigateToTSAGOV();
			userM.navigateToMediaRoom();
			userM.navigateToPressReleases();
			break;

		case "Travel Tips":
			userT.navigateToTSAGOV();
			userT.navigateToTSATravel();
			userT.navigateToTravelTips();
			break;

		case "A-Z Index":
			userH.navigateToTSAGOV();
			userH.navigateToAToZFooterLink();
			break;

		case "Schedule":
			userT.navigateToTSAGOV();
			userT.navigateToTSATravel();
			userT.tsaPreCheckExpand();
			userT.navigateToScedule();
			break;

		case "Airport Airlines":
			userT.navigateToTSAGOV();
			userT.navigateToTSATravel();
			userT.tsaPreCheckExpand();
			userT.navigateToAirportsAirlines();
			break;
		}
	}

	@When("^user searches on page (.*) for text (.*), year (.*), month (.*), category (.*), Press Releases (.*), topic (.*), day (.*), time (.*)$")
	public void user_enters_Food(String searchPage, String searchItem, String year, String month, String category,
			String pressReleases, String topic, String day, String time) throws InterruptedException {
		System.out.println(searchPage);
		System.out.println(searchItem);
		switch (searchPage) {
		case "What Can I Bring":
			userT.enterSearchText(searchItem);
			break;
		case "Blog":
			userM.enterSearchText(searchItem, year);
			break;
		case "Testimony":
			userM.testimonySerchText(year, month);
			break;

		case "Speeches":
			userM.speechesSerchText(year, month);
			break;

		case "Employee Stories":
			userA.empSerchText(year, month, category);
			break;

		case "FAQ":
			userT.faqSerchText(searchItem);
			break;

		case "TSA Pre FAQ":
			userT.prefaqSerchText(searchItem);
			break;

		case "Press Releases":
			userM.pressReleaseSerchText(year, month, pressReleases, topic);
			break;

		case "Travel Tips":
			userT.travelTipsSerchText(searchItem);
			break;

		case "A-Z Index":
			userH.aTozSerchText(searchItem);
			break;

		case "Schedule":
			userT.scheduleSerchText(searchItem, day, time);
			break;

		case "Airport Airlines":
			userT.airportSerchText(searchItem);
			break;
		}

	}

	@Then("^search result is displayed on page (.*) with expected text (.*)$")
	public void search_result_is_displayed(String searchPage, String expectedText) {

		switch (searchPage) {

		case "What Can I Bring":
			List<WebElementFacade> listT = userT.searchResultList();
			assert listT.size() > 0;

			assert (listT.get(0).containsText(expectedText) || listT.get(0).containsText(expectedText.toLowerCase()));
			// for (int i = 0; i < listSize; i++) {
			// System.out.println(result.get(i).getText());
			// if (result.get(i).containsText("Food") || result.get(i).containsText("food"))
			// {
			// System.out.println("Success Search Text Found!");
			// } else {
			// System.out.println("No luck this time Try Again!");

			// }
			break;

		case "Blog":
			List<WebElementFacade> listM = userT.searchResultList();
			assert listM.size() > 0;

			assert (listM.get(0).containsText(expectedText) || listM.get(0).containsText(expectedText.toLowerCase()));
			break;

		case "Testimony":
			List<WebElementFacade> listTm = userM.testimonyResultList();
			assert listTm.size() > 0;
			assert (listTm.get(0).containsText(expectedText));
			break;

		case "Speeches":
			List<WebElementFacade> listS = userM.speechesResultList();
			System.out.println("LIST SIZE" + listS.size());
			assert listS.size() > 0;
			assert (listS.get(0).containsText(expectedText));
			break;

		case "Employee Stories":
			List<WebElementFacade> listE = userA.empResultList();
			System.out.println("LIST SIZE" + listE.size());
			assert listE.size() > 0;
			assert (listE.get(0).containsText(expectedText));
			break;

		case "FAQ":
			List<WebElementFacade> listF = userT.faqResultList();
			System.out.println("LIST SIZE" + listF.size());
			assert listF.size() > 0;
			assert (listF.get(0).containsText(expectedText));
			break;

		case "TSA Pre FAQ":
			List<WebElementFacade> listPF = userT.prefaqResultList();
			System.out.println("LIST SIZE" + listPF.size());
			assert listPF.size() > 0;
			assert (listPF.get(0).containsText(expectedText));
			break;

		case "Press Releases":
			List<WebElementFacade> listPR = userM.pressReleasefaqResultList();
			System.out.println("LIST SIZE" + listPR.size());
			assert listPR.size() > 0;
			assert (listPR.get(0).containsText(expectedText));
			break;

		case "Travel Tips":
			List<WebElementFacade> listTT = userT.travelTipsResultList();
			System.out.println("LIST SIZE" + listTT.size());
			assert listTT.size() > 0;
			assert (listTT.get(0).containsText(expectedText));
			break;

		case "A-Z Index":
			List<WebElementFacade> listZ = userH.aTozResultList();
			System.out.println("LIST SIZE" + listZ.size());
			assert listZ.size() > 0;
			assert (listZ.get(0).containsText(expectedText));
			break;

		case "Schedule":
			assert userT.scheduleResultList().containsText(expectedText);
			break;

		case "Airport Airlines":
			assert userT.airportResultList().containsText(expectedText);
			break;
		}
	}
}
