package TSAGOV.pages.media;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVPressReleasesPage extends TSAGOVMediaPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade pressReleasesText;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	@FindBy(xpath = "//select[@name='field_press_release_date_year']")
	private WebElementFacade yearSelect;

	@FindBy(xpath = "//select[@name='field_press_release_date_month']")
	private WebElementFacade monthSelect;

	@FindBy(xpath = "//select[@name='field_national_local_value']")
	private WebElementFacade pressReleaseSelect;

	@FindBy(xpath = "//select[@name='tid']")
	private WebElementFacade topicSelect;

	@FindBy(xpath = "//input[@class='button js-form-submit form-submit usa-button']")
	private WebElementFacade applyButton;

	public boolean verifyPressReleasesText() {
		return pressReleasesText.isPresent();
	}

	public void pressReleaseSerchText(String year, String month, String pressReleases, String topic) {
		yearSelect.selectByVisibleText(year);
		monthSelect.selectByVisibleText(month);
		pressReleaseSelect.selectByVisibleText(pressReleases);
		topicSelect.selectByVisibleText(topic);

	}

	public List<WebElementFacade> pressReleasefaqResultList() {
		applyButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-row']");
		return result;
	}

}
