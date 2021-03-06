package TSAGOV.pages.contact;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVCustomerServicePage extends TSAGOVContactPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade customerServiceText;

	public String verifyCustomerServiceText() {
		return customerServiceText.getText();
	}

}
