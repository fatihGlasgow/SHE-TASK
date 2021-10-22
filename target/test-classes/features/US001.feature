@US_001
Feature:Add a new record and another record ,and then delete the first record

  Scenario:TC01-User should add a new Record
    Given User is on the application_login page with the LoginPage_URL
    When User enters the UserName on the login page
    And User enters the UserPassword on the login page
    And User clicks the Login_button on the login page
    And User clicks the Modules_button on the Home page
    And User hovers over the Environment
    And User hovers over and clicks the Air_Emissions
    When User clicks New_Record_button on the Air_Emissions page
    And User fills in the Sample_Date field with "10102020"
    And User fills in the Description field with "The First SHE software description should not be seen"
    And User clicks Save&Close_button
    And User is on the AIR_Emissions Page
    When User clicks New_Record_button on the Air_Emissions page
    And User fills in the Sample_Date field with "20022020"
    And User fills in the Description field with "The Second SHE software description seen"
    And User clicks Save&Close_button
    When User clicks Manage_Record of the First Record on the Air_Emissions page
    And  User selects and clicks the delete button
    Then User verifies the First Record has been deleted
    And User clicks Log_out button


