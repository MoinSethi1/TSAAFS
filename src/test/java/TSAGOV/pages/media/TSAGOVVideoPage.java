package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVVideoPage extends TSAGOVMediaPage{
	
	@FindBy (css ="#media-node-content > div.media-video.desktop\\:grid-col-6")
	private WebElementFacade videoBanner;
	
	public boolean verifyVideoBanner() {
		return videoBanner.isPresent();
	}

}
