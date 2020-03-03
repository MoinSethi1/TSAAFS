package TSAGOV.pages.Home;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVWebMetricsPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade metricText;

	public String verifyMetricsText() {
		return metricText.getText();
	}

}
