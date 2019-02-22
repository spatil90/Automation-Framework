Feature: Verify Hello world text on Dynamic Loading page

@dynamicloading
Scenario: Verify text on dynamic loading screen
Given user launches "chrome" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/"
Then click on "Dynamic Loading"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/dynamic_loading"
Then click on "Example 1: Element on page that is hidden" of Dynamic loading page
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/dynamic_loading/1"
Then click on "Start" button
Then verify text as "Hello World!" from example of dynamic loading
