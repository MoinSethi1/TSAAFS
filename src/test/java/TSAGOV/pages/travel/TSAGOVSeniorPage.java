package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class TSAGOVSeniorPage extends TSAGOVSpecialProceduresPage{
	
	@FindBy (xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1/span")
	private WebElementFacade seniorText;
	
	public boolean verifySeniorText() {
		return seniorText.isPresent();
	}

}
