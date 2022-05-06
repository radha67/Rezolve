@all
Feature: Trigger functionality

  Background: SignIn or Create
    Given user is on Welcome to the Rezolve Experience Platform page
    When user click on Sign-In link
    And login with valid credentials

  @location
  Scenario: Trigger with Locations
    When User click "Location"
    Then user can see "Place your Location Fences"

  @image
  Scenario: Trigger with Image
    When User click "Image"
    Then user can see "Create your Image Trigger"
    And Browse for images button enabled

  @audio
  Scenario: Trigger with Audio
    When User click "Audio"
    Then user can see "Create your Audio Trigger"
    And Browse for audio files button enabled

  @beacon
  Scenario: Trigger with Beacon
    Given User is on Create an Engagement page
    When User click "Audio"
    Then user can see "Beacon Trigger"

  @link
  Scenario: Trigger with Link
    Given User is on Create an Engagement page
    When User click "Audio"
    Then user can see "Link Trigger"
