Feature: Verify home page functionality

Scenario: Verify count of links on home page
Given user launches "chrome" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "current_url" with value as "https://the-internet.herokuapp.com/"
Then verify count of links is 41
Then close the browser

Scenario Outline: Verify links on the home page are redirecting to resp. page when clicked
Given user launches "internetexplorer" browser and hits the url "https://the-internet.herokuapp.com/"
Then verify page by "current_url" with value as "https://the-internet.herokuapp.com/"
Then verify count of links is 41
Then click on "<link>"
Then verify page by "current_url" with value as "<url>"
And close the browser

 Examples: 
      | link           | url                                               |
      | A/B Testing    | https://the-internet.herokuapp.com/abtest         |
      | Broken Images  |  https://the-internet.herokuapp.com/broken_images | 
