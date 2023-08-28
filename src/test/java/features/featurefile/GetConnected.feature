
Feature: API Feature for Network
 
 @api
Scenario: Login to Mopro Prod application
  Given The user login to mopro customer application
  When The user gives the valid usernmae and password for customer application
  When The user click on the select button from the projects
  #Then The user must be in the partner Admin page

	@api
	 Scenario Outline: Access to the DCC Dashboard page
	 Then The user must be in the DCC Dashboard
	 When The user click on the Get Connected tile from the Dashboard
 	 Then The user must be on the Get Connected page
 	 #When The user click in the network "<Network>" connect button and enter the "<URL>" url
 	 #Then The user should be able to see the icon checked on the Network "<Network>" tile
 	 Examples:
 |Network|URL|
 |Yelp|https://www.yelp.com/biz/fog-harbor-fish-house-san-francisco-2|
 
  @api
  Scenario Outline: GET call to see the response for list of active networks
    Given The user have the API baseURL
    And The user have Authorization header with Token
    When The user send the GET request
    Then The response status code for post call should be "<Code>"

    Examples: 
     | Code  |
     | 200 |
     
     
      @api
  Scenario Outline: POST call for Administrative API for Dashboard
    Given The user have the API baseURL for the Post call
    And The user have Authorization header with Token
    When The user send the POST request
    Then The response status code for post call should be "<Code>"

    Examples: 
     | Code  |
     | 200 |
     
     
     @api
   Scenario Outline: POST call for Administrative API for User permissions
    Given The user have the API baseURL for User permission Post call
    And The user have Authorization header with Token
    When The user send the POST request with user permission payload
   Then The response status code for post call should be "<Code>"
     Examples: 
     | Code  |
     | 200 |
   
   
     @api
   Scenario Outline: POST call for Industry types
    Given The user have the API baseURL for Contentdelivery Post call
    And The user have Authorization header with Token
    When The user send the POST request with Industry type payload
   Then The response status code for post call should be "<Code>"
     Examples: 
     | Code  |
     | 200 |
   