Feature:
  Scenario Outline: user enter with valid data
    Given user navigated in login page
    When user enter valid "<username>" and valid "<password>"
    Then Welcome message apper to user in home page
Examples:
  |username | password |
  | fady123 | 123      |
  | fady123 | 12       |
  | nada    | 123      |
  | nada    | 12       |
#  Scenario: user enter with invalid data
#    Given user navigated in login page
#    When user enter invalid username and invalid password
#    Then Error message apper and say wrong username and wrong password