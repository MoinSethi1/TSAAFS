package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://edit.staging.tsa.gov/travel")

public class TSAGOVTravelPage extends TSAGOVBasePage {

	
	
	@FindBy (xpath ="//a[@href='/precheck']")
	private WebElementFacade tsaPreLink;
	
	public TSAGOVTSAPrePage navigateToTSAPre() {
		tsaPreLink.click();
		return this.switchToPage(TSAGOVTSAPrePage.class);
	}
	
}
