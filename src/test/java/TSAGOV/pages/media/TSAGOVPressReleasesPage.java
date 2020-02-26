package TSAGOV.pages.media;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVPressReleasesPage extends TSAGOVMediaPage {
	
@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
private WebElementFacade pressReleasesText;

public boolean verifyPressReleasesText() {
	return pressReleasesText.isPresent();
}

}
