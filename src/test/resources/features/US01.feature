Feature:US_001_ Add a new  record, and then delete the record
  Background: Given User is on the application_login page with the "URL"

  Scenario:TC01-User should add a new Record

    When User enters the "UserName" on the login page
    And User enters the "UserPassword" on the login page
    And User clicks the .... button on the login page
    And User navigates to Air_Emisions_page
    And User clicks New_Record_button
    And User fills in the Sample_Date field
    And User fills in  the Description field
    And User clicks Save button
    And User clicks Close button

    Scenario: TC02-User add another Record


      Scenario: TC03-User delete the first Record
        Then User verifies the First Record has been deleted
        And User clicks Log_out button


