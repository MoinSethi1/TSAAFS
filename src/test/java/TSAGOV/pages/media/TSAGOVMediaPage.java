package TSAGOV.pages.media;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVMediaPage extends TSAGOVHomePage{

	@FindBy (xpath ="//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade mediaText;
	
	@FindBy (css ="#block-media-sidebar > nav.max-tablet-hidden > ul > li:nth-child(2) > a")
	private WebElementFacade socialMediaLink;
	
	@FindBy (css ="#block-media-sidebar > nav.max-tablet-hidden > ul > li:nth-child(3) > a")
	private WebElementFacade blogLink;
	
	@FindBy (css ="#block-media-sidebar > nav.max-tablet-hidden > ul > li:nth-child(4) > a")
	private WebElementFacade videoLink;
	
	public boolean verifyMediaText() {
		return mediaText.isPresent();
		}
	
	public TSAGOVSocialMediaPage navigateToSocialMedia() {
		socialMediaLink.click();
		return this.switchToPage(TSAGOVSocialMediaPage.class);
	}
	
	public TSAGOVBlogPage navigateToBlog() {
		blogLink.click();
		return this.switchToPage( TSAGOVBlogPage.class);
	}
	
	public TSAGOVVideoPage navigateToVideo() {
		videoLink.click();
		return this.switchToPage(TSAGOVVideoPage.class);
	}
}
