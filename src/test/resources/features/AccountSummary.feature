@Test
Feature: Account summary
  Account summary page should have the title Zero –Account summary.
  Account summary page should have to following account types:
  Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts.
  Credit Accounts table must have columnsAccount, Credit Cardand Balance.

  Background: Open login page and login
    Given user is on the login page
    Then user logs in with valid credentials

  Scenario: Verify that account summary page has Zero –Account summary title
    Then user verifies that "Zero - Account Summary" page subtitle is displayed

  Scenario: Verify that account summary page has next account types and Account table columns are displayed
    Then verify that account types are displayed
     |Cash Accounts       |
     |Investment Accounts |
     |Credit Accounts     |
     |Loan Accounts       |
    And verify that Credit Accounts table columns are displayed
    |Account    |
    |Credit Card|
    |Balance    |



