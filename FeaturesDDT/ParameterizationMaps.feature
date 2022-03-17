Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And Login user enters credential details info
      | Username   | Password |
      | mngr391441 | tAbAzej |
      | mngr391441 | tAbAzej |
    Then Message displayed Login Successfully

