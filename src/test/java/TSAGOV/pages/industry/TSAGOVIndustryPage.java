package TSAGOV.pages.industry;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVIndustryPage extends TSAGOVHomePage {

	@FindBy (css ="#block-tsa-gov-pagetitle > h1")
	private WebElementFacade industryText;
	
	@FindBy (xpath ="//*[@id=\"block-mainpagecontent\"]/div/div/div[1]/div/div/div[2]/div/section/div/div/div[1]/div/div[2]/a")
	//*[@id="block-mainpagecontent"]/div/div/div[1]/div/div/div[2]/div/section/div/div/div[1]/div/div[2]/a
	private WebElementFacade cargoProgramsLink;
	
	public String verifyIndustryText() {
		return industryText.getText();
	}
	
	public TSAGOVCargoProgramsPage navigateToCargoPrograms() {
		cargoProgramsLink.click();
		return this.switchToPage(TSAGOVCargoProgramsPage.class);
	}
	
}
