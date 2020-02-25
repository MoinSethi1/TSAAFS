package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVFAQPage extends TSAGOVTSAPrePage{
	
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade faqText;
	
	public boolean verifyFaqText() {
		return faqText.isPresent();
	}

}
