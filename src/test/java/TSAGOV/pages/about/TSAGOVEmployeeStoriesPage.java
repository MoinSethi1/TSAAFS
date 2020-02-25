package TSAGOV.pages.about;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVEmployeeStoriesPage extends TSAGOVAboutPage{

	
	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade employeeStoriesText;
	
	public boolean verifyEmployeeStoriesText() {
		return employeeStoriesText.isPresent();
	}
}
