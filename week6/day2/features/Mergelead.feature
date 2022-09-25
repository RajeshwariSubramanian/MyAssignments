Feature: Merge Lead flow 

Background: 
	Given Open Chrome browser 
	And   Load the URL,maximize and set the timeouts 
	
	
Scenario Outline: TC005_Merge Lead Flow 
	Given Enter Username as <username> 
	And   Enter password as <password> 
	And   Click LoginButton 
	And   Click CRMSFA 
	And   Click Leads 
    And   Click Merge leads
    When  From lead widget is clicked
    Then  Select Lead as "Hari"
    When  To Lead widget is clicked
    Then  Select lead as "babu"
    When  Merge button is clicked
    Then  Check and Verify for the merged lead
    And   Close the browser
    
  Examples: 
|username|password|
|'Demosalesmanager'|'crmsfa'|
    