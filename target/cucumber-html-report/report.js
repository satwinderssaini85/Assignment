$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DressSelection.feature");
formatter.feature({
  "line": 2,
  "name": "Select Women Dress",
  "description": "",
  "id": "select-women-dress",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Woman summer Dress",
  "description": "",
  "id": "select-women-dress;woman-summer-dress",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@dressSelection"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User hovers over online \"\u003cShopping Category\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User select \"\u003cDress Type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User hover over \"\u003cDress To Buy\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click over quick view element",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects \"\u003cSize\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click Add to Cart",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click continue shopping",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User hover over Cart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User click Proceed to Checkout",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enter email to register",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User click create account button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enter mandatory details",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Password",
        "FirstNameAddress",
        "LastNameAddress",
        "Street",
        "City",
        "State",
        "ZipCode",
        "Mobile"
      ],
      "line": 22
    },
    {
      "cells": [
        "Automation",
        "lastname",
        "Pass123",
        "Auto",
        "lastAddress",
        "StreeName",
        "Unknown",
        "Kansas",
        "00000",
        "38748234"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User Proceed to Shipping page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User verify selection \"\u003cDress To Buy\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User confirm order",
  "keyword": "When "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "select-women-dress;woman-summer-dress;",
  "rows": [
    {
      "cells": [
        "Shopping Category",
        "Dress Type",
        "Dress To Buy",
        "Size"
      ],
      "line": 29,
      "id": "select-women-dress;woman-summer-dress;;1"
    },
    {
      "cells": [
        "WOMEN",
        "Summer Dresses",
        "Printed Summer Dress",
        "S"
      ],
      "line": 30,
      "id": "select-women-dress;woman-summer-dress;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3758384900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User land on \"automationpractice\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "automationpractice",
      "offset": 14
    }
  ],
  "location": "CommonStepdefinition.user_land_on(String)"
});
formatter.result({
  "duration": 4581995000,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Woman summer Dress",
  "description": "",
  "id": "select-women-dress;woman-summer-dress;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@dressSelection"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User hovers over online \"WOMEN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User select \"Summer Dresses\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User hover over \"Printed Summer Dress\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click over quick view element",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects \"S\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click Add to Cart",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click continue shopping",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User hover over Cart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User click Proceed to Checkout",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enter email to register",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User click create account button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enter mandatory details",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Password",
        "FirstNameAddress",
        "LastNameAddress",
        "Street",
        "City",
        "State",
        "ZipCode",
        "Mobile"
      ],
      "line": 22
    },
    {
      "cells": [
        "Automation",
        "lastname",
        "Pass123",
        "Auto",
        "lastAddress",
        "StreeName",
        "Unknown",
        "Kansas",
        "00000",
        "38748234"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User Proceed to Shipping page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User verify selection \"Printed Summer Dress\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User confirm order",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "WOMEN",
      "offset": 25
    }
  ],
  "location": "LandingPageStepDefs.user_hovers_over_online(String)"
});
formatter.result({
  "duration": 172149300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Summer Dresses",
      "offset": 13
    }
  ],
  "location": "LandingPageStepDefs.user_select(String)"
});
formatter.result({
  "duration": 933508100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 17
    }
  ],
  "location": "SummerDressPageStepDefs.user_hover_over(String)"
});
formatter.result({
  "duration": 162728500,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressPageStepDefs.user_click_over_quick_view_element()"
});
formatter.result({
  "duration": 73417700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S",
      "offset": 14
    }
  ],
  "location": "SummerDressPageStepDefs.user_selects(String)"
});
formatter.result({
  "duration": 1196965400,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressPageStepDefs.user_click_Add_to_Cart()"
});
formatter.result({
  "duration": 84968900,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressPageStepDefs.user_click_continue_shopping()"
});
formatter.result({
  "duration": 1679631900,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageStepDefs.user_hover_over_Cart()"
});
formatter.result({
  "duration": 161152200,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageStepDefs.user_click_checkout_button()"
});
formatter.result({
  "duration": 1312888900,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageStepDefs.user_click_Proceed_to_Checkout()"
});
formatter.result({
  "duration": 1184674900,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageStepDefs.user_enter_email_to_register()"
});
formatter.result({
  "duration": 119686000,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageStepDefs.user_click_create_account_button()"
});
formatter.result({
  "duration": 64021000,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageStepDefs.user_enter_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 4239111800,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageStepDefs.user_Proceed_to_Shipping_page()"
});
formatter.result({
  "duration": 1547886300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 23
    }
  ],
  "location": "CheckOutPageStepDefs.user_verify_selection(String)"
});
formatter.result({
  "duration": 36818600,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageStepDefs.user_confirm_order()"
});
formatter.result({
  "duration": 1678113900,
  "status": "passed"
});
formatter.after({
  "duration": 604985200,
  "status": "passed"
});
});