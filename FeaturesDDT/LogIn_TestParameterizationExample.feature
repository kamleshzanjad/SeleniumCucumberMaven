Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters both username "<username>" and password "<password>"
    Then Message displayed Login Successfully


    Examples:
      | username   | password |
      | mngr391441 | tAbAzej  |
      | mngr391441 | tAbAzej  |