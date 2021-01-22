@all
Feature: Select Women Dress

  Background: 
    Given User land on "automationpractice"

  @dressSelection
  Scenario Outline: Woman summer Dress
    When User hovers over online "<Shopping Category>"
    And User select "<Dress Type>"
    When User hover over "<Dress To Buy>"
    When User click over quick view element
    When User selects "<Size>"
    When User click Add to Cart
    When User click continue shopping
    When User hover over Cart
    When User click checkout button
    When User click Proceed to Checkout
    When User enter email to register
    When User click create account button
    When User enter mandatory details
      | First Name | Last Name | Password | FirstNameAddress | LastNameAddress | Street    | City    | State  | ZipCode | Mobile   |
      | Automation | lastname  | Pass123  | Auto             | lastAddress     | StreeName | Unknown | Kansas |   00000 | 38748234 |
    When User Proceed to Shipping page
    Then User verify selection "<Dress To Buy>"
    When User confirm order

    Examples: 
      | Shopping Category | Dress Type     | Dress To Buy         | Size | 
      | WOMEN             | Summer Dresses | Printed Summer Dress | S    | 
