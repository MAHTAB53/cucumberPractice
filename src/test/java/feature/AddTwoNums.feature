Feature: Add two numbers
 I want to add two numbers
 #@Test1
 #Scenario: Add two numbers scenario1
 #Given User enters two numbers
 #And add two numbers
 #Then Result is displayed
 
 @Test2
 Scenario Outline: Add two numbers scenario2
 Given User enters two numbers<fisrtnumber> <secondnumber>
 Then add two numbers and Result is displayed
 
 Examples:
 
 |fisrtnumber|secondnumber|
 |1|2|
 |2|3|
 |3|4|