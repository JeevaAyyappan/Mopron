
Feature: API for Get 5 Star Reviews
  
  @star
Scenario: Login to Mopro Prod application
  Given The user login to mopro customer application
  When The user gives the valid usernmae and password for customer application
  When The user click on the select button from the projects

@star
	 Scenario: Access to the DCC Dashboard page
	 Then The user must be in the DCC Dashboard
	 When The user click on the Get five Star reviews tile from the Dashboard
 	 Then The user must be on the Get five Star reviews page

	########################################## Service Reviews ############################################

	@star
	Scenario Outline: GET call to identify the Social user details from Service reviews
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Social user details
	 And The user have Authorization header with Token for Get five star reviews
	 When The user send the GET request for Social user details
	 Then The response status code should be "<Code>"
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/social/GetPojectSocialUserDetails/da6596c3-907f-418b-a6ce-b83a4a09493c?_=1692199374251|200|
	 
	 @star
	 Scenario Outline: POST call to identify the Analytics Data from Service reviews
	 Given The user have Base URL "<BaseURL>" for the POST call to identify Analytics Data
	 And The user have Authorization header with Token for Get five star reviews
	 When The user send the POST request for Analytics Data
	 Then The response status code should be "<Code>"
	 Examples:
	 |BaseURL|Code|
	 |https://contentdelieveryapi.moprotrial.com/ContentDelivery.svc/api/get|200|
	 
	 @star
	Scenario Outline: POST call to identify the Radar Feeds from Service reviews
	 Given The user have Base URL "<BaseURL>" for the POST call to identify Radar Feeds
	  And The user have Authorization header with Token for Get five star reviews
	 When The user send the POST request for Radar Feeds
	 Then The response status code should be "<Code>"
	 Examples:
	 |BaseURL|Code|
	 |https://contentdelieveryapi.moprotrial.com/ContentDelivery.svc/api/get|200|
	 
	 ########################################## Get Reviews ####################################################
	 
	 
	 Scenario Outline: GET call to identify the Review Campaign from Get reviews
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Review Campaign
	 And The user have Authorization header with Token for Get five star reviews
	 When The user send the GET request for Review Campaign
	 Then The response status code should be "<Code>"
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/reviewcampaign/project/da6596c3-907f-418b-a6ce-b83a4a09493c/default?_=1692712074525|200|
	 
	 
	 