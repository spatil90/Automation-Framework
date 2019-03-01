Feature: Verify alert handling

@alert
Scenario: Verify text on alert
Given user launches "chrome" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/"
Then click on "JavaScript Alerts"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/javascript_alerts"
Then click on button "Click for JS Alert" 
And then "accept" the javascript alert pop up
Then click on button "Click for JS Confirm" 
And then "dismiss" the javascript alert pop up
Then click on button "Click for JS Prompt" 
And pass "Snehal" in alert text box
And then "accept" the javascript alert pop up
Then verify text "Snehal" in Result