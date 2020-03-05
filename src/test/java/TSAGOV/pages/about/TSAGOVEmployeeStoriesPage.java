package TSAGOV.pages.about;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVEmployeeStoriesPage extends TSAGOVAboutPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade employeeStoriesText;

	@FindBy(xpath = "//select[@id='edit-field-press-release-date-year']")
	private WebElementFacade yearSelect;

	@FindBy(xpath = "//select[@id='edit-field-press-release-date-month']")
	private WebElementFacade monthSelect;

	@FindBy(xpath = "//select[@id='edit-tid']")
	private WebElementFacade categorySelect;

	@FindBy(xpath = "//input[@id='edit-submit-employee-stories']")
	private WebElementFacade applyButton;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	public String verifyEmployeeStoriesText() {
		return employeeStoriesText.getText();
	}

	public void empSerchText(String year, String month, String category) {
		yearSelect.selectByVisibleText(year);
		monthSelect.selectByVisibleText(month);
		categorySelect.selectByVisibleText(category);

	}

	public List<WebElementFacade> empResultList() {
		applyButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-nothing']");

		return result;
	}
}
