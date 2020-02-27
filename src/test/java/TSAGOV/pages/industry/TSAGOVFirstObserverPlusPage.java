package TSAGOV.pages.industry;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVFirstObserverPlusPage extends TSAGOVIndustryPage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade firstObserverPlusText;
	
	
	public String verifyFirstObserverPlusText() {
		System.out.println(firstObserverPlusText.getText());
		return firstObserverPlusText.getText();
	}
	
}
