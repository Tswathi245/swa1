Feature: search product
  Scenario Outline:search product
    When i click on the Signinbutton
    When the user enter "<username>" in the user fields 
    Then enter the "<password>" in the password field
    And click on the login button
    Then user click on the "<product>" in the search field
    Then page  goes to product page

    Examples: 
      | username  |   password     | product|
      | Lalitha   |   Password123  |  head  | 
    
 