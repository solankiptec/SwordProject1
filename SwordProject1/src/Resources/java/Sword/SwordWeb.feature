@sword
  Feature: search successfully

    Background: search
      Given I am on homepage

      Scenario Outline: User should able to search successfully
        When I enter valid "<search>" in search box
        Then I should able to search successfully

        Examples:
        |    search     |
        |risk management|
        |   leverage    |
        | compatibility |