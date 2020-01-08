@Test
Feature: Account Activity
  Account Activity page should have the title Zero –Account activity.
  In the Account drop down default option should be Savings.
  Account drop down should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.
  Transactions table should have column names Date, Description, Deposit, Withdrawal.

  Background: open login page, login and navigate to Account Activity Tab
    Given user is on the login page
    Then user logs in with valid credentials
    Then navigate to "Account Activity"

  Scenario: Account Activity page should have the title Zero – Account activity.
    And Verify that Account Activity page Title has "Zero – Account activity" name
@1
  Scenario: Verify that default option In the Account drop down is Savings and
  drop down should have options
    And verify that default dropdown value is "Savings"
    And verify that dropdown has next options
    |Savings    |
    |Checking   |
    |Loan       |
    |Credit Card|
    |Brokerage  |


   Scenario: Transactions table should have column names Date, Description, Deposit, Withdrawal
     And Verify that Transactions table has following columns
     |Date       |
     |Description|
     |Deposit    |
     |Withdrawal |
