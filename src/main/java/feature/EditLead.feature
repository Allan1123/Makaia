Feature: Edit Lead
Scenario Outline:Edit Lead
When Click lead link
And Click Find Lead link
And typeFirstName <sName>
And Click on Find leads
And ClickFirstRecord
And ClickOnEditLead
And clear Company Name
And type Company Name <sComp>
And Click on Update Btn
When Verify Company Name <sComp>

Examples:
|username|password|sName|sComp|
|Demosalesmanager|crmsfa|Allan|SG|

