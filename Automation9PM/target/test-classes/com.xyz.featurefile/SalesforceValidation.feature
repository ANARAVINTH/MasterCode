Feature: To Validate the login page of salesforce

  @PerformaceTest
  Scenario: To validate the error message
    Given User Navigates to the salesforce
   # When User Enter the us "learn more" and pw "abc"
   # And User clicks the login button
   # Then Validate the error message

    @SmokeTest123
  Scenario: valid login
    Given User Navigates to the salesforce
    When User Enter the us "Aravinth" and pw "abc"
    And User clicks the login button
    Then user navigate to homepage

     @RegressionTest @SmokeTest
 Scenario Outline: Multiple user
   Given User Navigates to the salesforce
   When User Enter the us "<UserName>" and pw "<Password>"
   And User clicks the login button
   Then user navigate to homepage
   Examples:
   |UserName|Password|
   |  Sonica      |   123     |
   |   Mahesh           |     abc      |
   |        silvia            |     jwj         |


  @staticdrop
   Scenario:  Iterate the value from the dropdown
     Given  User naviagte to URL
     When User Reterives the values from dropdown

   @AutoDropdown
   Scenario:  Iterate the value from the Auto suggestive dropdown
     Given  User naviagte to URL
     When User selects the value from the dropdown

    @SetPratice
    Scenario:  Hyper
      Given  User naviagte to URL
      When handle it


