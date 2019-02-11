Feature: Create Lead
Scenario: Create lead successful
Given open leaftaps browser
And Enter the user name DemoSalesManager
And Enter the password crmsfa
And Click on the login Button
And Create lead link
And type companny name TestLeaf
And type first name Allan
And type last name David
When Create Lead
Then Create lead is successful


