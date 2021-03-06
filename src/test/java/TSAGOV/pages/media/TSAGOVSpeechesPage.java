package TSAGOV.pages.media;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVSpeechesPage extends TSAGOVMediaPage {

	@FindBy(css = "#block-tsa-gov-pagetitle > h1")
	private WebElementFacade speechesText;

	public String verifySpeechesText() {
		return speechesText.getText();
	}

	@FindBy(xpath = "//select[@id='edit-field-press-release-date-year']")
	private WebElementFacade yearSelect;

	@FindBy(xpath = "//select[@id='edit-field-press-release-date-month']")
	private WebElementFacade monthSelect;

	@FindBy(xpath = "//input[@id='edit-submit-media-room']")
	private WebElementFacade applyButton;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	public void speechesSerchText(String year, String month) {
		yearSelect.selectByVisibleText(year);
		monthSelect.selectByVisibleText(month);

	}

	public List<WebElementFacade> speechesResultList() {
		applyButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-title']");

		return result;
	}
}
