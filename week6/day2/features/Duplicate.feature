Feature: Duplicate Lead flow 

Background: 
	Given Open Chrome browser 
	And   Load the URL,maximize and set the timeouts 
	
	
Scenario Outline: TC004_Duplicate Lead Flow 
	Given Enter Username as <username> 
	And   Enter password as <password> 
	And   Click LoginButton 
	And   Click CRMSFA 
	And   Click Leads 
	And   Click Find leads 
	And   Click Phone 
	And   Enter Phone Number as <Phone>
	And   Find leads button clicked	
	And   Click first resulting lead
	When  Duplicate  button is clicked
	Then  Create a dulicate record 
	And   Close the browser
	
Examples:
|username|password|Phone|
|'Demosalesmanager'|'crmsfa'|'99'|