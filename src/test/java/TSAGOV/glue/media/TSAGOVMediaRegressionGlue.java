package TSAGOV.glue.media;

import TSAGOV.steps.TSAGOVMediaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVMediaRegressionGlue {

	@Steps 
	TSAGOVMediaSteps user;

@Given("^user wants to access all pages on Media section$")
public void user_wants_to_access_all_pages_on_Media_section() {
   
	user.navigateToTSAGOV();
	//user.enterUsername("moinpreet.sethi@associates.tsa.dhs.gov");
	//user.enterPassword("password1");
	//user.login();
	
	  
	 
}


@When("^user access Media page$")
public void user_access_Media_page() {
	user.navigateToMedia();
}

@Then("^user is directed to Media page$")
public void user_is_directed_to_Media_page() {
	 assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news");
	   assert(user.verifyMediaText());     
}

@Then("^page (.*) under Media section is accessible$")
public void page_Media_Room_under_Media_section_is_accessible(String pageName) {
    switch(pageName) {
    
    case "Media Room":
    	user.navigateToMediaRoom();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press");
    	assert user.verifyMediaRoomText();
    	break;
    	
    case "Press Releases":
    	user.navigateToMediaRoom();
    	user.navigateToPressReleases();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/releases");
        assert user.verifyPressReleasesText();
        break;
    
    case "Testimony":
    	user.navigateToMediaRoom();
    	user.navigateToTestimony();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/testimony");
    	assert user.verifyTestimonyText();
    	break;
    	
    case "Speeches":
    	user.navigateToMediaRoom();
    	user.navigateToSpeeches();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/speeches");
    	assert user.verifySpeechesText();
    	break;
    	
    case "Statements":
    	user.navigateToMediaRoom();
    	user.navigateTOStatements();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/statements");
    	assert user.verifyStatementsText();
    	break;
    	
    case "Factsheets":
    	user.navigateToMediaRoom();
    	user.navigateToFactSheets();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news/press/factsheets");
    	assert user.verifyFactsheetsText();
    	break;
    	
    case "Social Media":
    	user.navigateToMediaRoom();
    	user.navigateToSocialMedia();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/news/social_media");	
    	assert user.verifySocialMediaText();
    	break;
    	
    case "Blog":
    	user.navigateToMediaRoom();
    	user.navigateToBlog();
    	assert user.actualUrl().equals("https://edit.staging.tsa.gov/blog");
    	assert user.verifyBlogText();
    	break;
    	
    case "Videos":
    	user.navigateToMediaRoom();
    	user.navigateToVideo();
    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/videos/one-minute-airport-tour-miami-florida?absolute=");
    	assert user.verifyVideoBanner();
    	break;
    }
}
}
