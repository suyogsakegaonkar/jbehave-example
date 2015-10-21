Narrative:
In order to quickly find out the sum of those two numbers
As a user
I want to use a calculator to add two numbers

Scenario:  Add two valid numbers

Given a calculator
When I divide <number1> by <number2>
Then the outcome should be <result>

Examples:
|number1|number2|result|
|10|10|1.0|
|10|2|5.0|
|10|20|0.5|
|0|0|undefined|
|5|0|undefined|
