
@tag
Feature: Registration
  I want to use this template for my feature file

  
  Scenario: Register to testMeapp
    Given user opens the TestMeapp
    And click on signUp
    When user enters the user name "samABC"in the usename field
    And user enters the firstName "samABC"
    And user enters the lastName "john"
    And user enters the password "sam123"
    And user enters the confirmmpassword "sam123"
    When user selects the gender
     And user enters the email "tswati245@gmail.com"
     And user enters the mobno "7654389998"
     When user selects the DOB "01/10/1998"
     And user enters the Address "7/14 new street"
     When user selects the security question
     And user enters answer "chennai"
    Then user click the register button
   
