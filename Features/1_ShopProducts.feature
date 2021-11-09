Feature: To test whether Tide Free and Gentle powder is there or not

  Scenario Outline: Checking Tide Free and Gentle powder there or not
    Given user loads home website
    When user hover on shop products from navigation bar
    Then user chooses powder from dropdown
    And verifies Tide Free and Gentle powder there in the list or not
