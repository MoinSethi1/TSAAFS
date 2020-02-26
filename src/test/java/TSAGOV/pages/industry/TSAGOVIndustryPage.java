package TSAGOV.pages.industry;

import TSAGOV.pages.TSAGOVBasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVIndustryPage extends TSAGOVBasePage {

	@FindBy (css ="#block-tsa-gov-pagetitle > h1")
	private WebElementFacade industryText;
	
	@FindBy (css ="//*[@id=\"block-mainpagecontent\"]/div/div/div[1]/div/div/div[2]/div/section/div/div/div[1]/div/div[2]/a")
	private WebElementFacade cargoProgramsLink;
	
	public boolean verifyIndustryText() {
		return industryText.isPresent();
	}
	
	public TSAGOVCargoProgramsPage navigateToCargoPrograms() {
		cargoProgramsLink.click();
		return this.switchToPage(TSAGOVCargoProgramsPage.class);
	}
	
}
