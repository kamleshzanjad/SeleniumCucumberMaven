Feature: Test Tags and Hooks

  @SmokeTest @RegressionTest @OddTest
  Scenario: Print 1
    Given User is printing message 1

  @SmokeTest @RegressionTest @EvenTest
  Scenario: Print 2
    Given User is printing message 2

  @RegressionTest @OddTest
  Scenario: Print 3
    Given User is printing message 3

  @RegressionTest @EvenTest
  Scenario: Print 4
    Given User is printing message 4

  @OddTest
  Scenario: Print 5
    Given User is printing message 5

  @EvenTest
  Scenario: Print 6
    Given User is printing message 6
