$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CompetitionTracker.feature");
formatter.feature({
  "line": 1,
  "name": "API for Competition Tracker",
  "description": "",
  "id": "api-for-competition-tracker",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login to Mopro Prod application",
  "description": "",
  "id": "api-for-competition-tracker;login-to-mopro-prod-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@ct"
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
  "duration": 5958577600,
  "status": "passed"
});
formatter.match({
  "location": "GetConnectedSteps.the_user_gives_the_valid_usernmae_and_password_for_customer_application()"
});
formatter.result({
  "duration": 5387291000,
  "status": "passed"
});
formatter.match({
  "location": "GetConnectedSteps.the_user_click_on_the_select_button_from_the_projects()"
});
formatter.result({
  "duration": 3246034600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 49,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 48,
      "name": "@ct"
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
  "name": "The response status code should show the Like percent for Social Data one in the competition tracker",
  "keyword": "Then "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;",
  "rows": [
    {
      "cells": [
        "BaseURL"
      ],
      "line": 55,
      "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;1"
    },
    {
      "cells": [
        "https://administrationapi.moprotrial.com/Administration.svc/api/get"
      ],
      "line": 56,
      "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2"
    },
    {
      "cells": [
        "https://administrationapi.moprotrial.com/Administration.svc/api/get"
      ],
      "line": 57,
      "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 56,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 48,
      "name": "@ct"
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
  "name": "The response status code should show the Like percent for Social Data one in the competition tracker",
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
  "duration": 4097200,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 32100,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_POST_request_to_get_Business_Competitors_social_data_one()"
});
formatter.result({
  "duration": 2680950300,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_response_status_code_should_show_the_Like_percent_for_Social_Data_one_in_the_competition_tracker()"
});
formatter.result({
  "duration": 887554800,
  "error_message": "java.lang.NullPointerException\r\n\tat features.stepdefintions.CompetitionTrackerSteps.the_response_status_code_should_show_the_Like_percent_for_Social_Data_one_in_the_competition_tracker(CompetitionTrackerSteps.java:195)\r\n\tat ✽.Then The response status code should show the Like percent for Social Data one in the competition tracker(CompetitionTracker.feature:53)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 57,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 48,
      "name": "@ct"
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
  "name": "The response status code should show the Like percent for Social Data one in the competition tracker",
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
  "duration": 50500,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 10600,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_POST_request_to_get_Business_Competitors_social_data_one()"
});
formatter.result({
  "duration": 909283700,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_response_status_code_should_show_the_Like_percent_for_Social_Data_one_in_the_competition_tracker()"
});
formatter.result({
  "duration": 892643000,
  "error_message": "java.lang.NullPointerException\r\n\tat features.stepdefintions.CompetitionTrackerSteps.the_response_status_code_should_show_the_Like_percent_for_Social_Data_one_in_the_competition_tracker(CompetitionTrackerSteps.java:195)\r\n\tat ✽.Then The response status code should show the Like percent for Social Data one in the competition tracker(CompetitionTracker.feature:53)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 60,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 59,
      "name": "@ct"
    }
  ]
});
formatter.step({
  "line": 61,
  "name": "The user have Base URL \"\u003cBaseURL\u003e\" for the POST call to get Business Competitors social data two",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "The user send the POST request to get Business Competitors social data two",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "The response status code should show the Like percent for Socail Data two in the competition tracker",
  "keyword": "Then "
});
formatter.examples({
  "line": 65,
  "name": "",
  "description": "",
  "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;",
  "rows": [
    {
      "cells": [
        "BaseURL"
      ],
      "line": 66,
      "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;1"
    },
    {
      "cells": [
        "https://administrationapi.moprotrial.com/Administration.svc/api/get"
      ],
      "line": 67,
      "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 67,
  "name": "POST call to get the Business Competitors social data one in Competition Tracker",
  "description": "",
  "id": "api-for-competition-tracker;post-call-to-get-the-business-competitors-social-data-one-in-competition-tracker;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 59,
      "name": "@ct"
    }
  ]
});
formatter.step({
  "line": 61,
  "name": "The user have Base URL \"https://administrationapi.moprotrial.com/Administration.svc/api/get\" for the POST call to get Business Competitors social data two",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "The user have Authorization header with Token for Competition Tracker",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "The user send the POST request to get Business Competitors social data two",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "The response status code should show the Like percent for Socail Data two in the competition tracker",
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
  "duration": 86000,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_have_Authorization_header_with_Token_for_Competition_Tracker()"
});
formatter.result({
  "duration": 8700,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_user_send_the_POST_request_to_get_Business_Competitors_social_data_two()"
});
formatter.result({
  "duration": 1055748900,
  "status": "passed"
});
formatter.match({
  "location": "CompetitionTrackerSteps.the_response_status_code_should_show_the_Like_percent_for_Socail_Data_two_in_the_competition_tracker()"
});
formatter.result({
  "duration": 1109161100,
  "status": "passed"
});
});