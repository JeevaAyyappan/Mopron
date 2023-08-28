Feature: API for Local SEO Listings
  
  @seo
Scenario: Login to Mopro Prod application
  Given The user login to mopro customer application
  When The user gives the valid usernmae and password for customer application
  When The user click on the select button from the projects

@seo
	 Scenario: Access to the DCC Dashboard page
	 Then The user must be in the DCC Dashboard
	 When The user click on the Local SEO listings tile from the Dashboard
 	 Then The user must be on the Local SEO listings page
 	 
 	 ################################## My Listings #############################################
 	 @seo
 	 Scenario Outline: GET call to identify the Profile completness in My listings
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Profile Completeness
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for Profile completeness
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/profilecompleteness/fd3dbdd8-974c-4f3f-bc2d-d2efb46f1123?_=1692277450928|200|
	 
	 @seo
	 Scenario Outline: GET call to identify the Uberall Location Maps in My listings
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Uberalllocation
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for Uberalllocation
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/uberalllocationmap/da6596c3-907f-418b-a6ce-b83a4a09493c?_=1692277450929|200|
	 
	 
	 @seo
	 Scenario Outline: GET call to identify the Listing Health
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Listing Health
	  And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for Listing Health
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/listinghealth/da6596c3-907f-418b-a6ce-b83a4a09493c?_=1692277450930|200|
	 
	 ######################################## My Dashboard #######################################
	 @seo
	 Scenario Outline: GET call to identify the Uberall Location in My Dashboard
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Uberall Locations in My Dashboard
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for Uberall Locations in My Dashboard
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/uberalllocationmap/da6596c3-907f-418b-a6ce-b83a4a09493c?_=1692369192780|200|
	 
	 @seo
	 Scenario Outline: GET call to identify the Listing Health in My Dashboard
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Listing Health in My Dashboard
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for Listing Health in My Dashboard
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/listinghealth/da6596c3-907f-418b-a6ce-b83a4a09493c?_=1692369192781|200|
	 
	 @seo
	 Scenario Outline: POST call to get the Insight data one in My Dashboard
	 Given The user have Base URL "<BaseURL>" for the POST call to get Insight data one
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the POST request to get Insight data one
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/getinsightdata|200|
	 
	 @seo
	 Scenario Outline: POST call to get the Insight data two in My Dashboard
	 Given The user have Base URL "<BaseURL>" for the POST call to get Insight data two
	  And The user have Authorization header with Token for Local SEO Listings
	 When The user send the POST request to get Insight data two
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/getinsightdata|200|
	 
	 
	 ################################################# Basic Info ##################################################
	 @seo
	 Scenario Outline: GET call to identify the Basic Info in Business Profile
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Basic Info in Business Profile
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for Basic Info in Business Profile
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/profilecompleteness/fd3dbdd8-974c-4f3f-bc2d-d2efb46f1123?_=1692626326569|200|
	 
	 @seo
	 Scenario Outline: GET call to identify the About your Business in Business Profile
	 Given The user have Base URL "<BaseURL>" for the Get call to identify About your Business in Business Profile
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for About your Business in Business Profile
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/profilecompleteness/fd3dbdd8-974c-4f3f-bc2d-d2efb46f1123?_=1692626326573|200|
	 
	 
	 @seo
	 Scenario Outline: GET call to identify the Media in Business Profile
	 Given The user have Base URL "<BaseURL>" for the Get call to identify Media in Business Profile
	 And The user have Authorization header with Token for Local SEO Listings
	 When The user send the GET request for Media in Business Profile
	 Then The response status code should be "<Code>" for Local SEO listings
	 Examples:
	 |BaseURL|Code|
	 |https://api.moprotrial.com/api/listing360/profilecompleteness/fd3dbdd8-974c-4f3f-bc2d-d2efb46f1123?_=1692626326578|200|