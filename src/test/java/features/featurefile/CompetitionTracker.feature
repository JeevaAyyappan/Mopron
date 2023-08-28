Feature: API for Competition Tracker
  
  @ct
	Scenario: Login to Mopro Prod application
  Given The user login to mopro customer application
  When The user gives the valid usernmae and password for customer application
  When The user click on the select button from the projects

	
	 Scenario: Access to the DCC Dashboard page
	 Then The user must be in the DCC Dashboard
	 When The user click on the Competition Tracker tile from the Dashboard
 	 Then The user must be on the Competition Tracker page
 	 
 	 
 	 Scenario Outline: GET call to identify the Social user details from Competition Tracker
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Social user details
	 And The user have Authorization header with Token for Competition Tracker
	 When The user send the GET request for Competition Tracker
	 Then The response status code should be "<Code>" for Competition Tracker
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/social/GetPojectSocialUserDetails/da6596c3-907f-418b-a6ce-b83a4a09493c?_=1692643729600|200|
	 
	 
	 
	 Scenario Outline: POST call to get the Business Competitors in Competition Tracker
	 Given The user have Base URL "<BaseURL>" for the POST call to get Business Competitors
	 And The user have Authorization header with Token for Competition Tracker
	 When The user send the POST request to get Business Competitors
	 Then The response status code should be "<Code>" for Competition Tracker
	 Examples:
	 |BaseURL|Code|
	 |https://administrationapi.moprotrial.com/Administration.svc/api/get|200|
	 
	 
	 
	 Scenario Outline: POST call to get the Radar Feeds in Competition Tracker
	 Given The user have Base URL "<BaseURL>" for the POST call to get Radar Feeds
	 And The user have Authorization header with Token for Competition Tracker
	 When The user send the POST request to get Radar Feeds
	 Then The response status code should be "<Code>" for Competition Tracker
	 Examples:
	 |BaseURL|Code|
	 |https://contentdelieveryapi.moprotrial.com/ContentDelivery.svc/api/get|200|
	 
	 
	 @ct
	 Scenario Outline: POST call to get the Business Competitors social data one in Competition Tracker
	 Given The user have Base URL "<BaseURL>" for the POST call to get Business Competitors social data one
	 And The user have Authorization header with Token for Competition Tracker
	 When The user send the POST request to get Business Competitors social data one
	 Then The response status code should show the Like percent for Social Data one in the competition tracker
	 Examples:
	 | BaseURL|                                                              
   | https://administrationapi.moprotrial.com/Administration.svc/api/get|
   | https://administrationapi.moprotrial.com/Administration.svc/api/get|   
	 
	 @ct
	 Scenario Outline: POST call to get the Business Competitors social data one in Competition Tracker
	 Given The user have Base URL "<BaseURL>" for the POST call to get Business Competitors social data two
	 And The user have Authorization header with Token for Competition Tracker
	 When The user send the POST request to get Business Competitors social data two
	 Then The response status code should show the Like percent for Socail Data two in the competition tracker
	 Examples:
	 |BaseURL|
	 |https://administrationapi.moprotrial.com/Administration.svc/api/get|
	 
	 