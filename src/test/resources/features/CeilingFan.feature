Feature: What is the Ceiling Fan Setting?
  Scenario: Ceiling Fan is Off or On
    Given Ceiling Fan is Off
    When I Pull Speed Cord
    Then Ceiling Fan should be on

    Scenario: Ceiling fan direction
      Given Ceiling Fan should be going forward
      When I pull Reverse Cord
      Then Ceiling Fan should be going reverse