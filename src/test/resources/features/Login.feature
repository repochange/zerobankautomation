@Test
Feature: Login
  Only authorized users should be able to login to the application. When
  user login with valid credentials, Account summary page should be displayed.
  Users with wrong username or wrong password should not be able to login.
  Users with blank username or password should also not be able to login. When
  user tries to login with invalid information, error message
  Login and/or password are wrong.should be displayed.

  @login_with_valid_credentials
  Scenario: Login into http://zero.webappsecurity.com/
    Given user is on the login page
    Then user logs in with valid credentials
    And user verifies that "Zero - Account Summary" page subtitle is displayed

  @login_negative_test
  Scenario Outline: Verify that warning message is displayed when credentials is not correct or blank, Login with <value>
    Given user is on the login page
    Then user enters "<username>" username and "<password>" password
    And user verifies that "Login and/or password are wrong." error message is displayed

    Examples:
      | username        | password    |value         |
      | username        | user        |wrong password|
      | user            | password    |wrong username|
      | username        |             |blank password|
      |                 | password    |blank username|