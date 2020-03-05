package TSAGOV.glue;

import java.util.List;

import TSAGOV.steps.TSAGOVAboutSteps;
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

	@Given("^user wants to perform search operation$")
	public void user_wants_to_perform_search_operation() {

	}

	@When("^user access (.*) page$")
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
			userT.navigateToFaq();
			break;
		}
	}

	@When("^user searches on page (.*) for text (.*), year (.*), month (.*), category (.*)$")
	public void user_enters_Food(String searchPage, String searchItem, String year, String month, String category)
			throws InterruptedException {
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

		}

	}

	@Then("^search result is displayed on page (.*) for text (.*), year(.*), month (.*)$")
	public void search_result_is_displayed(String searchPage, String searchItem, String year, String month) {

		switch (searchPage) {

		case "What Can I Bring":
			List<WebElementFacade> listT = userT.searchResultList();
			assert listT.size() > 0;
			System.out.println(searchItem);
			assert (listT.get(0).containsText(searchItem) || listT.get(0).containsText(searchItem.toLowerCase()));
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
			System.out.println(searchItem);
			assert (listM.get(0).containsText(searchItem)
					|| listM.get(0).containsText(searchItem.toLowerCase()) && listM.get(0).containsText(year));
			break;

		case "Testimony":
			List<WebElementFacade> listTm = userM.testimonyResultList();
			assert listTm.size() > 0;
			assert (listTm.get(0).containsText(searchItem));
			break;

		case "Speeches":
			List<WebElementFacade> listS = userM.speechesResultList();
			System.out.println("LIST SIZE" + listS.size());
			assert listS.size() > 0;
			assert (listS.get(0).containsText(searchItem));
			break;

		case "Employee Stories":
			List<WebElementFacade> listE = userA.empResultList();
			System.out.println("LIST SIZE" + listE.size());
			assert listE.size() > 0;
			assert (listE.get(0).containsText(searchItem));
			break;

		case "FAQ":
			List<WebElementFacade> listF = userT.faqResultList();
			System.out.println("LIST SIZE" + listF.size());
			assert listF.size() > 0;
			assert (listF.get(2).containsText(searchItem));
			break;

		case "TSA PreFAQ":
			List<WebElementFacade> listPF = userT.prefaqResultList();
			System.out.println("LIST SIZE" + listPF.size());
			assert listPF.size() > 0;
			assert (listPF.get(2).containsText("TSA Pre✓® for Military Members"));
			break;

		}
	}
}
