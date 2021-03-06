package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVDisabilitiesAndMedicalPage extends TSAGOVSpecialProceduresPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade disabilitiesAndMedicalText;

	public String verifyDisabilitiesAndMedcalText() {
		return disabilitiesAndMedicalText.getText();

	}

}
