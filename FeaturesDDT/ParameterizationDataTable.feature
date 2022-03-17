Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | mngr391441 | tAbAzej |
    Then Message displayed Login Successfully