Feature: As a registered user
  I want to be able to login into the platform
  so that I can use it according to my credentials

  Background:
    Given an user is navigated to ABTasty log in page

  Scenario Outline: The default error message is displayed after user sign in with invalid email/password
    When the user enters "<email>" in the email field
    And the user enters "<password>" in the password field
    And the user clicks on the Sing in button
    Then  message "Please enter a valid email or password" is displayed
    Examples:
      | email           | password     |
      | abc@abtasty.com | 123456789123 |

  Scenario Outline: The Login Captcha is displayed after 3 wrong user's attempts to sign in with invalid email/password
    When the user enters "<email>" in the email field
    And the user enters "<password>" in the password field
    And the user clicks on the Sing in button
    And the user clicks on the Sing in button
    And the user clicks on the Sing in button
    Then the login Captcha is displayed
    Examples:
      | email            | password     |
      | 1234@abtasty.com | 112233445566 |

  Scenario: The user can login using the SSO login link below
    When the user click on the Sign in with SSO button
    Then logo "Sign in with SSO" is displayed
    And email field is enable
    And Sing in button is enable



