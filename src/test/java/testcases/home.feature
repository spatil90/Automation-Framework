Feature: Verify home page functionality

@home
Scenario: Verify count of links on home page
Given user launches "firefox" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/"
Then verify count of links is 41


Scenario Outline: Verify links on the home page are redirecting to resp. page when clicked
Given user launches "firefox" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "currenturl" with value as "https://the-internet.herokuapp.com/"
Then verify count of links is 41
Then click on "<link>"
Then verify page by "currenturl" with value as "<url>"


 Examples: 
      | link           | url                                               |
      | A/B Testing    | https://the-internet.herokuapp.com/abtest         |
      | Broken Images  |  https://the-internet.herokuapp.com/broken_images | 
