Feature: Verify multiple windows functionality

@mw
Scenario: Verify text from another window
Given user launches "chrome" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/"
Then click on "Multiple Windows"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/windows"
Then click on "Click Here" of multiple windows page
Then switch from current window to another with title as "New Window"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/windows/new"
Then verify text as "New Window"
Then switch from current window to another with title as "The Internet"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/windows"
And close the browser