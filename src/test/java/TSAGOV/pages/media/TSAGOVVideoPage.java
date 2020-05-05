package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVVideoPage extends TSAGOVMediaPage {

	@FindBy(css = "#media-node-content")
	// *[@id="media-node-content"]
	private WebElementFacade videoBanner;
	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade videoText;

	public boolean verifyVideoBanner() {
		return videoBanner.isPresent();
	}

	public String verifyVideoText() {
		return videoText.getText();
	}

}
