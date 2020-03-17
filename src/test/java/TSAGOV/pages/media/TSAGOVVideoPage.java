package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVVideoPage extends TSAGOVMediaPage {

	@FindBy(css = "#media-node-content")
	// *[@id="media-node-content"]
	private WebElementFacade videoBanner;

	public boolean verifyVideoBanner() {
		return videoBanner.isPresent();
	}

}
