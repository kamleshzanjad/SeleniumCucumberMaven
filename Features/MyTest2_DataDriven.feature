
Feature: Reset functionality on login page of Application
  Scenario Outline: Verification of reset button with numbers of credential

    Given Open2 the Firefox and launch the application

    When Enter the UserId <username> and Password <password>

    Then Reset2 the credential

    Examples:

      | username | password  |

      | User1    | password1 |

      | User2    | password2 |

      | User3    | password3 |

