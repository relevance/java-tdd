Lab #1 - TDD

You may use the unit testing framework of your choice for these exercises.

1. Write a set of unit tests for Largest.java
   (where handful >= 5)

2. TDD: Pizza
We're setting up a pizza shop. For each sentence (User Story),
write a test first, watch it fail, and then implement the feature.
We're trying to simulate a class that evolves over time, so
sometimes the next User Story will contradict the story you
just got done implementing. (Until we get better users, this
will be a business reality for the foreseeable future...)

1. We'll need a Pizza class
2. Pizzas can be "Small", "Medium", or "Large"
   (add a simple public constructor that accepts a string)
   (don't worry about limiting your choices, just validate that size gets populated)
   (simple strings are fine for the getter)
   (don't implement a setter -- size cannot be changed after the fact)
3. Make sure that only "Small", "Medium", and "Large" are allowed
   (make the default constructor private)
   (create three static factory methods -- Pizza.small(), etc.)
4. There should be an addTopping method that accepts a String.
   (accept any string for now, but use "pickles" for a test value)
5. getToppings() should return a comma-delimited string of toppings
   (test with at least three different toppings)
6. Now add a price to the pizza based on size.
   (no setter, again)
   (integers are fine)
   (Small = 10, Medium = 15, Large = 20)
7. Now adjust the price per topping. $1 per topping should
   suffice, unless you have some extra time in the lab and
   want to implement custom pricing per topping. 

3. TDD: Calculator
Write a set of tests for, and implement, a Calculator class. 
It should add, subtract, multiply, and divide. Make sure that you can
clear it and get the results at any point along the way.

Of course, let the unit tests drive your design.







