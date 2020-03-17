package TSAGOV.pages.media;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTestimonyPage extends TSAGOVMediaPage {

	@FindBy(css = "#block-tsa-gov-pagetitle > h1")
	private WebElementFacade testimonyText;

	@FindBy(xpath = "//select[@id='edit-field-press-release-date-year']")
	private WebElementFacade yearSelect;

	@FindBy(xpath = "//select[@id='edit-field-press-release-date-month']")
	private WebElementFacade monthSelect;

	@FindBy(xpath = "//input[@id='edit-submit-media-room']")
	private WebElementFacade applyButton;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	public String verifyTestimonyText() {

		return testimonyText.getText();
	}

	public void testimonySerchText(String year, String month) {
		yearSelect.selectByVisibleText(year);
		monthSelect.selectByVisibleText(month);

	}

	public List<WebElementFacade> testimonyResultList() {
		applyButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-field-long-title']");

		return result;
	}
}
