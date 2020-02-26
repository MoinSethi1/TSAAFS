package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVBlogPage extends TSAGOVMediaPage {

	@FindBy (css ="#block-tsa-gov-pagetitle > h1")
		private WebElementFacade blogText;
	
	
	public boolean verifyBlogText() {
		return blogText.isPresent();
	}
}
