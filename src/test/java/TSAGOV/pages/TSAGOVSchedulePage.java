package TSAGOV.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVSchedulePage extends TSAGOVTSAPrePage {
	
	@FindBy (xpath = "//*[@id='block-tsa-gov-pagetitle']/h1/span")
	
	private WebElementFacade scheduleText;
	
	
	public boolean verifyScheduleText() {
		return scheduleText.isPresent();
		
	}

}
