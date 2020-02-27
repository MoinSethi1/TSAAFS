Feature: Industry section regression test
	
  Scenario Outline: As user I want to access all pages under Industry section
    Given user wants to access all pages on Industry section
    When user access Industry pages
 		Then page <pageName> under Industry section is accessible

Examples:
|pageName										|
|HAZMAT												|
|Cargo Programs							|
|ASAC												|
|Baggage Screening					|
|Business										|
|Capability Acceptance Process	|
|Cybersecurity Toolkit			|
|First Observer Plus				|
|General Aviation						|
|IStep												|
|Innovation Task Force				|
|PASS													|
|Reimbursable Screening				|
|Screening Partnership				|
|Security Fees								|
|SSI													|
|STSAC												|
|Surface Transportation				|
|Training											|
|TWIC													|



