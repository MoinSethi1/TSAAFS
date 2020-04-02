package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVSchedulePage extends TSAGOVTSAPrecheckPage {

	@FindBy(xpath = "//*[@id='block-tsa-gov-pagetitle']/h1/span")
	private WebElementFacade scheduleText;

	@FindBy(xpath = "//input[@id='edit-airport']")
	private WebElementFacade airportBox;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	@FindBy(xpath = "//*[@id=\"edit_day_chosen\"]/a/div/b")

	private WebElementFacade dayExpand;

	String daySelectionBaseCss = "#edit_day_chosen > div > ul";
	// #edit_day_chosen > div > ul > li:nth-child(1)

	@FindBy(xpath = "//*[@id=\"edit_time_chosen\"]/a/div/b")
	private WebElementFacade timeExpand;

	String timeSelectionBaseCss = "#edit_time_chosen > div > ul";
	// #edit_time_chosen > div > ul > li:nth-child(1)

	@FindBy(xpath = "//*[@id=\"edit-submit\"]")
	// *[@id="edit-submit--2"]
	private WebElementFacade applyButton;

	public String verifyScheduleText() {
		return scheduleText.getText();

	}

	public void scheduleSerchText(String searchItem, String day, String time) {
		airportBox.type(searchItem);
		dayExpand.click();

		switch (day) {
		case "Sunday":
			String SCss = daySelectionBaseCss + "> li:nth-child(1)";
			findBy(SCss).click();
			break;
		case "Monday":
			String MCss = daySelectionBaseCss + "> li:nth-child(2)";
			findBy(MCss).click();
			break;
		case "Tuesday":
			String tCss = daySelectionBaseCss + "> li:nth-child(3)";
			findBy(tCss).click();
			break;
		case "Wednesday":
			String wCss = daySelectionBaseCss + "> li:nth-child(4)";
			findBy(wCss).click();
			break;
		case "Thursday":
			String thCss = daySelectionBaseCss + "> li:nth-child(5)";
			findBy(thCss).click();
			break;
		case "Friday":
			String fCss = daySelectionBaseCss + "> li:nth-child(6)";
			findBy(fCss).click();
			break;
		case "Saturday":
			String saCss = daySelectionBaseCss + "> li:nth-child(7)";
			findBy(saCss).click();
			break;
		}

		timeExpand.click();
		switch (time) {
		case "12am - 1am":
			String Css1 = timeSelectionBaseCss + "> li:nth-child(1)";
			findBy(Css1).click();
			break;
		case "1am - 2am":
			String Css2 = timeSelectionBaseCss + "> li:nth-child(2)";
			findBy(Css2).click();
			break;
		case "2am - 3am":
			String Css3 = timeSelectionBaseCss + "> li:nth-child(3)";
			findBy(Css3).click();
			break;
		case "3am - 4am":
			String Css4 = timeSelectionBaseCss + "> li:nth-child(4)";
			findBy(Css4).click();
			break;
		case "4am - 5am":
			String Css5 = timeSelectionBaseCss + "> li:nth-child(5)";
			findBy(Css5).click();
			break;
		case "5am - 6am":
			String Css6 = timeSelectionBaseCss + "> li:nth-child(6)";
			findBy(Css6).click();
			break;
		case "6am - 7am":
			String Css7 = timeSelectionBaseCss + "> li:nth-child(7)";
			findBy(Css7).click();
			break;
		case "7am - 8am":
			String Css8 = timeSelectionBaseCss + "> li:nth-child(8)";
			findBy(Css8).click();
			break;
		case "8am - 9am":
			String Css9 = timeSelectionBaseCss + "> li:nth-child(9)";
			findBy(Css9).click();
			break;
		case "9am - 10am":
			String Css10 = timeSelectionBaseCss + "> li:nth-child(10)";
			findBy(Css10).click();
			break;
		case "10am - 11am":
			String Css11 = timeSelectionBaseCss + "> li:nth-child(11)";
			findBy(Css11).click();
			break;
		case "11am - 12pm":
			String Css12 = timeSelectionBaseCss + "> li:nth-child(12)";
			findBy(Css12).click();
			break;
		case "12pm - 1pm":
			String Css13 = timeSelectionBaseCss + "> li:nth-child(13)";
			findBy(Css13).click();
			break;
		case "2pm - 3pm":
			String Css14 = timeSelectionBaseCss + "> li:nth-child(14)";
			findBy(Css14).click();
			break;
		case "3pm - 4pm":
			String Css15 = timeSelectionBaseCss + "> li:nth-child(15)";
			findBy(Css15).click();
			break;
		case "4pm - 5pm":
			String Css16 = timeSelectionBaseCss + "> li:nth-child(16)";
			findBy(Css16).click();
			break;
		case "5pm - 6pm":
			String Css17 = timeSelectionBaseCss + "> li:nth-child(17)";
			findBy(Css17).click();
			break;
		case "6pm - 7pm":
			String Css18 = timeSelectionBaseCss + "> li:nth-child(18)";
			findBy(Css18).click();
			break;
		case "7pm - 8pm":
			String Css19 = timeSelectionBaseCss + "> li:nth-child(19)";
			findBy(Css19).click();
			break;
		case "8pm - 9pm":
			String Css20 = timeSelectionBaseCss + "> li:nth-child(20)";
			findBy(Css20).click();
			break;
		case "10pm - 11pm":
			String Css21 = timeSelectionBaseCss + "> li:nth-child(21)";
			findBy(Css21).click();
			break;
		case "11pm - 12am":
			String Css22 = timeSelectionBaseCss + "> li:nth-child(22)";
			findBy(Css22).click();
			break;

		}

	}

	public WebElementFacade scheduleResultList() {
		applyButton.click();
		spinner.waitUntilNotVisible();
		WebElementFacade result = findBy("//*[@id='precheck-checkpoint-schedule-results']/table/tbody");
		// #precheck-checkpoint-schedule-results > table > tbody
		// //*[@id="precheck-checkpoint-schedule-results"]/table/tbody
		return result;
	}

}
