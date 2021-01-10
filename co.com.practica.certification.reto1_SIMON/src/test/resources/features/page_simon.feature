#Author: wilson
#Language: en

Feature: To create an user in the application SIMON and verified its creation
  As a web user
  I want to do a new register on the page Simon
  To be able do things on the page

  @E2ETest
  Scenario Outline: create user in the system SIMON
    Given that "wilson" wants to join in the aplication SIMON
    When he fills the form in <Personal_Type>, <Document_Type>, <Number>, <Name>, <Last_Name>, <Sex>, <BirthDay>, <Password> and
    And he acepted the politics
    Then the system shows him a new message

    Examples:
  |Personal_Type      |Document_Type  |Number   |Name     |Last_Name  |Sex   |BirthDay     |Password        |
  |"Persona Natural"  |  "Cedula"     |"8064623"|"wilson" |"Bedoya"   |"M"   |"11-06-1985" |"12345Colombia" |