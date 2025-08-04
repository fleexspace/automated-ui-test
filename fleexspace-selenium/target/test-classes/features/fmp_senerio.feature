Feature: Google Search

  Scenario: Search with keyword
    Given I open Google
    When I search for "Selenium WebDriver"
    Then the title should contain "Selenium WebDriver"
