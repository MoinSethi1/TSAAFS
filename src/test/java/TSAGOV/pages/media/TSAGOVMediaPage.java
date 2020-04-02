package TSAGOV.pages.media;

import TSAGOV.pages.Home.TSAGOVHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TSAGOVMediaPage extends TSAGOVHomePage {

	@FindBy(xpath = "//*[@id=\"block-tsa-gov-pagetitle\"]/h1")
	private WebElementFacade mediaText;

	@FindBy(css = "#basic-nav-section-2 > a:nth-child(4) > li > span")
	private WebElementFacade socialMediaLink;

	@FindBy(css = "#basic-nav-section-2 > a:nth-child(5) > li > span")
	private WebElementFacade blogLink;

	@FindBy(css = "#basic-nav-section-2 > a:nth-child(6) > li > span")
	private WebElementFacade videoLink;

	public String verifyMediaText() {
		return mediaText.getText();
	}

	public TSAGOVSocialMediaPage navigateToSocialMedia() {
		socialMediaLink.click();
		return this.switchToPage(TSAGOVSocialMediaPage.class);
	}

	public TSAGOVBlogPage navigateToBlog() {
		blogLink.click();
		return this.switchToPage(TSAGOVBlogPage.class);
	}

	public TSAGOVVideoPage navigateToVideo() {
		videoLink.click();
		return this.switchToPage(TSAGOVVideoPage.class);
	}
}
