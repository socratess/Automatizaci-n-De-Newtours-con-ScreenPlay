#Author: socratespalaciosmoreno@gmail.com
#en este apartado se tiene el feature del registrar donde se describe en forma de negocio lo que se desea hacer
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
