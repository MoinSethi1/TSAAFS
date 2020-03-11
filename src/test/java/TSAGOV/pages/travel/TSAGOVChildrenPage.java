package TSAGOV.pages.travel;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVChildrenPage extends TSAGOVSpecialProceduresPage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade childrenText;

	public String verifyChildrenText() {
		return childrenText.getText();

	}
}
