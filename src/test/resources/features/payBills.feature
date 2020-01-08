@Test
Feature: Pay Bills
  Account Activity page should have the title Zero –Pay Bills. When
  user completes a successful Pay operation, The payment was successfully submitted. should be displayed.
  when user tries to make a payment without entering the amount or date,
  Please fill out this field message!should be displayed. Amount field should not accept
  alphabetical or special characters. Date field should not accept alphabetical characters.

  Background:
  Background: open login page, login and navigate to Pay Bills Tab
    Given user is on the login page
    Then user logs in with valid credentials
    Then navigate to "Pay Bills"

    Scenario: Account Activity page should have the title Zero – Pay Bills
      And Verify that Account Activity page Title has "Zero – Pay Bills" name

    Scenario:  when Pay operation is done confirmation message should be displayed.
      When user completes a successful Pay operation
      Then verify that confirmation message "The payment was successfully submitted." is displayed


    Scenario: Payment without entering the amount, should display error message.
      When user tries to make a payment without entering the amount
      Then verify that error message "Please fill out this field." is displayed in amountBox

    Scenario: Payment without entering the date, should display error message.
      When user tries to make a payment without entering the date
      Then verify that error message "Please fill out this field." is displayed in DateBox



    Scenario: Amount field should not accept alphabetical or special characters.
      Then verify that Amount field does not accept alphabetical or special characters


    Scenario: Date field should not accept alphabetical characters.
      Then verify that Date field does not accept alphabetical characters



