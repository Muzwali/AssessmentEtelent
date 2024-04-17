 Feature: Web Automation Task

   Scenario: Opening the Web Page
     Given User Opens the webSite
     And Verify the website

   Scenario Outline: Adding A user
     Given User click on the Add User Button
     And User Enter a Name "<Name>"
     And User Enter a LastName "<LastName>"
     And User Enter a UserName "<UserName>"
     And User Enter a Password "<Password>"
     And User Click on Customer Radio Button
     And User Enter a Email "<Email>"
     And User Enter a CellPhone "<CellPhone>"
     Then User Click on Save
   Examples:
     |Name|LastName|UserName|Email|CellPhone|Password|
     |Muzwali|Malindi|Muz123|Muz@gmail.com|079095342|muzmuz|

   Scenario: Validated Added User
     Given Validated added User



