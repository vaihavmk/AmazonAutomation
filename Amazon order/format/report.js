$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Vaibhav/eclipse-workspace/Amazon order/src/Feature/order.feature");
formatter.feature({
  "line": 1,
  "name": "Application Add to Kart",
  "description": "",
  "id": "application-add-to-kart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login into Application",
  "description": "",
  "id": "application-add-to-kart;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens the Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "user enters \"username\" and clicks on next",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user verfies that he/she has logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on search",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user searches for \"Nike bags\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Enter",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User scrolls down and clicks on the item",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Add to Kart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Item is added to Kart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Kart button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Orders",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_opens_the_Amazon()"
});
formatter.result({
  "duration": 28394410400,
  "status": "passed"
});
formatter.match({
  "location": "login.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 9719154500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "login.user_enters_and_clicks_on_next(String)"
});
formatter.result({
  "duration": 6664883100,
  "status": "passed"
});
formatter.match({
  "location": "login.user_verfies_that_he_she_has_logged_in()"
});
formatter.result({
  "duration": 882100800,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartTest.user_click_on_search()"
});
formatter.result({
  "duration": 5894486400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nike bags",
      "offset": 19
    }
  ],
  "location": "AddToCartTest.user_searches_for(String)"
});
formatter.result({
  "duration": 218390500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartTest.user_clicks_on_Enter()"
});
formatter.result({
  "duration": 10077674600,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartTest.user_scrolls_down_and_clicks_on_the_item()"
});
formatter.result({
  "duration": 2052950500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartTest.user_clicks_on_Add_to_Kart()"
});
formatter.result({
  "duration": 14164407700,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartTest.item_is_added_to_Kart()"
});
formatter.result({
  "duration": 374400,
  "status": "passed"
});
formatter.match({
  "location": "OrderTest.user_clicks_on_Kart_button()"
});
formatter.result({
  "duration": 3200568900,
  "status": "passed"
});
formatter.match({
  "location": "OrderTest.user_clicks_on_Orders()"
});
formatter.result({
  "duration": 1026506500,
  "status": "passed"
});
});