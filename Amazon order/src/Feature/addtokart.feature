Feature: Application Add to Kart
Scenario: Login into Application
Given user opens the Amazon
And user clicks on Login button
Then user enters "username" and clicks on next

Then user verfies that he/she has logged in
Then user click on search 
Then user searches for "Nike bags"
And User clicks on Enter
Then User scrolls down and clicks on the item
Then User clicks on Add to Kart
Then Item is added to Kart