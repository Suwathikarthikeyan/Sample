Feature: This feature is to test login functionalities.

Scenario: This scenario is to test login with valid credential.
	Given Launch the browser and load the Url
	When Provide valid username and password hit login
	Then Validate if the user logged in successfully.
	
Scenario: This Scenario is to select the hotel.
    Given Select location,hotel,room type,no of rooms.
    When Provide checkin date,checkout date,adult count and child count hit search
    Then validate hotel available or not
    
 Scenario: This Scenario is to select the radio button.
    Given Select radio button
    When  select continue
    Then   validate Hotel selected
    
 Scenario: This Scenario is to Book Hotel.
    Given Enter firstName,LastName,Billing Address,credit card No.
    When  Select card Type,Expire date and CVV Number
    Then Validate the order ID.