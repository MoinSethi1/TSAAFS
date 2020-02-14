package TSAGOV.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("/")
public class TSAGOVBasePage extends PageObject {
	
	@FindBy(xpath = "//*[contains(text(), 'Member for')]")
	private WebElementFacade memberText;
	
	@FindBy(id = "edit-name")
	private WebElementFacade usernameBox;
	
	@FindBy(id="edit-pass")
	private WebElementFacade passwordBox;
	
	@FindBy(id="edit-submit")
	private WebElementFacade loginBtn;
	
	@FindBy (xpath = "//a[@href ='/traveler-information/traveling-food-or-gifts\']")
	private WebElementFacade whatCanIBringLink;
	
	public void navigateToTSAGOV() {
		this.openAt("https://edit.staging.tsa.gov");
	}

	public boolean verifyMemberText() {
		
		return(memberText.isPresent() );
		}

	public void enterUsername(String username) {
		usernameBox.type(username);
	}
	
	public void enterPassword(String password)  {
		passwordBox.type(password);
		
	}
	
	public TSAGOVMemberPage login() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(1000);
		return this.switchToPage(TSAGOVMemberPage.class);
	}
	
	
	public TSAGOVWhatCanIBringPage navigateToWhatCanIBring() throws InterruptedException {
		whatCanIBringLink.click();
		Thread.sleep(1000);
		return this.switchToPage(TSAGOVWhatCanIBringPage.class);
	
	}
	
	public WebElementFacade expectedText() {
		return (memberText);
	}
	public String actualUrl() {

		WebDriver driver = getDriver();
		return (driver.getCurrentUrl());
		
	}
	
		
	public void waitForPageload() throws InterruptedException {
		
		getDriver().manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	}

}
	
	

