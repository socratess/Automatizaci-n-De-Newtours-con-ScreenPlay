#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Newtours Page
  as a Web user
  I want to register in the newtours page
  to reserve a flight

  @tag2
  Scenario Outline: values to Register page from newtours
    Given that soc wants to enter values in Register page
    When he enter the dates
      | firstName   | lastName   | phone   | userName   | address1   | address2   | city   | state   | postalCode   | country   | email   | password   |
      | <firstName> | <lastName> | <phone> | <userName> | <address1> | <address2> | <city> | <state> | <postalCode> | <country> | <email> | <password> |
    Then he should see a new pages "<status>"

    Examples: 
      | firstName | lastName | phone   | userName        | address1    | address2   | city     | state | postalCode | country | email | password | status   |
      | Dwights   | Wades    | 2222222 | DWs@hotmail.com | calles 54   | carrera 78 | Medellin | LA    |       0456 |      43 | dw    | 456dw    | SIGN-OFF |
      | Rajons    | walls    | 3333333 | RWs@hotmail.com | carreras 66 | avenida 87 | Cali     | HO    |       0345 |     134 | rw    | 123rw    | SIGN-OFF |
