

Feature: Title of your feature
  I want to use this template for my feature file

 @rmp
Scenario: Login to Reseller Application
  Given The user login to mopro reseller application
  When The user gives the valid usernmae and password
  Then The user must be in the partner Admin page
  
@rmp
 Scenario Outline: Access to the Reputation Manager page
 Given The user is on the partner admin page
 When The user click on the Mopro owner account link based on the "<AccountName>" and "<MoproEmail>"
 Then The user must be in the Reseller Admin page
 When The user click on the Globe icon based on the "<BusinessName>" and "<Email>"
 Then The user must be in the DCC Dashboard
 When The user click on the Reputation Manager tile from the Dashboard
 Then The user must be on the Reputation Manager page
 Examples:
 |AccountName|MoproEmail|BusinessName|Email|
 |Mopro|motag@mopro.comXXXX|Dinesh automation|dineshauto@yopmail.com|
 
 @rmp @test
 Scenario Outline: Access the Network Filter
 Given The user is on the Reputation Manager page
 When The user select the Network Selected drop down
 And The user click on the select All "<SelectAll>" option to check active networks are selected
 And The user select Network based on the "<SearchNetwork>" Search option
 And The user selects the network randomly "<RandomSelection>" from the Network Dropdown
 Then The user should be able to see the selected network feeds in the list
 Examples:
 |SelectAll|SearchNetwork|RandomSelection|
 |||LinkedIn,Facebook,Instagram|
 
 @rmp
 Scenario Outline: Access the Post Filter
 Given The user is on the Reputation Manager page
 When The user select the Post "<Post>" filter
 Then The user should be able to see the post based on filter
 Examples:
 |Post|
 |my post|

@rmp @test
Scenario Outline: Access the Emotions Filter
Given The user is on the Reputation Manager page
When The user select any one emotion "<Emotion>"
When The user select multiple emotions "<MultipleEmotion1>" and another emotion "<MultipleEmotion2>" 
When The user select all emotions "<SelectAll>"
Then The user should be able to see feeds based on the emotions selected
Examples:
|Emotion|MultipleEmotion1|MultipleEmotion2|SelectAll|
||Happy|Unhappy||

@rmp
Scenario Outline: Access the Date Filter
Given The user is on the Reputation Manager page
When The user select the "<DateFilter>" based on the need
Then user should be able to see the feeds based on the date filters
Examples:
|DateFilter|
|THIS WEEK|

@rmp @test
Scenario: Sync the feeds
Given The user is on the Reputation Manager page
When The user click on the synch feeds
Then The user should be able to see the feeds based on the filters given

@rmp
Scenario Outline: Responding to a selected Feed
Given The user is on the Reputation Manager page
When The user select the feed based on the Network "<NetworkName>" name and click on the respond button
Then The user should be able to see the respond popup
When The user click on the cancel button to cancel the pop up
When The user select the feed based on the Network "<NetworkName>" name and click on the respond button
When The user enter the text "<Text>" in the Text area and click on the post button
Then The user should be able to see the comment box above respond button
When The user click on the synch feeds
Then The user should be able to see the View Comment link
When The user click on the View Comment link
Then The user should be able to see the comment box above respond button
When The user click on the Hide comment the comment box should be closed
Examples:
|NetworkName|Text|
|Instagram|Good Comments|

@rmp
Scenario Outline: Share the post
Given The user is on the Reputation Manager page
When The user click on the share button based on the selected network "<Network>"
Then The user able to see the share pop up
When The user select the network "<NetworkShared>" to be shared
Then The user must be on the shared network page
When The user click on the Post button
Then The shared network page should be closed and user is on the Reputation Manager page
Examples:
|Network|NetworkShared|
|Instagram|Facebook|

@rmp
Scenario Outline: Access the Connect other accounts page
Given The user is on the Reputation Manager page
When The user click on the connect other accounts link
Then The user is on the Connect your accounts page
When The user mouse hover any "<Network>" and click on the remove account button
Then The user able to see the remove account pop up
When The user click on the NO button the pop up closes
When The user mouse hover any "<Network>" and click on the remove account button
Then The user able to see the remove account pop up
When The user click on the YES button the pop up closes
Then The user able to see the Connect button instead of Remove account on the tile selected "<Network>"
Examples:
|Network|
|Facebook|