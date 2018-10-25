#Author: socratespalaciosmoreno@gmail.com
@tag
Feature: Newtours Page
  as a Web user
  I want to log in newtours page
  to reserve a flight

  @tag1
  Scenario Outline: values to Login page from newtours
    Given that soc wants to enter values in Log-In page
    When he enter the and in the newtours page
      | userName   | password   |
      | <userName> | <password> |
    Then he should see a new pages "<status>"
       
       
       
    Examples: 
      | userName   | password | status   |
      | spalaciosm |     1234 | SIGN-OFF |
      | dwight     | 39ki     | SIGN-OFF |
      | lebron     | djs7     | SIGN-OFF |
