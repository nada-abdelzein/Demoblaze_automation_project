Feature: FilterByCategories


  Scenario: user filter by mobile phone
    Given user navigated in home page
    When  user click on phones Category
    Then  products shoud be filtered with phone only

  Scenario: user filter by  laptops
    Given user navigated in home page
    When  user click on laptops Category
    Then  products shoud be filtered with laptop only

  Scenario: user filter by monitors
    Given user navigated in home page
    When  user click on monitors Category
    Then  products shoud be filtered with monitors only