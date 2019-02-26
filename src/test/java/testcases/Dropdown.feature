Feature: Select from dropdown list

@dd
Scenario: Select multiple options from dropdown
Given user launches "chrome" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/"
Then click on "Dropdown"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/dropdown"
Then select "1" element located by "value"
Then select "2" element located by "index"
Then select "Option 1" element located by "text" 