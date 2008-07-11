Lab #2 - Refactoring

You have inheritedless-than-great Pizza and Order code, without tests. Before you 
use any method, write tests to demonstrate that you understand how the method works.

Perform these refactorings:

1. Extract topping into a Topping class.

2. Create a StandardToppings class.

3. Fix the abomination that is the Order class.
   Create appropriate fields and methods
   Move "main"-based testing into a unit test
   Use BigDecimal for tax and total

4. Add an expected duration for the order
- Our oven can bake up to 5 pizzas at once
(for the sake of simplicity, we work on one order at a time...)
- Larges take 30 minutes, Mediums 25, Smalls 15
- For each non-standard topping, add 2 minutes 

Optional. Make the Pizza and Order class more realistic, based on your 
own life experiences with Pizza.
