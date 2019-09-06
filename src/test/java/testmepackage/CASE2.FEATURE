
Feature: Registered user
  registered user logins
  Scenario Outline: Registered user
    When i click on the Signin button
    When the user enter "<username>" in the user field
    Then enters the "<password>" in the password field
    Then clicks on the login button

    Examples: 
      | username  |   password     |
      | Lalitha   |   Password123  |
    
