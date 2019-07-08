@Run
Feature: EPL-Betting
  #Football betting features

  Scenario: As a WH Customer I want the ability to place a bet on a English Premier League event
    Given that i am on the sports.williamhill.com/sr-admin-set-white-list-cookie.html website
    When I click on login page
    And I log on with my userid "WHITA_sbhat" and password "westm1nster"
    Then navigate to a Premiership football event
    When I click on select betting value
    And under Bet slip I put "0.05" pound
    Then total Stake and return is calculated