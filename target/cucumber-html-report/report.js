$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CompetitionTracker.feature");
formatter.feature({
  "line": 1,
  "name": "API for Local SEO Listings",
  "description": "",
  "id": "api-for-local-seo-listings",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login to Mopro Prod application",
  "description": "",
  "id": "api-for-local-seo-listings;login-to-mopro-prod-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The user login to mopro customer application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user gives the valid usernmae and password for customer application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user click on the select button from the projects",
  "keyword": "When "
});
formatter.match({
  "location": "GetConnectedSteps.the_user_login_to_mopro_customer_application()"
});
formatter.result({
  "duration": 9550587800,
  "status": "passed"
});
formatter.match({
  "location": "GetConnectedSteps.the_user_gives_the_valid_usernmae_and_password_for_customer_application()"
});
formatter.result({
  "duration": 6487064900,
  "status": "passed"
});
formatter.match({
  "location": "GetConnectedSteps.the_user_click_on_the_select_button_from_the_projects()"
});
formatter.result({
  "duration": 5321468300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Access to the DCC Dashboard page",
  "description": "",
  "id": "api-for-local-seo-listings;access-to-the-dcc-dashboard-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The user must be in the DCC Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "The user click on the Competition Tracker tile from the Dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The user must be on the Competition Tracker page",
  "keyword": "Then "
});
formatter.match({
  "location": "ReputationManagerSteps.the_user_must_be_in_the_DCC_Dashboard()"
});
formatter.result({
  "duration": 196026600,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_click_on_the_Competition_Tracker_tile_from_the_Dashboard()"
});
formatter.result({
  "duration": 265207200,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_must_be_on_the_Competition_Tracker_page()"
});
formatter.result({
  "duration": 300420600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "GET call to identify the Social user details from Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;get-call-to-identify-the-social-user-details-from-competition-tracker",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "The user have Base URL \"\u003cBaseURL\u003e\" for the Get call to identify Social user details",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "The user send the GET request for Competition Tracker",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "The response status code should be \"\u003cCode\u003e\" for Competition Tracker",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "api-for-local-seo-listings;get-call-to-identify-the-social-user-details-from-competition-tracker;",
  "rows": [
    {
      "cells": [
        "BaseURL",
        "Code"
      ],
      "line": 22,
      "id": "api-for-local-seo-listings;get-call-to-identify-the-social-user-details-from-competition-tracker;;1"
    },
    {
      "cells": [
        "https://api.moprotrial.com/api/social/GetPojectSocialUserDetails/da6596c3-907f-418b-a6ce-b83a4a09493c?_\u003d1692643729600",
        "200"
      ],
      "line": 23,
      "id": "api-for-local-seo-listings;get-call-to-identify-the-social-user-details-from-competition-tracker;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "GET call to identify the Social user details from Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;get-call-to-identify-the-social-user-details-from-competition-tracker;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "The user have Base URL \"https://api.moprotrial.com/api/social/GetPojectSocialUserDetails/da6596c3-907f-418b-a6ce-b83a4a09493c?_\u003d1692643729600\" for the Get call to identify Social user details",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "The user send the GET request for Competition Tracker",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "The response status code should be \"200\" for Competition Tracker",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://api.moprotrial.com/api/social/GetPojectSocialUserDetails/da6596c3-907f-418b-a6ce-b83a4a09493c?_\u003d1692643729600",
      "offset": 24
    }
  ],
  "location": "Get5StarReviewsAPISteps.the_user_have_Base_URL_for_the_Get_call_to_identify_Social_user_details(String)"
});
formatter.result({
  "duration": 3804200,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 104900,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_GET_request_for_Competition_Tracker()"
});
formatter.result({
  "duration": 2745871800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "CompetitionTrackerSteps.the_response_status_code_should_be_for_Competition_Tracker(int)"
});
formatter.result({
  "duration": 1351800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "POST call to get the Business Competitors in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-in-competition-tracker",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "The user have Base URL \"\u003cBaseURL\u003e\" for the POST call to get Business Competitors",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "The user send the POST request to get Business Competitors",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "The response status code should be \"\u003cCode\u003e\" for Competition Tracker",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-in-competition-tracker;",
  "rows": [
    {
      "cells": [
        "BaseURL",
        "Code"
      ],
      "line": 33,
      "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-in-competition-tracker;;1"
    },
    {
      "cells": [
        "https://administrationapi.moprotrial.com/Administration.svc/api/get",
        "200"
      ],
      "line": 34,
      "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-in-competition-tracker;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 34,
  "name": "POST call to get the Business Competitors in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-in-competition-tracker;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "The user have Base URL \"https://administrationapi.moprotrial.com/Administration.svc/api/get\" for the POST call to get Business Competitors",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "The user send the POST request to get Business Competitors",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "The response status code should be \"200\" for Competition Tracker",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://administrationapi.moprotrial.com/Administration.svc/api/get",
      "offset": 24
    }
  ],
  "location": "CompetitionTrackerSteps.the_user_have_Base_URL_for_the_POST_call_to_get_Business_Competitors(String)"
});
formatter.result({
  "duration": 77900,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 14500,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_POST_request_to_get_Business_Competitors()"
});
formatter.result({
  "duration": 2157093000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "CompetitionTrackerSteps.the_response_status_code_should_be_for_Competition_Tracker(int)"
});
formatter.result({
  "duration": 140300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 38,
  "name": "POST call to get the Radar Feeds in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-radar-feeds-in-competition-tracker",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "The user have Base URL \"\u003cBaseURL\u003e\" for the POST call to get Radar Feeds",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "The user send the POST request to get Radar Feeds",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "The response status code should be \"\u003cCode\u003e\" for Competition Tracker",
  "keyword": "Then "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-radar-feeds-in-competition-tracker;",
  "rows": [
    {
      "cells": [
        "BaseURL",
        "Code"
      ],
      "line": 44,
      "id": "api-for-local-seo-listings;post-call-to-get-the-radar-feeds-in-competition-tracker;;1"
    },
    {
      "cells": [
        "https://contentdelieveryapi.moprotrial.com/ContentDelivery.svc/api/get",
        "200"
      ],
      "line": 45,
      "id": "api-for-local-seo-listings;post-call-to-get-the-radar-feeds-in-competition-tracker;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 45,
  "name": "POST call to get the Radar Feeds in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-radar-feeds-in-competition-tracker;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "The user have Base URL \"https://contentdelieveryapi.moprotrial.com/ContentDelivery.svc/api/get\" for the POST call to get Radar Feeds",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "The user send the POST request to get Radar Feeds",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "The response status code should be \"200\" for Competition Tracker",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://contentdelieveryapi.moprotrial.com/ContentDelivery.svc/api/get",
      "offset": 24
    }
  ],
  "location": "CompetitionTrackerSteps.the_user_have_Base_URL_for_the_POST_call_to_get_Radar_Feeds(String)"
});
formatter.result({
  "duration": 76800,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 16900,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_POST_request_to_get_Radar_Feeds()"
});
formatter.result({
  "duration": 2204622500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "CompetitionTrackerSteps.the_response_status_code_should_be_for_Competition_Tracker(int)"
});
formatter.result({
  "duration": 75300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 49,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 48,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "The user have Base URL \"\u003cBaseURL\u003e\" for the POST call to get Business Competitors social data one",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "The user send the POST request to get Business Competitors social data one",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "The response status code should be \"\u003cCode\u003e\" for Competition Tracker",
  "keyword": "Then "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;",
  "rows": [
    {
      "cells": [
        "BaseURL",
        "Code"
      ],
      "line": 55,
      "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;1"
    },
    {
      "cells": [
        "https://administrationapi.moprotrial.com/Administration.svc/api/get",
        "200"
      ],
      "line": 56,
      "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 56,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 48,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "The user have Base URL \"https://administrationapi.moprotrial.com/Administration.svc/api/get\" for the POST call to get Business Competitors social data one",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "The user send the POST request to get Business Competitors social data one",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "The response status code should be \"200\" for Competition Tracker",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://administrationapi.moprotrial.com/Administration.svc/api/get",
      "offset": 24
    }
  ],
  "location": "CompetitionTrackerSteps.the_user_have_Base_URL_for_the_POST_call_to_get_Business_Competitors_social_data_one(String)"
});
formatter.result({
  "duration": 45700,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 14000,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_POST_request_to_get_Business_Competitors_social_data_one()"
});
formatter.result({
  "duration": 1356117900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "CompetitionTrackerSteps.the_response_status_code_should_be_for_Competition_Tracker(int)"
});
formatter.result({
  "duration": 62100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 59,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 58,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "The user have Base URL \"\u003cBaseURL\u003e\" for the POST call to get Business Competitors social data two",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "The user send the POST request to get Business Competitors social data two",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "The response status code should be \"\u003cCode\u003e\" for Competition Tracker",
  "keyword": "Then "
});
formatter.examples({
  "line": 64,
  "name": "",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;",
  "rows": [
    {
      "cells": [
        "BaseURL",
        "Code"
      ],
      "line": 65,
      "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;1"
    },
    {
      "cells": [
        "https://administrationapi.moprotrial.com/Administration.svc/api/get",
        "200"
      ],
      "line": 66,
      "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 66,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-local-seo-listings;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 58,
      "name": "@lot"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "The user have Base URL \"https://administrationapi.moprotrial.com/Administration.svc/api/get\" for the POST call to get Business Competitors social data two",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "The user send the POST request to get Business Competitors social data two",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "The response status code should be \"200\" for Competition Tracker",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://administrationapi.moprotrial.com/Administration.svc/api/get",
      "offset": 24
    }
  ],
  "location": "CompetitionTrackerSteps.the_user_have_Base_URL_for_the_POST_call_to_get_Business_Competitors_social_data_two(String)"
});
formatter.result({
  "duration": 34600,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 8800,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_POST_request_to_get_Business_Competitors_social_data_two()"
});
formatter.result({
  "duration": 1669925500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "CompetitionTrackerSteps.the_response_status_code_should_be_for_Competition_Tracker(int)"
});
formatter.result({
  "duration": 60000,
  "status": "passed"
});
});