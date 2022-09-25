Feature: Edit Lead flow 

Background: 
	Given Open Chrome browser 
	And   Load the URL,maximize and set the timeouts 
	
	
Scenario Outline: TC002_Edit Lead Flow 
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
	And   Edit  button is clicked
	And   Update the company name as <cname>
	When  Update button clicked
	Then  The company name should be updated
	And   Close the browser
	
Examples:
|username|password|Phone|cname|
|'Demosalesmanager'|'crmsfa'|'99'|'TP'|


	
	
	
	
	
	     