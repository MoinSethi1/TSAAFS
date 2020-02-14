package TSAGOV.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://edit.staging.tsa.gov/traveler-information/traveling-food-or-gifts")

public class TSAGOVWhatCanIBringPage extends TSAGOVBasePage{

	@FindBy (xpath = "//*[contains(text(),'What Can I Bring')]")
	
	private WebElementFacade whatCanIBringText;
	
	@FindBy (xpath = "//a[@href='/travel/security-screening/whatcanibring/all']")
	private WebElementFacade allItemsLink;
		
	@FindBy (xpath = "//a[@href = '/travel/security-screening/whatcanibring/flammables']")
	private WebElementFacade flammablesLink;
	
	@FindBy (xpath = "//*[contains(text(),'Flammables')]")
	private WebElementFacade flammablesText;
	
	@FindBy (xpath = "//a[@href = '/travel/security-screening/whatcanibring/firearms']")
	private WebElementFacade firearmsLink;
	
	@FindBy (xpath = "//*[contains(text(),'Firearms')]")
	private WebElementFacade firearmsText;
	
	@FindBy (xpath = "//a[@href ='/travel/security-screening/whatcanibring/food']")
	private WebElementFacade foodLink;
	
	@FindBy (xpath = "//*[contains(text(),'Food')]")
	private WebElementFacade foodText;
	
	@FindBy (xpath = "//a[@href = '/travel/security-screening/whatcanibring/household-and-tools']")
	private WebElementFacade householdToolsLink;
	
	@FindBy (xpath = "//*[contains(text(),'Household and tools')]")
	private WebElementFacade householdAndToolsText;
	
	@FindBy (xpath = "//a[@href = '/travel/security-screening/whatcanibring/medical']")
	private WebElementFacade medicalLink;
	
	@FindBy (xpath = "//*[contains(text(),'Medical)]")
	private WebElementFacade medicalText;
	
	@FindBy (xpath = "//a[@href = '/travel/security-screening/whatcanibring/sharp-objects']")
	private WebElementFacade sharpObjectsLink;
	
	@FindBy (xpath = "//*[contains(text(),'Sharp objects')]")
	private WebElementFacade sharpObjectsText;
	
	@FindBy (xpath = "//a[@href = '/travel/security-screening/whatcanibring/sporting-and-camping']")
	private WebElementFacade sportingCampingLink;
	
	@FindBy (xpath = "//*[contains(text(),'Sporting and camping')]")
	private WebElementFacade sportingAndCampingText;
	
	@FindBy (xpath = "//a[@href = '/travel/security-screening/whatcanibring/miscellaneous']")
	private WebElementFacade miscellaneousLink;
	
	@FindBy (xpath = "//*[contains(text(),'Miscellaneous')]")
	private WebElementFacade miscellaneousText;
	
	
	public boolean verifyWhatCanIBringText() {
		
		return whatCanIBringText.isPresent();
	}
	
	
	public TSAGOVWhatCanIBringAllItemsPage navigateToAll() {
				
		
		
		allItemsLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringAllItemsPage.class);
		
	}
	
	//public boolean verifyWhatCanIBringText() {
		//return whatCanIBringText.isPresent();
	//}
	
	public TSAGovWhatCanIBringFlammablesPage navigateToFlammables() {
		flammablesLink.waitUntilClickable().click();
		return this.switchToPage(TSAGovWhatCanIBringFlammablesPage.class);
		
	}
	
public boolean verifyFlammablesText() {
		
		return flammablesText.isPresent();
	}
	
	public TSAGOVWhatCanIBringFirearmsPage navigateToFirearms() {
		firearmsLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringFirearmsPage.class);
			
	}
	
public boolean verifyFirearmsText() {
		
		return firearmsText.isPresent();
	}
	
	public TSAGOVWhatCanIBringFoodPage navigateToFood() {
		foodLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringFoodPage.class);
	}
	
public boolean verifyFoodText() {
		
		return foodText.isPresent();
	}
		
	public TSAGOVWharCanIBringHouseholdToolsPage navigateToHouseholdTools() {
		householdToolsLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWharCanIBringHouseholdToolsPage.class);
			
	}
	
public boolean verifyHouseholdAndToolsText() {
		
		return householdAndToolsText.isPresent();
	}
	
	public TSAGOVWhatCanIBringMedicalPage navigateToMedical() {
		medicalLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringMedicalPage.class);
	}
	
	
public boolean verifyMedicalText() {
		
		return medicalText.isPresent();
	}

	public TSAGOVWhatCanIBringSharpObjectsPage navigateToSharpObjects() {
	sharpObjectsLink.waitUntilClickable().click();
	return this.switchToPage(TSAGOVWhatCanIBringSharpObjectsPage.class);
	}
	
	
public boolean verifySharpObjectsText() {
		
		return sharpObjectsText.isPresent();
	}

	public TSAGOVWhatCanIBringSportingCampingPage navigateToSportingCamping() {
		sportingCampingLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringSportingCampingPage.class);
				
	}
	
public boolean verifySportingCampingText() {
		
		return sportingAndCampingText.isPresent();
	}
		
	public TSAGOVWhatCanIBringMiscellaneousPage navigateToMiscellaneous() {
		miscellaneousLink.waitUntilClickable().click();
		return this.switchToPage(TSAGOVWhatCanIBringMiscellaneousPage.class);
		
	}
	
	
public boolean verifyMiscellaneousText() {
		
		return miscellaneousText.isPresent();
	}
	
}
