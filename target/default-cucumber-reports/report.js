$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/accountActivity.feature");
formatter.feature({
  "name": "Account Activity",
  "description": "  Account Activity page should have the title Zero –Account activity.\n  In the Account drop down default option should be Savings.\n  Account drop down should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.\n  Transactions table should have column names Date, Description, Deposit, Withdrawal.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.background({
  "name": "open login page, login and navigate to Account Activity Tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityStepDefinitions.navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that default option In the Account drop down is Savings and",
  "description": "  drop down should have options",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@1"
    }
  ]
});
formatter.step({
  "name": "verify that default dropdown value is \"Savings\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityStepDefinitions.verify_that_default_dropdown_value_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that dropdown has next options",
  "rows": [
    {
      "cells": [
        "Savings"
      ]
    },
    {
      "cells": [
        "Checking"
      ]
    },
    {
      "cells": [
        "Loan"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Brokerage"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityStepDefinitions.verify_that_dropdown_has_next_options(String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat com.zerobank.pages.AccountActivityPage.verifyAccountDropdownOptions(AccountActivityPage.java:54)\r\n\tat com.zerobank.step_definitions.AccountActivityStepDefinitions.verify_that_dropdown_has_next_options(AccountActivityStepDefinitions.java:28)\r\n\tat ✽.verify that dropdown has next options(file:src/test/resources/features/accountActivity.feature:19)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});