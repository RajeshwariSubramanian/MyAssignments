Feature: Create Lead flow 

Background: 
	Given Open Chrome browser 
	And   Load the URL,maximize and set the timeouts 
	
	
Scenario Outline: TC001_Create Lead Flow 
	Given Enter Username as <username> 
	And   Enter password as <password> 
	And   Click LoginButton 
	And   Click CRMSFA 
	And   Click Leads 
	And   Click Create Leads 
	And   Enter company name as <company name> 
	And   Enter First Name as <First Name> 
	And   Enter Last Name as <Last Name> 
	When  Create lead button is clicked 
	Then  Lead should be created 
	And   Close the browser 
	
	Examples: 
|username|password|company name|First Name|Last Name|
|'Demosalesmanager'|'crmsfa'|'HCL'|'Raj'|'S'|