package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVTestimonyPage extends TSAGOVMediaPage {
	
	@FindBy (css = "#block-tsa-gov-pagetitle > h1")
	private WebElementFacade testimonyText;
	
public boolean verifyTestimonyText() {
	
	return testimonyText.isPresent();
}
}
