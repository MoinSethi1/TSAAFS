package TSAGOV.glue.travel;

import TSAGOV.steps.TSAGOVTravelSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TSAGOVTravelRegressionGlue {
	
	@Steps
	TSAGOVTravelSteps user;
	
	
	@Given("^user wants to access all pages on Travel section$")
	public void user_wants_to_access_all_pages_on_Travel_section() {
	    user.navigateToTSAGOV();
	}


	@When("^user access Travel pages$")
	public void user_access_Travel_pages() {
	    
		user.navigateToTSATravel();
	}

	@Then("^page (.*) under Travel section is accessible$")
	public void page_Travel_under_Travel_section_is_accessible(String pageName) throws InterruptedException {
		switch(pageName) {
		
		case "Travel":
			   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel");
			   assert(user.verifyTravelImage()); 
			   break;
			   
		case "Security Screening":
			user.navigateToSecurityScreening();
			assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening");
			assert(user.verifySecurityScreeningText());
			break;
			
		case "What Can I Bring":
			user.securityScreeningExpand();
			user.navigateToWCIB();
			assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/whatcanibring/all");
			assert(user.verifyWhatCanIBringText());
			break;
			
		case"Identification":
			user.securityScreeningExpand();
			user.navigateToIdentification();
			break;
			
			
		  
			  // assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/identification");
			  // assert(user.verifyIdentificationText());
			   //break;
			   
		   case "Liquids Rule":
			   user.securityScreeningExpand();
			   user.navigateToLiquidsRule();
			   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/liquids-rule");
			   assert user.verifyLiquidsRuleText();
			   break;
			   
		   case "Emerging Technology":
			   user.securityScreeningExpand();
			   user.naviagteToEmergingTechnology();
			   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/security-screening/emerging-technology");
			   assert user.verifyEmergingTechnologyText();
			   break;
			   
		   case "REAL ID":
			   user.securityScreeningExpand();
		   user.navigateToRealID();
		   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/real-id");
		   assert user.verifyRealIDText();
		   break;
		   
		   case "Special Procedures":
			   user.navigateToSpecialProcedures();
			   assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures");
				assert(user.verifySpecialProcedureText());
				break;
			
			case "Disabilities Medical Conditions":
				user.specialProceduresExpand();
			user.navigateToDisabilitiesAndMedical();
			assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures");
			assert(user.verifyDisabilitiesAndMedcalText());
		    break;
		    
			case "Military":
				user.specialProceduresExpand();
				user.navigateToMilitary();
				assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures/military-travelers");
				assert(user.verifyMilitaryText());
				break;
				
			case "Children":
				user.specialProceduresExpand();
				user.navigateToChildren();
				assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures/traveling-children");
				assert(user.verifyChildrenText());
				break;
				
			case "Seniors":
				user.specialProceduresExpand();
				user.navigateToSenior();
				assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/screening-passengers-75-and-older");
				assert(user.verifySeniorText());
				break;
				
			case "Law Enforcement":
				user.specialProceduresExpand();
				user.navigateToLawEnforcement();
				assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/law-enforcement");
				assert(user.verifyLawEnforcemenText());
				break;
				
			case "Cultural":
				user.specialProceduresExpand();
				user.navigateToCultural();
				assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/special-procedures/cultural");
				assert(user.verifyCulturalText());
				break;
				
			case "TSA PreCheck":
				user.navigateToTSAPrecheck();
				assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/precheck");
				assert user.verifyTsaPrecheckText().equals("TSA PreCheck™");
				break;
				
			case "Airport Airlines ":
				user.tsaPreCheckExpand();
				user.navigateToAirportsAirlines();
				assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/precheck/map");
				assert(user.verifyAirportsAirlinesText());
				break;
				
				case "Schedule":
					user.tsaPreCheckExpand();
				user.navigateToScedule();
				assert(user.actualUrl()).contentEquals("https://edit.staging.tsa.gov/precheck/schedule");
				assert(user.verifyScheduleText());
				break;
				
				case "FAQ":
					user.tsaPreCheckExpand();
				user.navigateToFaq();
				assert(user.actualUrl()).contentEquals("https://edit.staging.tsa.gov/precheck/faq");
				assert(user.verifyFaqText());
				break;
				
				case "Trusted Traveler Programs":
					user.tsaPreCheckExpand();
				user.navigateToTrustedTravelerPrograms();
				assert(user.actualUrl()).contentEquals("https://ttp.cbp.dhs.gov/");
				assert(user.verifyTrustedTravelerText());
				break;
				
				case "Passenger Support":
					user.navigateToPassengerSupport();
					assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support");
				    assert(user.verifyPassengerSupportText());
				    break;
				    
				case "Civil Rights":
					user.passengerSupportExpand();
					user.navigateToCivilRights();
					assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support/civil-rights");
					assert(user.verifyCivilRightsText());
					break;
					
					case "Travel Redress":
						user.passengerSupportExpand();
						user.navigateToTravelRedress();
						assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support/travel-redress-program");
						assert(user.verifyTravelRedressText());
						break;
						
					case "Claims":
						user.passengerSupportExpand();
						user.navigateToClaims();
						assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/passenger-support/claims");
						assert(user.verifyClaimsText());
						break;
		    
					case "Travel Tips":
						user.navigateToTravelTips();
						assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/travel-tips");
					    assert user.verifyTravelTipsText();
					    break;
					    
					case "Travel Checklist":
						user.travelTipsExpand();
				    	user.navigateToTravelChecklist();
				    	assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/travel-tips/travel-checklist");
				    	assert user.verifyTravelChecklistText();
				    	break;
				    	
					case "Travel FAQ":
						user.navigateToTravelFAQ();
						assert(user.actualUrl()).equals("https://edit.staging.tsa.gov/travel/frequently-asked-questions");
					    assert user.verifyTravelFAQText();
					    break;
		   
		   }
		
		
		
	}
}
