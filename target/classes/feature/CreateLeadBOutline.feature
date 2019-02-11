@SmokeTest
Feature: Create Lead
Scenario Outline: Create lead successful
And Click lead link
And Click Create Lead link
And type companny name <Companyname>
And type first name <firstname>
And type last name <lastname>
When Create Lead
#Then Create lead is successful

Examples:
|username|password|Companyname|firstname|lastname|
|Demosalesmanager|crmsfa|TestLeaf|Allan122|David|
|Demosalesmanager|crmsfa|TestLeaf|mani|m|
