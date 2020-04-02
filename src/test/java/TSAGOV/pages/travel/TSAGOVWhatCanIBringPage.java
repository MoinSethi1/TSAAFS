package TSAGOV.pages.travel;

import java.util.List;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://preview.tsa.gov/travel/security-screening/whatcanibring/all")

public class TSAGOVWhatCanIBringPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")

	private WebElementFacade whatCanIBringText;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent\"]/div/div/div[2]/div/div/div[1]/div/div[1]/article/div/div/h3/a")
	private WebElementFacade allItemsLink;

	@FindBy(xpath = "//a[@href = '/travel/security-screening/whatcanibring/flammables']")
	private WebElementFacade flammablesLink;

	@FindBy(xpath = "//a[@href = '/travel/security-screening/whatcanibring/firearms']")
	private WebElementFacade firearmsLink;

	@FindBy(xpath = "//a[@href ='/travel/security-screening/whatcanibring/food']")
	private WebElementFacade foodLink;

	@FindBy(xpath = "//a[@href = '/travel/security-screening/whatcanibring/household-and-tools']")
	private WebElementFacade householdToolsLink;

	@FindBy(xpath = "//a[@href = '/travel/security-screening/whatcanibring/medical']")
	private WebElementFacade medicalLink;

	@FindBy(xpath = "//a[@href = '/travel/security-screening/whatcanibring/sharp-objects']")
	private WebElementFacade sharpObjectsLink;

	@FindBy(xpath = "//a[@href = '/travel/security-screening/whatcanibring/sporting-and-camping']")
	private WebElementFacade sportingCampingLink;

	@FindBy(xpath = "//a[@href = '/travel/security-screening/whatcanibring/miscellaneous']")
	private WebElementFacade miscellaneousLink;

	@FindBy(xpath = "//input[@title='Search keywords']")
	private WebElementFacade searchBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElementFacade searchButton;

	@FindBy(xpath = "//div[@class ='ajax-progress ajax-progress-fullscreen")
	private WebElementFacade spinner;

	public List<WebElementFacade> searchResultList() {
		searchButton.click();
		spinner.waitUntilNotVisible();
		List<WebElementFacade> result = findAll("//div[@class='views-field views-field-nothing']");

		return result;
	}

	public String verifyWhatCanIBringText() {

		return whatCanIBringText.getText();
	}

	public TSAGOVWhatCanIBringAllItemsPage navigateToAll() {

		allItemsLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringAllItemsPage.class);

	}

	// public boolean verifyWhatCanIBringText() {
	// return whatCanIBringText.isPresent();
	// }

	public TSAGovWhatCanIBringFlammablesPage navigateToFlammables() {
		flammablesLink.waitUntilClickable().click();
		return this.switchToPage(TSAGovWhatCanIBringFlammablesPage.class);

	}

	public TSAGOVWhatCanIBringFirearmsPage navigateToFirearms() {
		firearmsLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringFirearmsPage.class);

	}

	public TSAGOVWhatCanIBringFoodPage navigateToFood() {
		foodLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringFoodPage.class);
	}

	public TSAGOVWharCanIBringHouseholdToolsPage navigateToHouseholdTools() {
		householdToolsLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWharCanIBringHouseholdToolsPage.class);

	}

	public TSAGOVWhatCanIBringMedicalPage navigateToMedical() {
		medicalLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringMedicalPage.class);
	}

	public TSAGOVWhatCanIBringSharpObjectsPage navigateToSharpObjects() {
		sharpObjectsLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringSharpObjectsPage.class);
	}

	public TSAGOVWhatCanIBringSportingCampingPage navigateToSportingCamping() {
		sportingCampingLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringSportingCampingPage.class);

	}

	public TSAGOVWhatCanIBringMiscellaneousPage navigateToMiscellaneous() {
		miscellaneousLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringMiscellaneousPage.class);

	}

	public void enterSearchText(String searchItem) throws InterruptedException {
		searchBox.type(searchItem);

	}

}
